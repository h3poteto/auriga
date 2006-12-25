// $Id: timer.c,v 1.8 2003/07/09 03:56:29 lemit Exp $
// original : core.c 2003/02/26 18:03:12 Rev 1.7

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/types.h>
#ifdef _WIN32
#include <winsock.h>
#else
#include <sys/socket.h>
#include <sys/time.h>
#endif

#include "timer.h"
#include "malloc.h"

#ifdef MEMWATCH
#include "memwatch.h"
#endif

// タイマー間隔の最小値。モンスターの大量召還時、多数のクライアント接続時に
// サーバーが反応しなくなる場合は、TIMER_MIN_INTERVAL を増やしてください。

// If the server shows no reaction when processing thousands of monsters
// or connected by many clients, please increase TIMER_MIN_INTERVAL.
#define TIMER_MIN_INTERVAL 50
#define TIMER_MAX_INTERVAL 500

static struct TimerData* timer_data;
static int timer_data_max,timer_data_num;
static int* free_timer_list;
static int free_timer_list_max, free_timer_list_pos;

static int timer_heap_max;
static int* timer_heap = NULL;

// for debug
struct timer_func_list {
	int (*func)(int,unsigned int,int,int);
	struct timer_func_list* next;
	char name[4];
};
static struct timer_func_list* tfl_root=NULL;

//
int add_timer_func_list(int (*func)(int,unsigned int,int,int),char* name)
{
	struct timer_func_list* tfl;

	tfl = (struct timer_func_list*)aCalloc(1,sizeof(*tfl) + strlen(name)+1);
	tfl->next = tfl_root;
	tfl->func = func;
	strncpy(tfl->name,name,strlen(name)+1);
	tfl_root = tfl;

	return 0;
}

char* search_timer_func_list(int (*func)(int,unsigned int,int,int))
{
	struct timer_func_list* tfl;
	for(tfl = tfl_root;tfl;tfl = tfl->next) {
		if (func == tfl->func)
			return tfl->name;
	}
	return "???";
}

/*----------------------------
 * 	Get tick time
 *----------------------------*/

static unsigned int gettick_cache;
static int gettick_count;
unsigned int gettick_nocache(void)
{
#ifdef _WIN32
	gettick_count = 256;
	return gettick_cache = GetTickCount();
#else
	struct timeval tval;
	gettimeofday(&tval,NULL);
	gettick_count = 256;
	return gettick_cache = tval.tv_sec * 1000 + tval.tv_usec/1000;
#endif
}

unsigned int gettick(void)
{
	gettick_count--;
	if (gettick_count<0)
		return gettick_nocache();
	return gettick_cache;
}

/*====================================== 
 * 	CORE : Timer Heap
 *--------------------------------------
 */

#if 0

// デバッグ用関数群
static void dump_timer_heap(void) {
	int j;
	for(j = 1 ; j <= timer_heap[0] ; j++) {
		if(j != timer_heap[0] && DIFF_TICK(
			timer_data[timer_heap[j]].tick,
			timer_data[timer_heap[j + 1]].tick
		) < 0) {
			printf("*");
		} else {
			printf(" ");
		}
		printf("%d : %d %d\n",j,timer_heap[j],timer_data[timer_heap[j]].tick);
	}
}

static void check_timer_heap(void) {
	int i;
	for(i = 1 ; i < timer_heap[0] ; i++) {
		if(DIFF_TICK(timer_data[timer_heap[i]].tick,timer_data[timer_heap[i + 1]].tick) < 0) {
			printf("Timer Heap Sort Error\n");
			dump_timer_heap();
			exit(1);
		}
	}
}

#endif

static void push_timer_heap(int index)
{
	if (timer_heap == NULL || timer_heap[0] + 1 >= timer_heap_max) {
		int first = timer_heap == NULL;

		timer_heap_max += 256;
		timer_heap = (int*)aRealloc(timer_heap, sizeof(int) * timer_heap_max);
		memset(timer_heap + (timer_heap_max - 256), 0, sizeof(int) * 256);
		if (first)
			timer_heap[0] = 0;
	}

	// timer_heap[0]   : タイマーヒープの数
	// timer_heap[1..] : タイマーヒープ（大　→　小）
	if(timer_heap[0] == 0) {
		// データが無い : 先頭に追加
		timer_heap[0]++;
		timer_heap[1] = index;
	} else if(DIFF_TICK(timer_data[timer_heap[timer_heap[0]]].tick,timer_data[index].tick) > 0) {
		// 最後尾に追加
		timer_heap[++timer_heap[0]] = index;
	} else if(DIFF_TICK(timer_data[timer_heap[1]].tick,timer_data[index].tick) < 0) {
		// 先頭に追加
		memmove(&timer_heap[2],&timer_heap[1],timer_heap[0] * sizeof(int));
		timer_heap[0]++;
		timer_heap[1] = index;
	} else {
		int min = 1;
		int max = timer_heap[0] + 1;
		while(max != min + 1) {
			int mid = (min + max)/2;
			if(DIFF_TICK(timer_data[index].tick,timer_data[timer_heap[mid]].tick) > 0) {
				max = mid;
			} else {
				min = mid;
			}
		}
		memmove(&timer_heap[min+2],&timer_heap[min+1],(timer_heap[0] - min) * sizeof(int));
		timer_heap[min+1] = index;
		timer_heap[0]++;
	}
	// check_timer_heap();
}

// 指定したindex を持つタイマーヒープを返す
static int search_timer_heap(int index)
{
	if (timer_heap == NULL || timer_heap[0] <= 0) {
		return -1;
	} else {
		int min = 1;
		int max = timer_heap[0] + 1;
		while(max != min + 1) {
			int mid = (min + max)/2;
			if(DIFF_TICK(timer_data[index].tick,timer_data[timer_heap[mid]].tick) > 0) {
				max = mid;
			} else {
				min = mid;
			}
		}
		if(timer_heap[min] == index) {
			return min;
		} else {
			int pos = min - 1;
			while(pos > 0 && timer_data[index].tick == timer_data[timer_heap[pos]].tick) {
				if(timer_heap[pos] == index) {
					return pos;
				}
				pos--;
			}
			pos = min + 1;
			while(pos <= timer_heap[0] && timer_data[index].tick == timer_data[timer_heap[pos]].tick) {
				if(timer_heap[pos] == index) {
					return pos;
				}
				pos++;
			}
			printf("search_timer_heap : can't find tid:%d\n",index);
			return -1;
		}
	}
}

static void delete_timer_heap(int index) {
	int pos = search_timer_heap(index);
	if(pos != -1) {
		memmove(&timer_heap[pos],&timer_heap[pos+1],(timer_heap[0] - pos) * sizeof(int));
		timer_heap[0]--;
	}
}

static int top_timer_heap(void)
{
	if (timer_heap == NULL || timer_heap[0] <= 0)
		return -1;

	// tick が 0xFFFFFFFF -> 0x00000000 に繰り上がる時の暫定対策
	// temporary fix for timer not working 49.7 days period
	if( gettick() < 0x08000000 ) {
		unsigned int tick = timer_data[ timer_heap[1] ].tick;
		if( tick == 0 || tick > 0xF8000000 ) {
			timer_data[ timer_heap[1] ].tick = 0;
			return 1;
		}
	}
	return timer_heap[0];
}

static void pop_timer_heap(int i)
{
	if (timer_heap == NULL || timer_heap[0] <= 0)
		return ;

	if( i != timer_heap[0]) {
		memmove( &timer_heap[i], &timer_heap[i + 1], (timer_heap[0] - i) * sizeof(int) );
	}
	timer_heap[0]--;
}

int add_timer_sub(unsigned int tick,int (*func)(int,unsigned int,int,int),int id,int data,unsigned short flag)
{
	struct TimerData* td;
	int i;
	if (free_timer_list_pos) {
		do {
			i = free_timer_list[--free_timer_list_pos];
		} while(i >= timer_data_num && free_timer_list_pos > 0);
	} else
		i = timer_data_num;
	if (i >= timer_data_num)
		for (i = timer_data_num;i<timer_data_max && timer_data[i].type; i++);
	if (i >= timer_data_num && i >= timer_data_max) {
		int j;
		if (timer_data_max == 0) {
			timer_data_max = 256;
			timer_data = (struct TimerData*)aCalloc(timer_data_max,sizeof(struct TimerData));
			//timer_data[0] = NULL;
		} else {
			timer_data_max += 256;
			timer_data = (struct TimerData*)aRealloc(timer_data,sizeof(struct TimerData) * timer_data_max);
			memset(timer_data + (timer_data_max - 256), 0,
				sizeof(struct TimerData) * 256);
		}
		for(j = timer_data_max-256;j<timer_data_max; j++)
			timer_data[j].type = 0;
	}
	td = &timer_data[i];
	td->tick = tick;
	td->func = func;
	td->id = id;
	td->data = data;
	td->type = TIMER_ONCE_AUTODEL;
	td->interval = 1000;
	td->free_flag = flag;
	push_timer_heap(i);
	if (i >= timer_data_num)
		timer_data_num = i + 1;
	return i;
}

int add_timer_interval(unsigned int tick,int (*func)(int,unsigned int,int,int),int id,int data,int interval)
{
	int tid;
	tid = add_timer(tick,func,id,data);
	timer_data[tid].type = TIMER_INTERVAL;
	timer_data[tid].interval = interval;
	return tid;
}

int delete_timer(int id,int (*func)(int,unsigned int,int,int))
{
	if (id <= 0 || id >= timer_data_num) {
		printf("delete_timer error : no such timer %d\n", id);
		return -1;
	}
	if (timer_data[id].func != func) {
		printf("delete_timer error : function dismatch %08x(%s) != %08x(%s)\n",
			 (int)timer_data[id].func,
				search_timer_func_list(timer_data[id].func),
			 (int)func,
				search_timer_func_list(func));
		return -2;
	}
	// そのうち消えるにまかせる
	timer_data[id].func = NULL;
	timer_data[id].type = TIMER_ONCE_AUTODEL;
	// timer_data[id].tick -= 60 * 60 * 1000;
	return 0;
}

int addtick_timer(int tid,unsigned int tick)
{
	delete_timer_heap(tid);
	timer_data[tid].tick += tick;
	push_timer_heap(tid);
	return timer_data[tid].tick;
}
struct TimerData* get_timer(int tid)
{
	return &timer_data[tid];
}

void do_final_timer(void)
{
	struct timer_func_list *tfl,*tfl_next;

	for(tfl = tfl_root;tfl;tfl=tfl_next) {
		tfl_next = tfl->next;
		aFree(tfl);
		tfl=NULL;
	}
	if(timer_heap)
		aFree(timer_heap);
	if(free_timer_list)
		aFree(free_timer_list);
	if(timer_data) {
		// add_timer2によるidとdataの解放
		int i;
		for(i = 0; i < timer_data_num; i++) {
			struct TimerData *td = &timer_data[i];
			void *v;
			if(td->free_flag & TIMER_FREE_ID) {
				v = (void *)td->id;
				aFree( v );
			}
			if(td->free_flag & TIMER_FREE_DATA) {
				v = (void *)td->data;
				aFree( v );
			}
		}
		aFree(timer_data);
	}
}

int do_timer(unsigned int tick)
{
	int i,j,nextmin = 1000;

#if 0
	static int disp_tick = 0;
	if (DIFF_TICK(disp_tick,tick)<-5000 || DIFF_TICK(disp_tick,tick)>5000) {
		printf("timer %d(%d + %d)\n",timer_data_num,timer_heap[0],free_timer_list_pos);
		disp_tick = tick;
	}
#endif

	while((j = top_timer_heap()) >= 0) {
		i = timer_heap[ j ];
		if (DIFF_TICK(timer_data[i].tick , tick)>0) {
			nextmin = DIFF_TICK(timer_data[i].tick , tick);
			break;
		}
		pop_timer_heap(j);
		timer_data[i].type |= TIMER_REMOVE_HEAP;
		if (timer_data[i].func) {
			if (DIFF_TICK(timer_data[i].tick , tick) < -1000) {
				// 1秒以上の大幅な遅延が発生しているので、
				// timer処理タイミングを現在値とする事で
				// 呼び出し時タイミング(引数のtick)相対で処理してる
				// timer関数の次回処理タイミングを遅らせる
				timer_data[i].func(i,tick,timer_data[i].id,timer_data[i].data);
			} else {
				timer_data[i].func(i,timer_data[i].tick,timer_data[i].id,timer_data[i].data);
			}
		}
		if (timer_data[i].type&TIMER_REMOVE_HEAP) {
			switch(timer_data[i].type & ~TIMER_REMOVE_HEAP) {
			case TIMER_ONCE_AUTODEL:
				timer_data[i].type = 0;
				timer_data[i].free_flag = 0;
				if (free_timer_list_pos >= free_timer_list_max) {
					free_timer_list_max += 256;
					free_timer_list = (int *)aRealloc(free_timer_list,
						free_timer_list_max * sizeof(free_timer_list[0]));
					memset(free_timer_list + (free_timer_list_max - 256), 0,
						256 * sizeof(free_timer_list[0]));
				}
				free_timer_list[free_timer_list_pos++] = i;
				break;
			case TIMER_INTERVAL:
				if (DIFF_TICK(timer_data[i].tick , tick) < -1000) {
					timer_data[i].tick = tick + timer_data[i].interval;
				} else {
					timer_data[i].tick += timer_data[i].interval;
				}
				timer_data[i].type &= ~TIMER_REMOVE_HEAP;
				push_timer_heap(i);
				break;
			}
		}
	}

	if (nextmin < TIMER_MIN_INTERVAL) {
		return TIMER_MIN_INTERVAL;
	}
	if(nextmin > TIMER_MAX_INTERVAL) { 
		return TIMER_MAX_INTERVAL;
	}
	return nextmin;
}
