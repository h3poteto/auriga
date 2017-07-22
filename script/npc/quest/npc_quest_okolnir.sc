//= Auriga Script ==============================================================
// Ragnarok Online Falicious Okolnir Script	by refis
//= Registry ===================================================================
// $GodSEActivete[] -> �e�ԓ����
//==============================================================================

function	script	GodSEAgitWarp	{
	set '@tag$,substr(getarg(0),0,1);
	set '@num,substr(getarg(0),1,1);
	if('@tag$ == "F") {
		switch('@num) {
		case 1: set '@map$,"arug_cas01.gat"; set '@x,157; set '@y,369; break;
		case 2: set '@map$,"arug_cas02.gat"; set '@x,349; set '@y,355; break;
		case 3: set '@map$,"arug_cas03.gat"; set '@x,321; set '@y,153; break;
		case 4: set '@map$,"arug_cas04.gat"; set '@x,321; set '@y,153; break;
		case 5: set '@map$,"arug_cas05.gat"; set '@x,321; set '@y,153; break;
		}
	}
	else if('@tag$ == "N") {
		switch('@num) {
		case 1: set '@map$,"schg_cas01.gat"; set '@x,369; set '@y,306; break;
		case 2: set '@map$,"schg_cas02.gat"; set '@x,177; set '@y,355; break;
		case 3: set '@map$,"schg_cas03.gat"; set '@x,81;  set '@y,95;  break;
		case 4: set '@map$,"schg_cas04.gat"; set '@x,369; set '@y,306; break;
		case 5: set '@map$,"schg_cas05.gat"; set '@x,369; set '@y,306; break;
		}
	}
	mapwarp "this",'@map$,'@x,'@y;
	return;
}

//============================================================
// �ē��l
//------------------------------------------------------------
-	script	�ē��l#Okolnir	-1,{
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
	set '@GID, getcastledata('@map$,1);
	if(getcharid(2) != '@GID) {
		mes "[�ē��l]";
		mes "�c�c������Ȃ���ł��ˁB";
		mes "���̍Ԃ̎�����̃M���h�̕��ł�";
		mes "�Ȃ��悤�ł��ˁc�c";
		mes "�O���̕��Ȃ�΁A������";
		mes "�o�čs���ꂽ�ق����ǂ��ł���B";
		close;
	}
	set '@name$,substr('@map$,0,3) + substr('@map$,8,2);
	set '@map$,"que_q" +'@name$+ ".gat";
	if($GodSEActivete['castle] == 0) {
		mes "[�ē��l]";
		mes "���̍Ԃɂ͉B���ꂽ�閧�������ł��B";
		mes "���̒��̂ЂƂ��A";
		mes "�w^4D4DFF�I�[�R���j��^000000�x�̑��݂ł��B";
		next;
		switch(select("�I�[�R���j���ɂ��ĕ���","�I�[�R���j���ɍs������","��������")) {
		case 1:
			mes "[�ē��l]";
			mes "�I�[�R���j���Ƃ́c�c���m�ɂ�";
			mes "�w^0000FF�����̃I�[�R���j��^000000�x��";
			mes "�ĂԂ悤�Ȃ̂ł����A���̂Ƃ���ǂ��";
			mes "���݂Ȃ̂��悭����Ȃ��̂ł��B";
			mes "���郔�@���L���[�ɂ��ێ�����Ă���";
			mes "�ƌ����Ă��܂��B";
			next;
			mes "[�ē��l]";
			mes "���@���L���[����m�������������߂�";
			mes "�p�ӂ����ꏊ�Ȃ̂ł͂Ȃ�����";
			mes "�Ȃ�ƂȂ��������Ă���̂ł����c�c";
			mes "���A�ł��I�[�R���j���ɓ��邽�߂�";
			mes "�����Ȃ�Ή����Ă��܂���B";
			next;
			menu "�����H",-;
			mes "[�ē��l]";
			mes "�����ł��B";
			mes "���@���L���[�͋�����m���D�݂܂��B";
			mes "�I�[�R���j���ɍs�����ƑR��A";
			mes "���@���n���ɍs�����ƑR��A";
			mes "���@���L���[�ɔF�߂��Ă�����";
			mes "������ł��傤�B";
			next;
			mes "[�ē��l]";
			mes "�����̃I�[�R���j�����J�������";
			mes "�^�C�~���O�́A�����̋����l�X��";
			mes "�͂��W�܂������Ȃ̂ł��B";
			mes "���̔��f��́A�܂��ɂ��̍Ԃ�";
			mes "����̂ł��B";
			next;
			mes "[�ē��l]";
			mes "�Ԃ�^0000FF���ƒl��65�ȏ�A";
			mes "�h�q�l��30�ȏ�^000000�̎��A";
			mes "�I�[�R���j���ɍs�������o���܂��B";
			mes "�����āA�I�[�R���j����";
			mes "���@���L���[������������";
			mes "�S�đł������Ƃ��ł���΁c�c!!";
			next;
			mes "[�ē��l]";
			mes "�Ԃ���Y�o����镨����";
			mes "����������������Ă�����";
			mes "�����Ă��܂��B";
			next;
			mes "[�ē��l]";
			mes "�܂��A��x���킵�Ă݂Ă�";
			mes "�ǂ��̂ł͂Ȃ��ł��傤���H";
			mes "�ӂӂӁc�c";
			close;
		case 2:
			mes "[�ē��l]";
			mes "�I�[�R���j���ɍs�������̂ł����H";
			mes "�m�F���܂����班�X���҂����c�c";
			next;
			if((GetCastleData('@map$,3) >= 65) && (GetCastleData('@map$,2) >= 30)) {
				mes "[�ē��l]";
				mes "�f���炵���ł��I";
				mes "�Ԃ̏��ƒl�Ɩh�q�l���\��������";
				mes "�������Ă��܂��B���Ȃ�I�[�R���j����";
				mes "�s�����Ƃ��ł���ł��傤�B";
				mes "�s���܂����H";
				next;
				if(select("�ړ�����","��߂�") == 2) {
					mes "[�ē��l]";
					mes "�I�[�R���j���֍s���@���";
					mes "���ł�����܂��B";
					mes "���Ȃ��������̍Ԃ�";
					mes "��邱�Ƃ��o����΂̘b�c�c";
					mes "�ł����ǂˁB";
					close;
				}
				if(countitem(7839) > 0) {
					delitem 7839,countitem(7839);
				}
				mes "[�ē��l]";
				mes "�M���̊肢�������܂��悤�Ɂc�c";
				close2;
				warp '@map$,346,32;
				end;
			}
			else {
				mes "[�ē��l]";
				mes "���[��c�c";
				mes "�����𖞂����Ă��Ȃ��悤�ł��ˁB";
				mes "�Ԃ������Ɣ��W�����Ȃ���΁c�c";
				close;
			}
		case 3:
			mes "[�ē��l]";
			mes "�����ł����c�c";
			mes "�c�O�ł��B";
			close;
		}
	}
	else if($GodSEActivete['castle] == 1) {
		mes "[�ē��l]";
		mes "�I���ɉ�b�����Ă���";
		mes "�]�T�͂���܂���ˁB";
		mes "�K�^�����F�肵�܂��B";
		next;
		if(select("�ړ�����","�ړ����Ȃ�") == 2) {
			mes "[�ē��l]";
			mes "�����ł����H";
			mes "�c�O�ł��B";
			close;
		}
		if(countitem(7839) > 0) {
			delitem 7839,countitem(7839);
		}
		mes "[�ē��l]";
		mes "�M���̊肢�������܂��悤�Ɂc�c";
		close2;
		warp '@map$,346,32;
		end;
	}
	else if($GodSEActivete['castle] >= 2 && $GodSEActivete['castle] < 14) {
		mes "[�ē��l]";
		mes "�I�[�R���j�����č\�z�����܂łɂ�";
		mes "�����̎��Ԃ�v����ƌ����Ă��܂��B";
		mes "�Ⴆ���ꂪ���݂��Ȃ�";
		mes "��Ԃ��Ƃ��Ă��c�c�ł��B";
		next;
		mes "[�ē��l]";
		mes "���悻12���Ԃ���13���Ԃق�";
		mes "������ƍl�����Ă��܂��B";
		close;
	}
	else {
		// ������
		mes "[�ē���]";
		mes "���X���҂����������B";
		close;
	}
OnInit:
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$�ȊO�̓_�~�[
	if('@map$ == "-")					//duplicate���͉������Ȃ�
		end;
	set '@name$,substr(strnpcinfo(2),0,1);
	set '@num,substr(strnpcinfo(2),1,1);
	if('@name$ == "F")
		set 'castle,0;
	else if('@name$ == "N")
		set 'castle,5;
	if('@num > 0)
		set 'castle,'castle+'@num-1;
	if($GodSEActivete['castle] == 1)
		set $GodSEActivete['castle],0;
	end;
}
arug_cas01.gat,161,371,3	duplicate(�ē��l#Okolnir)	�ē��l#F1	899
arug_cas02.gat,349,347,3	duplicate(�ē��l#Okolnir)	�ē��l#F2	899
arug_cas03.gat,324,161,3	duplicate(�ē��l#Okolnir)	�ē��l#F3	899
arug_cas04.gat,324,161,3	duplicate(�ē��l#Okolnir)	�ē��l#F4	899
arug_cas05.gat,324,161,3	duplicate(�ē��l#Okolnir)	�ē��l#F5	899
schg_cas01.gat,376,307,3	duplicate(�ē��l#Okolnir)	�ē��l#N1	899
schg_cas02.gat,181,335,3	duplicate(�ē��l#Okolnir)	�ē��l#N2	899
schg_cas03.gat,84,101,3		duplicate(�ē��l#Okolnir)	�ē��l#N3	899
schg_cas04.gat,376,307,3	duplicate(�ē��l#Okolnir)	�ē��l#N4	899
schg_cas05.gat,376,307,3	duplicate(�ē��l#Okolnir)	�ē��l#N5	899

que_qaru01.gat,345,23,0	warp	�Q�[�g02#F1	1,1,arug_cas01.gat,157,369
que_qaru02.gat,345,23,0	warp	�Q�[�g02#F2	1,1,arug_cas02.gat,349,355
que_qaru03.gat,345,23,0	warp	�Q�[�g02#F3	1,1,arug_cas03.gat,321,153
que_qaru04.gat,345,23,0	warp	�Q�[�g02#F4	1,1,arug_cas04.gat,321,153
que_qaru05.gat,345,23,0	warp	�Q�[�g02#F5	1,1,arug_cas05.gat,321,153
que_qsch01.gat,345,23,0	warp	�Q�[�g02#N1	1,1,schg_cas01.gat,369,306
que_qsch02.gat,345,23,0	warp	�Q�[�g02#N2	1,1,schg_cas02.gat,177,355
que_qsch03.gat,345,23,0	warp	�Q�[�g02#N3	1,1,schg_cas03.gat,81,95
que_qsch04.gat,345,23,0	warp	�Q�[�g02#N4	1,1,schg_cas04.gat,369,306
que_qsch05.gat,345,23,0	warp	�Q�[�g02#N5	1,1,schg_cas05.gat,369,306

//============================================================
// �N�G�X�g�J�nNPC
//------------------------------------------------------------
-	script	�E�B�b�V�����C�f��#entr	-1,{
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
	set '@name$,substr('@map$,5,3);
	set '@num,substr('@map$,9,1);
	set '@GID,getcastledata('@name$+"g_cas0"+'@num+".gat",1);
	if(getcharid(2) != '@GID) {
		cutin "wish_maiden23",1;
		mes "[�E�B�b�V�����C�f��]";
		mes "�c�c���i�����҂͋���B";
		close2;
		percentheal -100,0;
		cutin "wish_maiden32",255;
		end;
	}
	cutin "wish_maiden31",1;
	if(strcharinfo(0) != getguildmaster('@GID)) {
		cutin "wish_maiden31",1;
		mes "[�E�B�b�V�����C�f��]";
		mes "�c�c��́c�c";
		mes "�����̃I�[�R���j���Ŗ�������ҁc�c";
		mes "�_�X�̗̈��N�Ƃ��悤�Ƃ���";
		mes "�����Ȑl�Ԃ̑O�ɗ����A";
		mes "�ނ�̐��𕷂��͂���ҁc�c";
		mes "�E�B�b�V�����C�f���c�c";
		next;
		mes "[�E�B�b�V�����C�f��]";
		mes "���������܂œ������҂�";
		mes "�A��Ă��邪�ǂ��B";
		mes "���̎҂ɉ�̈ӎv��`����B";
		close2;
		cutin "wish_maiden32",255;
		end;
	}
	mes "[�E�B�b�V�����C�f��]";
	mes "�c�c��́c�c";
	mes "�����̃I�[�R���j���Ŗ�������ҁc�c";
	mes "�_�X�̗̈��N�Ƃ��悤�Ƃ���";
	mes "�����Ȑl�Ԃ̑O�ɗ����A";
	mes "�ނ�̐��𕷂��͂���ҁc�c";
	mes "�E�B�b�V�����C�f���c�c";
	next;
	if(
	  ('@name$ == "aru" && countitem(7835) && countitem(7836) && countitem(7837) &&
		countitem(7838) && countitem(2513) && countitem(7291) >= 10 && countitem(7293) >= 10 &&
		countitem(7063) >= 100 && countitem(757) >= 20) ||
	  ('@name$ == "sch" && countitem(7830) && countitem(7831) && countitem(7832) &&
		countitem(7833) && countitem(7834) && countitem(2357) && countitem(7510) >= 100 &&
		countitem(969) >= 10 && countitem(757) >= 20)
	) {
		cutin "wish_maiden11",1;
		mes "[�E�B�b�V�����C�f��]";
		mes "�����̐������҂�B";
		mes ('@name$ == "aru"? "�A�X�v���J": "�u�������q���f") +"�̎傽�鎑�i��";
		mes "���񂪂��߂̎����A";
		mes "�󂯂�o��͂ł��Ă��邩�H";
		next;
		switch(select("�ǂ�����Ηǂ��̂ł����H","��ł��܂�")) {
		case 1:
			cutin "wish_maiden12",1;
			mes "[�E�B�b�V�����C�f��]";
			mes ('@name$ == "aru"? "�A�X�v���J": "�u�������q���f") +"�̗͂������鎑�i��";
			mes "���邩�ǂ����A";
			mes "���̉䂪���ڎ����̂��B";
			mes "�I�[�R���j���̐����̋������z���A";
			mes "����ł��|���΂悢�B";
			mes "�ȒP�ł��낤�H";
			next;
			mes "[�E�B�b�V�����C�f��]";
			mes "�����A�����̃I�[�R���j����";
			mes "�����ʂ苕���c�c";
			mes "�͂��ȉ߂����󂯓���邱�Ƃ͂Ȃ��B";
			mes "^ff0000���ɗ^�����鎞�Ԃ�1���Ԃ��B^000000";
			next;
			cutin "wish_maiden31",1;
			mes "[�E�B�b�V�����C�f��]";
			mes "���Ԃ���邱�Ƃ��o���Ȃ����";
			mes "�I�[�R���j���͕��ꋎ��A";
			mes "�[������ɂ��c�c�B";
			mes "�����Ȃ�Ɠ���͒�����";
			mes "�Đ���҂��˂΂Ȃ�ʁB";
			next;
			mes "[�E�B�b�V�����C�f��]";
			mes "�c�c���āA���Ƌ��ɍs���҂�����";
			mes "�W�܂������H";
			mes "^4d4dff16�`20�l^000000���x���Ó����B";
			next;
			cutin "wish_maiden11",1;
			mes "[�E�B�b�V�����C�f��]";
			mes "�������󂯂鏀�����������Ȃ�΁A";
			mes "�I�[�R���j���ւ̖���J�����B";
			next;
			switch(select("�S�Đ����܂���","�����������Ԃ��K�v�ł�")) {
			case 1:
				set '@saram,getmapusers("this");
				if('@saram > 15 && '@saram < 21) {
					cutin "wish_maiden12",1;
					mes "[�E�B�b�V�����C�f��]";
					mes "�ł́A�������ŃI�[�R���j����";
					mes "����J���B";
					mes "��̓I�[�R���j���̍ł������ꏊ�ɂ�";
					mes "�����҂c�c";
					next;
					mes "[�E�B�b�V�����C�f��]";
					mes "�������������z���A";
					mes "�I�[�R���j�������ꋎ��O��";
					mes "��̂��Ƃɓ��B����I";
					close2;
					donpcevent "Gate_manager#"+substr(strnpcinfo(2),0,2)+"::OnStart";
					donpcevent "okolnir#"+substr(strnpcinfo(2),0,2)+"::OnStart";
					if('@name$ == "aru")
						set $GodSEActivete['@num-1],1;
					else if('@name$ == "sch")
						set $GodSEActivete[5+'@num-1],1;
					announce "["+ GetGuildName('@GID) +"]�M���h��["+ strcharinfo(0) +"]�l�ɂ��A�����̃I�[�R���j�����J������܂����B",0;
					hideonnpc;
				}
				else {
					cutin "wish_maiden13",1;
					mes "[�E�B�b�V�����C�f��]";
					mes "�I�[�R���j���̖���J���Ȃ��";
					mes "^FF000016�l�����ł�20�l���z���Ă�";
					mes "�Ȃ�Ȃ��B^000000";
					mes "���ɍs�����Ԃ𐮗��������";
					mes "���邪�ǂ��B";
					close2;
				}
				break;
			case 2:
				cutin "wish_maiden13",1;
				mes "[�E�B�b�V�����C�f��]";
				mes "�c�c�S�O�����ƂȂ���B";
				mes "�@��͖ڂ̑O�ɂ��鎞�ɒ͂ނ��́B";
				mes "�����A���Ԃ��W�߂Ă��邪�ǂ��B";
				close2;
			}
			break;
		case 2:
			cutin "wish_maiden32",1;
			mes "[�E�B�b�V�����C�f��]";
			mes "�c�c���낵���̂��H";
			mes "���̑O�ɗ����ǂ��鎎���̂��Ƃ��c�c";
			next;
			cutin "wish_maiden13",1;
			mes "[�E�B�b�V�����C�f��]";
			mes "�����Ȏ҂�B";
			mes ('@name$ == "aru"? "�A�X�v���J": "�u�������q���f") +"�̗͂�";
			mes "�ȒP�ɏ���Ƃł��v���Ă����̂��H";
			mes "��A�E�B�b�V�����C�f����";
			mes "���ƁA���Ƌ��ɂ���ґS�ĂɎ��]�����B";
			mes "�ނ��������B";
			close2;
		}
	}
	else {
		// ������
		cutin "wish_maiden11",1;
		mes "[�E�B�b�V�����C�f��]";
		mes "���́A���֎��낤�Ƃ����̂��H";
		mes "�p�ӂ��ς܂����҂��������ւƎ����B";
		mes "�I�[�R���j���֎���ɂ͂�������";
		mes "�A�C�e�����K�v�ƂȂ邼�B";
		next;
		if('@name$ == "aru") {
			mes "[�E�B�b�V�����C�f��]";
			mes "�w�����̋P���x";
			mes "�w�t���̐����x";
			mes "�w�₽����������x";
			mes "�w���Â���������x�B";
			next;
			mes "[�E�B�b�V�����C�f��]";
			mes "����4�̃A�C�e���ɉ����A";
			mes "�߂̂� 10��";
			mes "�K�N���� 10��";
			mes "�G���j�E������ 20��";
			mes "�V���̉H�߁A����я_�炩���H�т�";
			mes "�����Ă��Ăق����B";
		}
		else {
			mes "[�E�B�b�V�����C�f��]";
			mes "�w���_�̗܁x";
			mes "�w���@���L���[�̒����x";
			mes "�w�u�������q���f�̊Z�̌��Ёx";
			mes "�w�p�Y�̈�D�x";
			mes "�w���@���L���[�A�[�}�[�x";
			mes "�w�A���h���@���̎w�ցx�B";
			next;
			mes "[�E�B�b�V�����C�f��]";
			mes "����6�̃A�C�e���ɉ����A";
			mes "���� 10��";
			mes "�G���j�E������ 20��";
			mes "�����Ă��Ăق����B";
			mes "�������Ƃ��đ�����";
			mes "���@���n���̉Ԃ��K�v���B";
		}
		next;
		mes "[�E�B�b�V�����C�f��]";
		mes "�����S�Ă��W�܂�΁A��͊J���B";
		next;
		mes "[�E�B�b�V�����C�f��]";
		mes "�c";
		mes "�c�c�c�_�̌��P�͓���";
		mes "���𓊂������Ă���B";
		mes "���̌��ɒl���鋭����";
		mes "���͎����Ă��悤�c";
		next;
		if('@name$ == "aru") {
			mes "[�E�B�b�V�����C�f��]";
			mes "�_�炩���H�т͑����̐����K�v�ƂȂ�B";
			mes "�悭�o���Ă����������c";
			mes "���̖�������񂱂Ƃ��肤���c";
		}
		else {
			mes "[�E�B�b�V�����C�f��]";
			mes "���@���n���̉Ԃ�";
			mes "�����̐����K�v�ƂȂ�B";
			mes "�悭�o���Ă����������c";
			mes "���̖�������񂱂Ƃ��肤���c";
		}
		next;
		mes "[�E�B�b�V�����C�f��]";
		mes "�i�������A�邱�Ƃ��o�����";
		mes "�䂪�]�݂̑S�Ăɉ����悤�B";
		close2;
	}
	cutin "wish_maiden11",255;
	end;
}
que_qaru01.gat,345,82,3	duplicate(�E�B�b�V�����C�f��#entr)	�E�B�b�V�����C�f��#F1_e	403
que_qaru02.gat,345,82,3	duplicate(�E�B�b�V�����C�f��#entr)	�E�B�b�V�����C�f��#F2_e	403
que_qaru03.gat,345,82,3	duplicate(�E�B�b�V�����C�f��#entr)	�E�B�b�V�����C�f��#F3_e	403
que_qaru04.gat,345,82,3	duplicate(�E�B�b�V�����C�f��#entr)	�E�B�b�V�����C�f��#F4_e	403
que_qaru05.gat,345,82,3	duplicate(�E�B�b�V�����C�f��#entr)	�E�B�b�V�����C�f��#F5_e	403
que_qsch01.gat,345,82,3	duplicate(�E�B�b�V�����C�f��#entr)	�E�B�b�V�����C�f��#N1_e	403
que_qsch02.gat,345,82,3	duplicate(�E�B�b�V�����C�f��#entr)	�E�B�b�V�����C�f��#N2_e	403
que_qsch03.gat,345,82,3	duplicate(�E�B�b�V�����C�f��#entr)	�E�B�b�V�����C�f��#N3_e	403
que_qsch04.gat,345,82,3	duplicate(�E�B�b�V�����C�f��#entr)	�E�B�b�V�����C�f��#N4_e	403
que_qsch05.gat,345,82,3	duplicate(�E�B�b�V�����C�f��#entr)	�E�B�b�V�����C�f��#N5_e	403

-	script	okolnir#Okolnir	-1,{
OnStart:
	set '@name$,strnpcinfo(2);
	donpcevent "�Q�[�g01#"+'@name$+"::OnStart";
	donpcevent "Maze_Manager#"+'@name$+"::OnStart";
	hideoffnpc "event_start01#"+'@name$;
	donpcevent "gd_mobctrl#"+'@name$+"::OnEnable";
	hideoffnpc "�e�̔Ԑl#"+'@name$+"_01";
	hideoffnpc "�e�̔Ԑl#"+'@name$+"_02";
	hideoffnpc "�e�̔Ԑl#"+'@name$+"_03";
	hideoffnpc "�e�̔Ԑl#"+'@name$+"_04";
	hideoffnpc "���̎�l#"+'@name$+"_01";
	hideoffnpc "���̎�l#"+'@name$+"_02";
	hideoffnpc "���̎�l#"+'@name$+"_03";
	hideoffnpc "���̎�l#"+'@name$+"_04";
	hideoffnpc "�_�a�̎���#"+'@name$+"_01";
	hideoffnpc "�_�a�̎���#"+'@name$+"_02";
	hideonnpc "�E�B�b�V�����C�f��#"+'@name$+"_g";
	hideonnpc "to_agit_gate#"+'@name$;
	hideonnpc "jp_jingiwarp01#"+'@name$;
	hideonnpc "jp_jingiwarp02#"+'@name$;
	hideonnpc "jp_jingiwarp03#"+'@name$;
	hideonnpc "jp_jingiwarp04#"+'@name$;
	for(set '@i, 1; '@i <= 8; set '@i, '@i + 1)
		hideonnpc "getspell0"+'@i+"#"+'@name$;
	for(set '@i, 1; '@i <= 6; set '@i, '@i + 1)
		hideonnpc "#"+'@name$+"_cage0"+'@i;
	initnpctimer;
	end;
OnDisable:
	set '@name$,strnpcinfo(2);
	hideonnpc "�E�B�b�V�����C�f��#"+'@name$+"_e";
	donpcevent "gq_miromob2#"+'@name$+"::OnReset";
	hideonnpc "�s�A���b�g#"+'@name$;
	donpcevent "gdtimer01#"+'@name$+"::OnStop";
	donpcevent "gdtimer02#"+'@name$+"::OnStop";
	donpcevent "piamette_ev#"+'@name$+"::OnReset";
	donpcevent "�E�B�b�V�����C�f��#"+'@name$+"_b::OnDisable";
	donpcevent "�E�B�b�V�����C�f��#"+'@name$+"_g::OnDisable";
	donpcevent "gd_mobctrl#"+'@name$+"::OnReset";
	hideonnpc "�Q�[�g01#"+'@name$;
	donpcevent "Maze_Manager#"+'@name$+"::OnDisable";
	stopnpctimer "event_start01#"+'@name$;
	donpcevent "nm_switch#"+'@name$+"::OnDisable";
	donpcevent "nmsom_jin01#"+'@name$+"::OnDisable";
	donpcevent "nmsom_jin02#"+'@name$+"::OnDisable";
	donpcevent "nmsom_jin03#"+'@name$+"::OnDisable";
	donpcevent "�e�̔Ԑl#"+'@name$+"_01::OnDisable";
	donpcevent "�e�̔Ԑl#"+'@name$+"_02::OnDisable";
	donpcevent "�e�̔Ԑl#"+'@name$+"_03::OnDisable";
	donpcevent "�e�̔Ԑl#"+'@name$+"_04::OnDisable";
	donpcevent "���̎�l#"+'@name$+"_01::OnDisable";
	donpcevent "���̎�l#"+'@name$+"_02::OnDisable";
	donpcevent "���̎�l#"+'@name$+"_03::OnDisable";
	donpcevent "���̎�l#"+'@name$+"_04::OnDisable";
	donpcevent "�_�a�̎���#"+'@name$+"_01::OnDisable";
	donpcevent "�_�a�̎���#"+'@name$+"_02::OnDisable";
	hideonnpc "to_agit_gate#"+'@name$;
	hideonnpc "#"+'@name$+"_cage01";
	hideonnpc "#"+'@name$+"_cage02";
	hideonnpc "#"+'@name$+"_cage03";
	hideonnpc "#"+'@name$+"_cage04";
	hideonnpc "#"+'@name$+"_cage05";
	hideonnpc "#"+'@name$+"_cage06";
	hideonnpc "windpath03#"+'@name$;
	hideonnpc "windpath04#"+'@name$;
	set getvariableofnpc('gqse_mobcount,"Gate_manager#"+ '@name$),0;
	set getvariableofnpc('gqse_pccount,"Gate_manager#"+ '@name$),0;
	set getvariableofnpc('gqse_cagecount,"gdtimer01#"+ '@name$),0;
	set getvariableofnpc('gqse_sealcount,"�E�B�b�V�����C�f��#"+ '@name$ +"_b"),0;
	stopnpctimer;
	end;
OnStop:
	stopnpctimer;
	end;
OnTimer1000:
	announce "�E�B�b�V�����C�f�� : �I�[�R���j����1���Ԍ�ɂ͏��ł���B�S�͂�s�����̂��I",0x9,0x00ff00;
	end;
OnTimer1800000:
	announce "�����̃I�[�R���j���y�ێ����E�c�c�c��30���z",0x9,0xff0000;
	end;
OnTimer2400000:
	announce "�����̃I�[�R���j���y�ێ����E�c�c�c��20���z",0x9,0xff0000;
	end;
OnTimer3000000:
	announce "�����̃I�[�R���j���y�ێ����E�c�c�c��10���z",0x9,0xff0000;
	end;
OnTimer3300000:
	announce "�����̃I�[�R���j���y�ێ����E�c�c�c��5���z",0x9,0xff0000;
	end;
OnTimer3360000:
	announce "�����̃I�[�R���j���y�ێ����E�c�c�c��4���z",0x9,0xff0000;
	end;
OnTimer3420000:
	announce "�����̃I�[�R���j���y�ێ����E�c�c�c��3���z",0x9,0xff0000;
	end;
OnTimer3480000:
	announce "�����̃I�[�R���j���y�ێ����E�c�c�c��2���z",0x9,0xff0000;
	end;
OnTimer3540000:
	announce "�����̃I�[�R���j���y�ێ����E�c�c�c��1���z",0x9,0xff0000;
	end;
OnTimer3600000:
	set '@name$,strnpcinfo(2);
	announce "�����̃I�[�R���j���̕��󂪎n�܂�܂����B",0x9,0x4d4dff;
	hideonnpc "�E�B�b�V�����C�f��#"+'@name$+"_e";
	donpcevent "gq_miromob2#"+'@name$+"::OnReset";
	hideonnpc "�s�A���b�g#"+'@name$;
	donpcevent "gdtimer01#"+'@name$+"::OnStop";
	donpcevent "gdtimer02#"+'@name$+"::OnStop";
	donpcevent "piamette_ev#"+'@name$+"::OnReset";
	donpcevent "�E�B�b�V�����C�f��#"+'@name$+"_b::OnDisable";
	donpcevent "�E�B�b�V�����C�f��#"+'@name$+"_g::OnDisable";
	donpcevent "gd_mobctrl#"+'@name$+"::OnReset";
	hideonnpc "�Q�[�g01#"+'@name$;
	donpcevent "Maze_Manager#"+'@name$+"::OnDisable";
	stopnpctimer "event_start01#"+'@name$;
	donpcevent "nm_switch#"+'@name$+"::OnDisable";
	donpcevent "nmsom_jin01#"+'@name$+"::OnDisable";
	donpcevent "nmsom_jin02#"+'@name$+"::OnDisable";
	donpcevent "nmsom_jin03#"+'@name$+"::OnDisable";
	donpcevent "�e�̔Ԑl#"+'@name$+"_01::OnDisable";
	donpcevent "�e�̔Ԑl#"+'@name$+"_02::OnDisable";
	donpcevent "�e�̔Ԑl#"+'@name$+"_03::OnDisable";
	donpcevent "�e�̔Ԑl#"+'@name$+"_04::OnDisable";
	donpcevent "���̎�l#"+'@name$+"_01::OnDisable";
	donpcevent "���̎�l#"+'@name$+"_02::OnDisable";
	donpcevent "���̎�l#"+'@name$+"_03::OnDisable";
	donpcevent "���̎�l#"+'@name$+"_04::OnDisable";
	donpcevent "�_�a�̎���#"+'@name$+"_01::OnDisable";
	donpcevent "�_�a�̎���#"+'@name$+"_02::OnDisable";
	hideonnpc "to_agit_gate#"+'@name$;
	hideonnpc "#"+'@name$+"_cage01";
	hideonnpc "#"+'@name$+"_cage02";
	hideonnpc "#"+'@name$+"_cage03";
	hideonnpc "#"+'@name$+"_cage04";
	hideonnpc "#"+'@name$+"_cage05";
	hideonnpc "#"+'@name$+"_cage06";
	hideonnpc "windpath03#"+'@name$;
	hideonnpc "windpath04#"+'@name$;
	end;
OnTimer3605000:
	announce "�E�B�b�V�����C�f�� : �c�c���Ɏc�O���B��͂��ꂩ��I�[�R���j���Ƌ��ɐ[������ɂ��c�c",0x9,0x00ff00;
	end;
OnTimer3608000:
	announce "�E�B�b�V�����C�f�� : �E�C���������҂�����c�c�[������̒�ŁA�Ăяo�����҂c�c",0x9,0x00ff00;
	end;
OnTimer3610000:
	set '@name$,strnpcinfo(2);
	set getvariableofnpc('gqse_mobcount,"Gate_manager#"+ '@name$),0;
	set getvariableofnpc('gqse_pccount,"Gate_manager#"+ '@name$),0;
	set getvariableofnpc('gqse_cagecount,"gdtimer01#"+ '@name$),0;
	set getvariableofnpc('gqse_sealcount,"�E�B�b�V�����C�f��#"+ '@name$ +"_b"),0;
	callfunc "GodSEAgitWarp",strnpcinfo(2);
	end;
OnTimer3611000:
	donpcevent "okolnir_time01#"+strnpcinfo(2)+"::OnEnable";
	stopnpctimer;
	end;
}
que_qaru01.gat,1,1,0	duplicate(okolnir#Okolnir)	okolnir#F1	139
que_qaru02.gat,1,1,0	duplicate(okolnir#Okolnir)	okolnir#F2	139
que_qaru03.gat,1,1,0	duplicate(okolnir#Okolnir)	okolnir#F3	139
que_qaru04.gat,1,1,0	duplicate(okolnir#Okolnir)	okolnir#F4	139
que_qaru05.gat,1,1,0	duplicate(okolnir#Okolnir)	okolnir#F5	139
que_qsch01.gat,1,1,0	duplicate(okolnir#Okolnir)	okolnir#N1	139
que_qsch02.gat,1,1,0	duplicate(okolnir#Okolnir)	okolnir#N2	139
que_qsch03.gat,1,1,0	duplicate(okolnir#Okolnir)	okolnir#N3	139
que_qsch04.gat,1,1,0	duplicate(okolnir#Okolnir)	okolnir#N4	139
que_qsch05.gat,1,1,0	duplicate(okolnir#Okolnir)	okolnir#N5	139

//============================================================
// �~�X�e�B�b�N�K�[�f���G���A
//------------------------------------------------------------
-	script	�Q�[�g01#Okolnir	-1,{
OnTouch:
	set '@saram,getmapusers("this");
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
	if('@saram > 20) {
		// ������
		mes "�l���������邽�ߓ���܂���B";
		close;
	}
	set '@miro,getvariableofnpc('gqse_mobcount,"Gate_manager#"+strnpcinfo(2));
	if('@miro == getvariableofnpc('gqse_pccount,"Gate_manager#"+strnpcinfo(2))) {
		switch(rand(1,5)) {
		case 1: warp '@map$,72,271; break;
		case 2: warp '@map$,45,243; break;
		case 3: warp '@map$,102,248; break;
		case 4: warp '@map$,102,300; break;
		case 5: warp '@map$,46,300; break;
		}
		end;
	}
	switch('@miro) {
	case 0: setarray '@n, 77,271,72,271,1; break;
	case 1: setarray '@n, 63,278,63,282,2; break;
	case 2: setarray '@n, 63,294,59,294,3; break;
	case 3: setarray '@n, 50,300,46,300,4; break;
	case 4: setarray '@n, 51,280,51,285,5; break;
	case 5: setarray '@n, 51,258,51,262,6; break;
	case 6: setarray '@n, 49,243,45,243,7; break;
	case 7: setarray '@n, 86,249,82,249,8; break;
	case 8: setarray '@n, 102,243,102,248,9; break;
	case 9: setarray '@n, 90,256,90,260,10; break;
	case 10: setarray '@n, 90,283,90,280,11; break;
	case 11: setarray '@n, 102,295,102,300,12; break;
	case 12: setarray '@n, 96,285,96,290,13; break;
	case 13: setarray '@n, 63,278,63,282,14; break;
	case 14: setarray '@n, 65,243,61,243,15; break;
	case 15: setarray '@n, 73,249,70,249,16; break;
	case 16: setarray '@n, 102,275,102,282,17; break;
	case 17: setarray '@n, 70,300,66,300,18; break;
	case 18: setarray '@n, 57,255,57,258,19; break;
	case 19: setarray '@n, 84,277,84,280,20; break;
	}
	switch(getbaseclass(Class,1)) {
	case Job_Swordman: set '@mob,1652; break;
	case Job_Mage:     set '@mob,1663; break;
	case Job_Archer:   set '@mob,1662; break;
	case Job_Acolyte:  set '@mob,1661; break;
	case Job_Merchant: set '@mob,1660; break;
	case Job_Thief:    set '@mob,1659; break;
	default:           set '@mob,1652; break;
	}
	monster '@map$,'@n[0],'@n[1],strcharinfo(0),'@mob,1,"Gate_manager#"+strnpcinfo(2)+"::OnKilled";
	set getvariableofnpc('gqse_mobcount,"Gate_manager#"+strnpcinfo(2)),'@n[4];
	warp '@map$,'@n[2],'@n[3];
	end;

OnStart:
	hideoffnpc;
	areasetcell "this",58,302,63,302,1;
	end;
OnInit:
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$�ȊO�̓_�~�[
	if('@map$ == "-")					//duplicate���͉������Ȃ�
		end;
	hideonnpc;
	end;
}
que_qaru01.gat,346,81,0	duplicate(�Q�[�g01#Okolnir)	�Q�[�g01#F1	45,1,1
que_qaru02.gat,346,81,0	duplicate(�Q�[�g01#Okolnir)	�Q�[�g01#F2	45,1,1
que_qaru03.gat,346,81,0	duplicate(�Q�[�g01#Okolnir)	�Q�[�g01#F3	45,1,1
que_qaru04.gat,346,81,0	duplicate(�Q�[�g01#Okolnir)	�Q�[�g01#F4	45,1,1
que_qaru05.gat,346,81,0	duplicate(�Q�[�g01#Okolnir)	�Q�[�g01#F5	45,1,1
que_qsch01.gat,346,81,0	duplicate(�Q�[�g01#Okolnir)	�Q�[�g01#N1	45,1,1
que_qsch02.gat,346,81,0	duplicate(�Q�[�g01#Okolnir)	�Q�[�g01#N2	45,1,1
que_qsch03.gat,346,81,0	duplicate(�Q�[�g01#Okolnir)	�Q�[�g01#N3	45,1,1
que_qsch04.gat,346,81,0	duplicate(�Q�[�g01#Okolnir)	�Q�[�g01#N4	45,1,1
que_qsch05.gat,346,81,0	duplicate(�Q�[�g01#Okolnir)	�Q�[�g01#N5	45,1,1

-	script	Gate_manager#Okolnir	-1,{
OnStart:
	set 'gqse_mobcount,0;
	set 'gqse_pccount,getmapusers("this");
	end;
OnKilled:
	if('gqse_mobcount == 'gqse_pccount) {
		if(getmapmobs("this",strnpcinfo(0)+"::OnKilled") == 0) {
			donpcevent "gq_miromob2#"+strnpcinfo(2)+"::OnStart";
		}
	}
	end;
}
que_qaru01.gat,1,4,0	duplicate(Gate_manager#Okolnir)	Gate_manager#F1	139
que_qaru02.gat,1,4,0	duplicate(Gate_manager#Okolnir)	Gate_manager#F2	139
que_qaru03.gat,1,4,0	duplicate(Gate_manager#Okolnir)	Gate_manager#F3	139
que_qaru04.gat,1,4,0	duplicate(Gate_manager#Okolnir)	Gate_manager#F4	139
que_qaru05.gat,1,4,0	duplicate(Gate_manager#Okolnir)	Gate_manager#F5	139
que_qsch01.gat,1,4,0	duplicate(Gate_manager#Okolnir)	Gate_manager#N1	139
que_qsch02.gat,1,4,0	duplicate(Gate_manager#Okolnir)	Gate_manager#N2	139
que_qsch03.gat,1,4,0	duplicate(Gate_manager#Okolnir)	Gate_manager#N3	139
que_qsch04.gat,1,4,0	duplicate(Gate_manager#Okolnir)	Gate_manager#N4	139
que_qsch05.gat,1,4,0	duplicate(Gate_manager#Okolnir)	Gate_manager#N5	139

-	script	gq_miromob2#Okolnir	-1,{
OnStart:
	initnpctimer;
	end;
OnTimer1000:
	announce "�E�B�b�V�����C�f�� : ����̉ߋ��̌��e�����Ă͂ǂ����ȁH�@�܂����̌����c�c",0x9,0x00ff00;
	end;
OnTimer6000:
	announce "�E�B�b�V�����C�f�� : ���炪�i�����Ƃ��铹�͌�������̂��S�Ăł͂Ȃ��B�������x�����ȁB",0x9,0x00ff00;
	monster "this",72,271,"�Z�C����=�E�B���U�[",1640,1,strnpcinfo(0)+"::OnKilled";
	monster "this",63,282,"�J�g���[�k=�P�C����",1645,1,strnpcinfo(0)+"::OnKilled";
	monster "this",59,294,"�Z�V��=�f�B����",1644,1,strnpcinfo(0)+"::OnKilled";
	monster "this",46,300,"�}�[�K���b�^=�\����",1643,1,strnpcinfo(0)+"::OnKilled";
	monster "this",51,285,"�G�����X=�K�C��",1641,1,strnpcinfo(0)+"::OnKilled";
	monster "this",51,262,"�n���[�h=�A���g�A�C�[��",1642,1,strnpcinfo(0)+"::OnKilled";

	monster "this",45,243,"�Z�C����=�E�B���U�[",1640,1,strnpcinfo(0)+"::OnKilled";
	monster "this",82,249,"�J�g���[�k=�P�C����",1645,1,strnpcinfo(0)+"::OnKilled";
	monster "this",102,248,"�Z�V��=�f�B����",1644,1,strnpcinfo(0)+"::OnKilled";
	monster "this",90,260,"�}�[�K���b�^=�\����",1643,1,strnpcinfo(0)+"::OnKilled";
	monster "this",90,280,"�G�����X=�K�C��",1641,1,strnpcinfo(0)+"::OnKilled";
	monster "this",102,300,"�n���[�h=�A���g�A�C�[��",1642,1,strnpcinfo(0)+"::OnKilled";

	monster "this",63,282,"�Z�C����=�E�B���U�[",1640,1,strnpcinfo(0)+"::OnKilled";
	monster "this",61,243,"�J�g���[�k=�P�C����",1645,1,strnpcinfo(0)+"::OnKilled";
	monster "this",70,249,"�Z�V��=�f�B����",1644,1,strnpcinfo(0)+"::OnKilled";
	monster "this",102,282,"�}�[�K���b�^=�\����",1643,1,strnpcinfo(0)+"::OnKilled";
	monster "this",66,300,"�G�����X=�K�C��",1641,1,strnpcinfo(0)+"::OnKilled";
	monster "this",57,258,"�n���[�h=�A���g�A�C�[��",1642,1,strnpcinfo(0)+"::OnKilled";
	stopnpctimer;
	end;
OnReset:
	killmonster "this",strnpcinfo(0)+"::OnKilled";
	stopnpctimer;
	end;
OnKilled:
	if(getmapmobs("this",strnpcinfo(0)+"::OnKilled") == 0) {
		announce "�~�X�e�B�b�N�K�[�f���̏o�����J���ꂽ�B",0x9,0x00ff00;
		hideoffnpc "jp_jingiwarp01#"+strnpcinfo(2);
		hideoffnpc "jp_jingiwarp02#"+strnpcinfo(2);
		hideoffnpc "jp_jingiwarp03#"+strnpcinfo(2);
		hideoffnpc "jp_jingiwarp04#"+strnpcinfo(2);
		donpcevent "Maze_Manager#"+strnpcinfo(2)+"::OnDisable";
	}
	end;
}
que_qaru01.gat,1,4,0	duplicate(gq_miromob2#Okolnir)	gq_miromob2#F1	139
que_qaru02.gat,1,4,0	duplicate(gq_miromob2#Okolnir)	gq_miromob2#F2	139
que_qaru03.gat,1,4,0	duplicate(gq_miromob2#Okolnir)	gq_miromob2#F3	139
que_qaru04.gat,1,4,0	duplicate(gq_miromob2#Okolnir)	gq_miromob2#F4	139
que_qaru05.gat,1,4,0	duplicate(gq_miromob2#Okolnir)	gq_miromob2#F5	139
que_qsch01.gat,1,4,0	duplicate(gq_miromob2#Okolnir)	gq_miromob2#N1	139
que_qsch02.gat,1,4,0	duplicate(gq_miromob2#Okolnir)	gq_miromob2#N2	139
que_qsch03.gat,1,4,0	duplicate(gq_miromob2#Okolnir)	gq_miromob2#N3	139
que_qsch04.gat,1,4,0	duplicate(gq_miromob2#Okolnir)	gq_miromob2#N4	139
que_qsch05.gat,1,4,0	duplicate(gq_miromob2#Okolnir)	gq_miromob2#N5	139

-	script	jp_jingiwarp#Okolnir	-1,{
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
	warp '@map$,60,311;
	end;
}
que_qaru01.gat,55,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp01#F1	139,15,15
que_qaru01.gat,87,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp02#F1	139,15,15
que_qaru01.gat,55,255,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp03#F1	139,15,15
que_qaru01.gat,87,258,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp04#F1	139,15,15
que_qaru02.gat,55,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp01#F2	139,15,15
que_qaru02.gat,87,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp02#F2	139,15,15
que_qaru02.gat,55,255,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp03#F2	139,15,15
que_qaru02.gat,87,258,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp04#F2	139,15,15
que_qaru03.gat,55,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp01#F3	139,15,15
que_qaru03.gat,87,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp02#F3	139,15,15
que_qaru03.gat,55,255,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp03#F3	139,15,15
que_qaru03.gat,87,258,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp04#F3	139,15,15
que_qaru04.gat,55,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp01#F4	139,15,15
que_qaru04.gat,87,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp02#F4	139,15,15
que_qaru04.gat,55,255,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp03#F4	139,15,15
que_qaru04.gat,87,258,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp04#F4	139,15,15
que_qaru05.gat,55,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp01#F5	139,15,15
que_qaru05.gat,87,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp02#F5	139,15,15
que_qaru05.gat,55,255,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp03#F5	139,15,15
que_qaru05.gat,87,258,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp04#F5	139,15,15
que_qsch01.gat,55,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp01#N1	139,15,15
que_qsch01.gat,87,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp02#N1	139,15,15
que_qsch01.gat,55,255,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp03#N1	139,15,15
que_qsch01.gat,87,258,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp04#N1	139,15,15
que_qsch02.gat,55,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp01#N2	139,15,15
que_qsch02.gat,87,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp02#N2	139,15,15
que_qsch02.gat,55,255,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp03#N2	139,15,15
que_qsch02.gat,87,258,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp04#N2	139,15,15
que_qsch03.gat,55,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp01#N3	139,15,15
que_qsch03.gat,87,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp02#N3	139,15,15
que_qsch03.gat,55,255,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp03#N3	139,15,15
que_qsch03.gat,87,258,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp04#N3	139,15,15
que_qsch04.gat,55,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp01#N4	139,15,15
que_qsch04.gat,87,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp02#N4	139,15,15
que_qsch04.gat,55,255,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp03#N4	139,15,15
que_qsch04.gat,87,258,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp04#N4	139,15,15
que_qsch05.gat,55,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp01#N5	139,15,15
que_qsch05.gat,87,285,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp02#N5	139,15,15
que_qsch05.gat,55,255,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp03#N5	139,15,15
que_qsch05.gat,87,258,0	duplicate(jp_jingiwarp#Okolnir)	jp_jingiwarp04#N5	139,15,15

-	script	Maze_Manager#Okolnir	-1,{
OnStart:
	initnpctimer;
	end;
OnDisable:
	set '@name$,strnpcinfo(2);
	donpcevent "miro_bf#"+'@name$+"::OnDisable";
	donpcevent "miro_rf#"+'@name$+"::OnDisable";
	donpcevent "miro_yf#"+'@name$+"::OnDisable";
	stopnpctimer;
	end;
OnTimer1000:
	donpcevent "miro_rf#"+strnpcinfo(2)+"::OnDisable";
	end;
OnTimer2000:
	donpcevent "miro_yf#"+strnpcinfo(2)+"::OnDisable";
	end;
OnTimer3000:
	donpcevent "miro_bf#"+strnpcinfo(2)+"::OnEnable";
	end;
OnTimer120000:
	donpcevent "miro_bf#"+strnpcinfo(2)+"::OnDisable";
	end;
OnTimer121000:
	donpcevent "miro_yf#"+strnpcinfo(2)+"::OnDisable";
	end;
OnTimer123000:
	donpcevent "miro_rf#"+strnpcinfo(2)+"::OnEnable";
	end;
OnTimer240000:
	donpcevent "miro_bf#"+strnpcinfo(2)+"::OnDisable";
	end;
OnTimer241000:
	donpcevent "miro_rf#"+strnpcinfo(2)+"::OnDisable";
	end;
OnTimer242000:
	donpcevent "miro_yf#"+strnpcinfo(2)+"::OnEnable";
	end;
OnTimer360000:
	donpcevent "Maze_Manager#"+strnpcinfo(2)+"::OnStart";
	end;
}
que_qaru01.gat,1,2,0	duplicate(Maze_Manager#Okolnir)	Maze_Manager#F1	139
que_qaru02.gat,1,2,0	duplicate(Maze_Manager#Okolnir)	Maze_Manager#F2	139
que_qaru03.gat,1,2,0	duplicate(Maze_Manager#Okolnir)	Maze_Manager#F3	139
que_qaru04.gat,1,2,0	duplicate(Maze_Manager#Okolnir)	Maze_Manager#F4	139
que_qaru05.gat,1,2,0	duplicate(Maze_Manager#Okolnir)	Maze_Manager#F5	139
que_qsch01.gat,1,2,0	duplicate(Maze_Manager#Okolnir)	Maze_Manager#N1	139
que_qsch02.gat,1,2,0	duplicate(Maze_Manager#Okolnir)	Maze_Manager#N2	139
que_qsch03.gat,1,2,0	duplicate(Maze_Manager#Okolnir)	Maze_Manager#N3	139
que_qsch04.gat,1,2,0	duplicate(Maze_Manager#Okolnir)	Maze_Manager#N4	139
que_qsch05.gat,1,2,0	duplicate(Maze_Manager#Okolnir)	Maze_Manager#N5	139

-	script	miro_bf#Okolnir	-1,{
	function	Cell;
OnEnable:
	set '@name$,strnpcinfo(2);
	setarray '@xy, 44,270,46,270,50,287,52,287,50,265,52,265,56,279,58,279,64,301,64,298,62,272,64,272,58,245,58,243,72,289,72,287,68,257,68,255,73,263,73,261,75,251,75,249,79,283,79,281,82,271,84,271,89,295,89,293,88,276,90,276,88,266,90,266,94,256,96,256,64,301,64,299,100,251,102,251;
	for (set '@i, 0; '@i < getarraysize('@xy); set '@i, '@i + 2)
		monster "this",'@xy['@i],'@xy['@i+1]," ",1934,1,"miro_bf#"+'@name$+"::OnKilled";
	Cell '@name$,1;
	end;
OnDisable:
	set '@name$,strnpcinfo(2);
	killmonster "this","miro_bf#"+'@name$+"::OnKilled";
	Cell '@name$,0;
	end;
OnKilled:
	end;

	function	Cell	{
		setarray '@cell, 44,270,47,270,50,287,53,287,50,265,53,265,56,279,59,279,64,298,64,301,62,272,65,272,58,242,58,245,72,286,72,289,68,254,68,259,73,260,73,263,75,248,75,251,79,280,79,283,82,271,85,271,89,292,89,295,88,276,91,276,88,266,91,266,94,256,97,256,64,298,64,301,100,251,103,251;
		for (set '@i, 0; '@i < getarraysize('@cell); set '@i, '@i + 4) {
			areasetcell "this",'@cell['@i],'@cell['@i+1],'@cell['@i+2],'@cell['@i+3],getarg(1);
		}
	}
}
que_qaru01.gat,2,1,0	duplicate(miro_bf#Okolnir)	miro_bf#F1	139
que_qaru02.gat,2,1,0	duplicate(miro_bf#Okolnir)	miro_bf#F2	139
que_qaru03.gat,2,1,0	duplicate(miro_bf#Okolnir)	miro_bf#F3	139
que_qaru04.gat,2,1,0	duplicate(miro_bf#Okolnir)	miro_bf#F4	139
que_qaru05.gat,2,1,0	duplicate(miro_bf#Okolnir)	miro_bf#F5	139
que_qsch01.gat,2,1,0	duplicate(miro_bf#Okolnir)	miro_bf#N1	139
que_qsch02.gat,2,1,0	duplicate(miro_bf#Okolnir)	miro_bf#N2	139
que_qsch03.gat,2,1,0	duplicate(miro_bf#Okolnir)	miro_bf#N3	139
que_qsch04.gat,2,1,0	duplicate(miro_bf#Okolnir)	miro_bf#N4	139
que_qsch05.gat,2,1,0	duplicate(miro_bf#Okolnir)	miro_bf#N5	139

-	script	miro_rf#Okolnir	-1,{
	function	Cell;
OnEnable:
	set '@name$,strnpcinfo(2);
	setarray '@xy, 57,301,57,299,48,291,48,289,68,290,70,290,72,295,72,293,90,296,92,296,56,282,58,282,66,283,66,281,80,284,82,284,44,273,46,273,50,273,52,273,54,269,54,267,66,271,66,270,81,273,81,272,88,276,90,276,94,276,96,276,64,258,66,258,76,263,76,261,87,265,87,263,50,252,52,252,76,252,78,252,99,255,99,253,53,245,53,243;
	for (set '@i, 0; '@i < getarraysize('@xy); set '@i, '@i + 2)
		monster "this",'@xy['@i],'@xy['@i+1]," ",1935,1,"miro_rf#"+'@name$+"::OnKilled";
	Cell '@name$,1;
	end;
OnDisable:
	set '@name$,strnpcinfo(2);
	killmonster "this","miro_rf#"+'@name$+"::OnKilled";
	Cell '@name$,0;
	end;
OnKilled:
	end;

	function	Cell	{
		setarray '@cell, 57,298,57,301,48,288,48,291,68,290,71,290,72,292,72,295,90,296,93,296,56,282,59,282,66,280,66,283,80,284,83,284,44,273,47,273,50,273,53,273,54,266,54,269,66,270,66,271,81,272,81,273,88,276,91,276,94,276,97,276,64,258,67,258,76,260,76,263,87,262,87,265,50,252,53,252,76,252,79,252,99,252,99,255,53,242,53,245;
		for (set '@i, 0; '@i < getarraysize('@cell); set '@i, '@i + 4) {
			areasetcell "this",'@cell['@i],'@cell['@i+1],'@cell['@i+2],'@cell['@i+3],getarg(1);
		}
	}
}
que_qaru01.gat,2,2,0	duplicate(miro_rf#Okolnir)	miro_rf#F1	139
que_qaru02.gat,2,2,0	duplicate(miro_rf#Okolnir)	miro_rf#F2	139
que_qaru03.gat,2,2,0	duplicate(miro_rf#Okolnir)	miro_rf#F3	139
que_qaru04.gat,2,2,0	duplicate(miro_rf#Okolnir)	miro_rf#F4	139
que_qaru05.gat,2,2,0	duplicate(miro_rf#Okolnir)	miro_rf#F5	139
que_qsch01.gat,2,2,0	duplicate(miro_rf#Okolnir)	miro_rf#N1	139
que_qsch02.gat,2,2,0	duplicate(miro_rf#Okolnir)	miro_rf#N2	139
que_qsch03.gat,2,2,0	duplicate(miro_rf#Okolnir)	miro_rf#N3	139
que_qsch04.gat,2,2,0	duplicate(miro_rf#Okolnir)	miro_rf#N4	139
que_qsch05.gat,2,2,0	duplicate(miro_rf#Okolnir)	miro_rf#N5	139

-	script	miro_yf#Okolnir	-1,{
	function	Cell;
OnEnable:
	set '@name$,strnpcinfo(2);
	setarray '@xy, 44,292,46,292,67,295,67,293,94,301,94,299,79,289,79,287,56,282,58,282,71,283,71,281,100,281,102,281,44,261,46,261,50,265,52,265,56,270,58,270,72,278,73,278,82,266,84,266,88,266,90,266,94,271,96,271,60,257,60,255,73,263,73,261,75,257,75,255,87,257,87,255,58,251,58,249,80,251,80,249,53,245,53,243,75,245,75,243,100,251,102,251,100,256,102,256;
	for (set '@i, 0; '@i < getarraysize('@xy); set '@i, '@i + 2)
		monster "this",'@xy['@i],'@xy['@i+1]," ",1936,1,"miro_yf#"+'@name$+"::OnKilled";
	Cell '@name$,1;
	end;
OnDisable:
	set '@name$,strnpcinfo(2);
	killmonster "this","miro_yf#"+'@name$+"::OnKilled";
	Cell '@name$,0;
	end;
OnKilled:
	end;

	function	Cell	{
		setarray '@cell, 44,292,47,292,67,292,67,295,94,298,94,301,79,286,79,289,56,282,59,282,71,280,71,283,100,281,103,281,44,261,47,261,50,265,53,265,56,270,59,270,72,278,73,278,82,266,85,266,88,266,91,266,94,271,97,271,60,254,60,257,73,260,73,263,75,254,75,257,87,254,87,257,58,248,58,251,80,248,80,251,53,242,53,245,75,242,75,245,100,251,103,251,100,256,103,256;
		for (set '@i, 0; '@i < getarraysize('@cell); set '@i, '@i + 4) {
			areasetcell "this",'@cell['@i],'@cell['@i+1],'@cell['@i+2],'@cell['@i+3],getarg(1);
		}
	}
}
que_qaru01.gat,2,3,0	duplicate(miro_yf#Okolnir)	miro_yf#F1	139
que_qaru02.gat,2,3,0	duplicate(miro_yf#Okolnir)	miro_yf#F2	139
que_qaru03.gat,2,3,0	duplicate(miro_yf#Okolnir)	miro_yf#F3	139
que_qaru04.gat,2,3,0	duplicate(miro_yf#Okolnir)	miro_yf#F4	139
que_qaru05.gat,2,3,0	duplicate(miro_yf#Okolnir)	miro_yf#F5	139
que_qsch01.gat,2,3,0	duplicate(miro_yf#Okolnir)	miro_yf#N1	139
que_qsch02.gat,2,3,0	duplicate(miro_yf#Okolnir)	miro_yf#N2	139
que_qsch03.gat,2,3,0	duplicate(miro_yf#Okolnir)	miro_yf#N3	139
que_qsch04.gat,2,3,0	duplicate(miro_yf#Okolnir)	miro_yf#N4	139
que_qsch05.gat,2,3,0	duplicate(miro_yf#Okolnir)	miro_yf#N5	139

//============================================================
// �����̖��G���A
//------------------------------------------------------------
-	script	windpath01#Okolnir	-1,{
	if(countitem(7839) < 1) {
		// ������
		mes "�]�Q�[�g���쓮������ɂ�";
		mes "�@�N���X�^����^0000FF��^000000��";
		mes "�@�K�v�ł��B�]";
		close;
	}
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
	mes "�]^0000FF�N���X�^���̌�^000000��";
	mes "�@�Q�[�g�ɔ��������I�]";
	close2;
	delitem 7839,1;
	warp '@map$,114,158;
	end;
}
que_qaru01.gat,132,172,0	duplicate(windpath01#Okolnir)	windpath01#F1	45,1,1
que_qaru02.gat,132,172,0	duplicate(windpath01#Okolnir)	windpath01#F2	45,1,1
que_qaru03.gat,132,172,0	duplicate(windpath01#Okolnir)	windpath01#F3	45,1,1
que_qaru04.gat,132,172,0	duplicate(windpath01#Okolnir)	windpath01#F4	45,1,1
que_qaru05.gat,132,172,0	duplicate(windpath01#Okolnir)	windpath01#F5	45,1,1
que_qsch01.gat,132,172,0	duplicate(windpath01#Okolnir)	windpath01#N1	45,1,1
que_qsch02.gat,132,172,0	duplicate(windpath01#Okolnir)	windpath01#N2	45,1,1
que_qsch03.gat,132,172,0	duplicate(windpath01#Okolnir)	windpath01#N3	45,1,1
que_qsch04.gat,132,172,0	duplicate(windpath01#Okolnir)	windpath01#N4	45,1,1
que_qsch05.gat,132,172,0	duplicate(windpath01#Okolnir)	windpath01#N5	45,1,1

que_qaru01.gat,113,165,0	warp	windpath02#F1	1,1,que_qaru01.gat,139,172
que_qaru02.gat,113,165,0	warp	windpath02#F2	1,1,que_qaru02.gat,139,172
que_qaru03.gat,113,165,0	warp	windpath02#F3	1,1,que_qaru03.gat,139,172
que_qaru04.gat,113,165,0	warp	windpath02#F4	1,1,que_qaru04.gat,139,172
que_qaru05.gat,113,165,0	warp	windpath02#F5	1,1,que_qaru05.gat,139,172
que_qsch01.gat,113,165,0	warp	windpath02#N1	1,1,que_qsch01.gat,139,172
que_qsch02.gat,113,165,0	warp	windpath02#N2	1,1,que_qsch02.gat,139,172
que_qsch03.gat,113,165,0	warp	windpath02#N3	1,1,que_qsch03.gat,139,172
que_qsch04.gat,113,165,0	warp	windpath02#N4	1,1,que_qsch04.gat,139,172
que_qsch05.gat,113,165,0	warp	windpath02#N5	1,1,que_qsch05.gat,139,172

que_qaru01.gat,131,136,3	script	�s�A���b�g#F1	1930,{}
que_qaru02.gat,131,136,3	script	�s�A���b�g#F2	1930,{}
que_qaru03.gat,131,136,3	script	�s�A���b�g#F3	1930,{}
que_qaru04.gat,131,136,3	script	�s�A���b�g#F4	1930,{}
que_qaru05.gat,131,136,3	script	�s�A���b�g#F5	1930,{}
que_qsch01.gat,131,136,3	script	�s�A���b�g#N1	1930,{}
que_qsch02.gat,131,136,3	script	�s�A���b�g#N2	1930,{}
que_qsch03.gat,131,136,3	script	�s�A���b�g#N3	1930,{}
que_qsch04.gat,131,136,3	script	�s�A���b�g#N4	1930,{}
que_qsch05.gat,131,136,3	script	�s�A���b�g#N5	1930,{}

-	script	event_start01#Okolnir	-1,{
OnTouch:
	initnpctimer;
	hideonnpc;
	end;
OnTimer2000:
	announce "�s�A���b�g�̂Ԃ₫ : �e�I�A���̂ˁc�c�H�@��������6�H�����́c�c�ł��A1�H�́c�c",0x9,0xdb7093;
	end;
OnTimer6000:
	announce "�s�A���b�g�̂Ԃ₫ : �����c�c�e�I�I�@�������񂪋A���Ă����́I�@�������킽���̏�������ł��傤�H�@����Ƃ��c�c",0x9,0xdb7093;
	end;
OnTimer10000:
	announce "�s�A���b�g�̂Ԃ₫ : ���l�̂ӂ�������j��҂�����c�c�t�t�b�c�c�ł����A���Ă̒��ɓ���΁A�݂�ȏ������񂾂�˂��`",0x9,0xdb7093;
	end;
OnTimer14000:
	announce "�s�A���b�g : �e�I�A����S�ĕ߂܂��āI�@�킽���̒��Ă������ς��ɂ���́I",0x9,0x00ff00;
	donpcevent "gdtimer01#"+strnpcinfo(2)+"::OnStart";
	stopnpctimer;
	end;
}
que_qaru01.gat,114,158,0	duplicate(event_start01#Okolnir)	event_start01#F1	139,1,1
que_qaru02.gat,114,158,0	duplicate(event_start01#Okolnir)	event_start01#F2	139,1,1
que_qaru03.gat,114,158,0	duplicate(event_start01#Okolnir)	event_start01#F3	139,1,1
que_qaru04.gat,114,158,0	duplicate(event_start01#Okolnir)	event_start01#F4	139,1,1
que_qaru05.gat,114,158,0	duplicate(event_start01#Okolnir)	event_start01#F5	139,1,1
que_qsch01.gat,114,158,0	duplicate(event_start01#Okolnir)	event_start01#N1	139,1,1
que_qsch02.gat,114,158,0	duplicate(event_start01#Okolnir)	event_start01#N2	139,1,1
que_qsch03.gat,114,158,0	duplicate(event_start01#Okolnir)	event_start01#N3	139,1,1
que_qsch04.gat,114,158,0	duplicate(event_start01#Okolnir)	event_start01#N4	139,1,1
que_qsch05.gat,114,158,0	duplicate(event_start01#Okolnir)	event_start01#N5	139,1,1

-	script	gdtimer01#Okolnir	-1,{
OnStart:
	initnpctimer;
	end;
OnStop:
	set '@name$,strnpcinfo(2);
	for (set '@i, 1; '@i <= 8; set '@i, '@i + 1)
		donpcevent "getspell0"+'@i+"#"+'@name$+"::OnDisable";
	stopnpctimer;
	end;
OnTimer1000:
	set '@name$,strnpcinfo(2);
	donpcevent "getspell08#"+'@name$+"::OnDisable";
	donpcevent "getspell01#"+'@name$+"::OnEnable";
	end;
OnTimer10000:
	set '@name$,strnpcinfo(2);
	donpcevent "getspell01#"+'@name$+"::OnDisable";
	donpcevent "getspell02#"+'@name$+"::OnEnable";
	end;
OnTimer20000:
	set '@name$,strnpcinfo(2);
	donpcevent "getspell02#"+'@name$+"::OnDisable";
	donpcevent "getspell03#"+'@name$+"::OnEnable";
	end;
OnTimer30000:
	set '@name$,strnpcinfo(2);
	donpcevent "getspell03#"+'@name$+"::OnDisable";
	donpcevent "getspell04#"+'@name$+"::OnEnable";
	end;
OnTimer40000:
	set '@name$,strnpcinfo(2);
	donpcevent "getspell04#"+'@name$+"::OnDisable";
	donpcevent "getspell05#"+'@name$+"::OnEnable";
	end;
OnTimer50000:
	set '@name$,strnpcinfo(2);
	donpcevent "getspell05#"+'@name$+"::OnDisable";
	donpcevent "getspell06#"+'@name$+"::OnEnable";
	end;
OnTimer60000:
	set '@name$,strnpcinfo(2);
	donpcevent "getspell06#"+'@name$+"::OnDisable";
	donpcevent "getspell07#"+'@name$+"::OnEnable";
	end;
OnTimer70000:
	set '@name$,strnpcinfo(2);
	donpcevent "getspell07#"+'@name$+"::OnDisable";
	donpcevent "getspell08#"+'@name$+"::OnEnable";
	end;
OnTimer75000:
	set '@name$,strnpcinfo(2);
	if('gqse_cagecount < 6) {
		announce "�s�A���b�g : ���̔n�����I�@�n���e�I�I�@�ǂ����Ĉ�x�Œ��Ă������ς��ɂł��Ȃ���!?",0x9,0x00ff00;
		for (set '@i, 1; '@i <= 6; set '@i, '@i + 1)
			hideoffnpc "#"+'@name$+"_cage0"+'@i;
		set 'gqse_cagecount,0;
	}
	end;
OnTimer76000:
	set '@name$,strnpcinfo(2);
	for (set '@i, 1; '@i <= 6; set '@i, '@i + 1)
		hideonnpc "#"+'@name$+"_cage0"+'@i;
	end;
OnTimer80000:
	initnpctimer;
	end;
}
que_qaru01.gat,2,2,0	duplicate(gdtimer01#Okolnir)	gdtimer01#F1	139
que_qaru02.gat,2,2,0	duplicate(gdtimer01#Okolnir)	gdtimer01#F2	139
que_qaru03.gat,2,2,0	duplicate(gdtimer01#Okolnir)	gdtimer01#F3	139
que_qaru04.gat,2,2,0	duplicate(gdtimer01#Okolnir)	gdtimer01#F4	139
que_qaru05.gat,2,2,0	duplicate(gdtimer01#Okolnir)	gdtimer01#F5	139
que_qsch01.gat,2,2,0	duplicate(gdtimer01#Okolnir)	gdtimer01#N1	139
que_qsch02.gat,2,2,0	duplicate(gdtimer01#Okolnir)	gdtimer01#N2	139
que_qsch03.gat,2,2,0	duplicate(gdtimer01#Okolnir)	gdtimer01#N3	139
que_qsch04.gat,2,2,0	duplicate(gdtimer01#Okolnir)	gdtimer01#N4	139
que_qsch05.gat,2,2,0	duplicate(gdtimer01#Okolnir)	gdtimer01#N5	139

-	script	gdtimer02#Okolnir	-1,{
OnStart:
	initnpctimer;
	end;
OnStop:
	stopnpctimer;
	killmonster "this","gdtimer02#"+strnpcinfo(2)+"::OnKilled";
	end;
OnTimer4000:
	announce "�s�A���b�g : ����ԁc�c�߂܂����I",0x9,0xdb7093;
	end;
OnTimer8000:
	announce "�s�A���b�g : �킽���̉����������񂽂��������o���Ȃ��悤�ɁA����p�ӂ��܂��傤�`",0x9,0xdb7093;
	end;
OnTimer12000:
	set '@name$,strnpcinfo(2);
	announce "�s�A���b�g : �t�t�t�b�A����A�킽���̒��Ă�����āI",0x9,0xdb7093;
	setarray '@xy, 108,151,109,135,115,116,158,106,163,133,150,154;
	for(set '@i, 0; '@i < getarraysize('@xy); set '@i, '@i + 2)
		monster "this",'@xy['@i],'@xy['@i+1],"��",1905,1,"gdtimer02#"+'@name$+"::OnKilled";
	end;
OnTimer112000:
	set '@name$,strnpcinfo(2);
	announce "�s�A���b�g : �t�t�t�b�A�܂��V�т܂��傤��I���������Č䗗�Ȃ����A�܂��߂܂��Ă�����I",0x9,0xdb7093;
	killmonster "this","gdtimer02#"+'@name$+"::OnKilled";
	for(set '@i, 1; '@i <= 6; set '@i, '@i + 1)
		hideoffnpc "#"+'@name$+"_cage0"+'@i;
	set getvariableofnpc('gqse_cagecount,"gdtimer01#"+ '@name$),0;
	end;
OnTimer113000:
	set '@name$,strnpcinfo(2);
	for(set '@i, 1; '@i <= 6; set '@i, '@i + 1)
		hideonnpc "#"+'@name$+"_cage0"+'@i;
	donpcevent "gdtimer01#"+'@name$+"::OnStart";
	stopnpctimer;
	end;
OnReset:
	killmonster "this","gdtimer02#"+strnpcinfo(2)+"::OnKilled";
	end;
OnKilled:
	set '@name$,strnpcinfo(2);
	if(getmapmobs("this","gdtimer02#"+'@name$+"::OnKilled") == 0) {
		for (set '@i, 1; '@i <= 6; set '@i, '@i + 1)
			hideoffnpc "#"+'@name$+"_cage0"+'@i;
		donpcevent "piamette_ev#"+'@name$+"::OnStart";
		stopnpctimer;
	}
	end;
}
que_qaru01.gat,2,3,0	duplicate(gdtimer02#Okolnir)	gdtimer02#F1	139
que_qaru02.gat,2,3,0	duplicate(gdtimer02#Okolnir)	gdtimer02#F2	139
que_qaru03.gat,2,3,0	duplicate(gdtimer02#Okolnir)	gdtimer02#F3	139
que_qaru04.gat,2,3,0	duplicate(gdtimer02#Okolnir)	gdtimer02#F4	139
que_qaru05.gat,2,3,0	duplicate(gdtimer02#Okolnir)	gdtimer02#F5	139
que_qsch01.gat,2,3,0	duplicate(gdtimer02#Okolnir)	gdtimer02#N1	139
que_qsch02.gat,2,3,0	duplicate(gdtimer02#Okolnir)	gdtimer02#N2	139
que_qsch03.gat,2,3,0	duplicate(gdtimer02#Okolnir)	gdtimer02#N3	139
que_qsch04.gat,2,3,0	duplicate(gdtimer02#Okolnir)	gdtimer02#N4	139
que_qsch05.gat,2,3,0	duplicate(gdtimer02#Okolnir)	gdtimer02#N5	139

-	script	piamette_ev#Okolnir	-1,{
OnStart:
	initnpctimer;
	end;
OnReset:
	killmonster "this","piamette_ev#"+strnpcinfo(2)+"::OnKilled";
	stopnpctimer;
	end;
OnTimer1000:
	announce "�s�A���b�g : ��������ԉ󂳂ꂿ������́H�@�킽���̏����𓦂������̂͂���H�@�˂��e�I�A����Ȃ́H",0x9,0xdb7093;
	end;
OnTimer5000:
	set '@name$,strnpcinfo(2);
	announce "�s�A���b�g : �킽���A�{�����Ⴄ��!!",0x9,0xdb7093;
	hideonnpc "�s�A���b�g#"+'@name$;
	monster "this",131,135,"�{�����s�A���b�g",1930,1,"piamette_ev#"+'@name$+"::OnKilled";
	stopnpctimer;
	end;
OnKilled:
	set '@name$,strnpcinfo(2);
	announce "�s�A���b�g�̑����������A��Ɍ������Q�[�g���o�����܂����B",0x9,0x00ff00;
	hideoffnpc "windpath03#"+'@name$;
	hideoffnpc "windpath04#"+'@name$;
	hideoffnpc "nm_switch#"+'@name$;
	end;
}
que_qaru01.gat,1,4,0	duplicate(piamette_ev#Okolnir)	piamette_ev#F1	139
que_qaru02.gat,1,4,0	duplicate(piamette_ev#Okolnir)	piamette_ev#F2	139
que_qaru03.gat,1,4,0	duplicate(piamette_ev#Okolnir)	piamette_ev#F3	139
que_qaru04.gat,1,4,0	duplicate(piamette_ev#Okolnir)	piamette_ev#F4	139
que_qaru05.gat,1,4,0	duplicate(piamette_ev#Okolnir)	piamette_ev#F5	139
que_qsch01.gat,1,4,0	duplicate(piamette_ev#Okolnir)	piamette_ev#N1	139
que_qsch02.gat,1,4,0	duplicate(piamette_ev#Okolnir)	piamette_ev#N2	139
que_qsch03.gat,1,4,0	duplicate(piamette_ev#Okolnir)	piamette_ev#N3	139
que_qsch04.gat,1,4,0	duplicate(piamette_ev#Okolnir)	piamette_ev#N4	139
que_qsch05.gat,1,4,0	duplicate(piamette_ev#Okolnir)	piamette_ev#N5	139

-	script	#getspells_main	-1,{
OnEnable:
	hideoffnpc;
	misceffect 60;
	end;
OnDisable:
	hideonnpc;
	end;
OnTouch:
	set '@name$,strnpcinfo(2);
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
	sc_start SC_STONE,300000,0,10000;
	switch(getvariableofnpc('gqse_cagecount,"gdtimer01#"+ '@name$)) {
	case 0: setarray '@n$, "103","153","1","�s�A���b�g : �V������H�͐^�����ȉH����Ɋт���A�n�ʂɃh�T�b�Ɨ������́B","0xdb7093"; break;
	case 1: setarray '@n$, "102","135","2","�s�A���b�g : �V������H�͒N����������㩂ɂ������āA�΂Ƀo�V���b�Ɨ������́B","0xdb7093"; break;
	case 2: setarray '@n$, "113","111","3","�s�A���b�g : �V������H�́A�ЂƂ�ڂ����ŕ����߂�ꂽ�܂ܕ��u����Ă����́B","0xdb7093"; break;
	case 3: setarray '@n$, "161","105","4","�s�A���b�g : �V������H�́A�Á[�����̓ł�H�ׂĂ��܂����́B","0xdb7093"; break;
	case 4: setarray '@n$, "168","135","5","�s�A���b�g : �V������H�́A�������Ӊ̂��̂������Č���f���Ă��܂����́B","0xdb7093"; break;
	case 5:
		setarray '@n$, "150","159","6","�s�A���b�g : �Ō�̈�H�́A�킽���̎�̒��ł������Ď񂪐܂�ē����̂Ă�ꂽ��!!","0xff0000";
		donpcevent "gdtimer02#"+'@name$+"::OnStart";
		donpcevent "gdtimer01#"+'@name$+"::OnStop";
		break;
	}
	hideonnpc;
	warp '@map$,'@n$[0],'@n$[1];
	set getvariableofnpc('gqse_cagecount,"gdtimer01#"+ '@name$),'@n$[2];
	announce '@n$[3],0x9,'@n$[4];
	end;
}
que_qaru01.gat,113,135,0	duplicate(#getspells_main)	getspell01#F1	139,1,1
que_qaru02.gat,113,135,0	duplicate(#getspells_main)	getspell01#F2	139,1,1
que_qaru03.gat,113,135,0	duplicate(#getspells_main)	getspell01#F3	139,1,1
que_qaru04.gat,113,135,0	duplicate(#getspells_main)	getspell01#F4	139,1,1
que_qaru05.gat,113,135,0	duplicate(#getspells_main)	getspell01#F5	139,1,1
que_qsch01.gat,113,135,0	duplicate(#getspells_main)	getspell01#N1	139,1,1
que_qsch02.gat,113,135,0	duplicate(#getspells_main)	getspell01#N2	139,1,1
que_qsch03.gat,113,135,0	duplicate(#getspells_main)	getspell01#N3	139,1,1
que_qsch04.gat,113,135,0	duplicate(#getspells_main)	getspell01#N4	139,1,1
que_qsch05.gat,113,135,0	duplicate(#getspells_main)	getspell01#N5	139,1,1
que_qaru01.gat,146,150,0	duplicate(#getspells_main)	getspell02#F1	139,1,1
que_qaru02.gat,146,150,0	duplicate(#getspells_main)	getspell02#F2	139,1,1
que_qaru03.gat,146,150,0	duplicate(#getspells_main)	getspell02#F3	139,1,1
que_qaru04.gat,146,150,0	duplicate(#getspells_main)	getspell02#F4	139,1,1
que_qaru05.gat,146,150,0	duplicate(#getspells_main)	getspell02#F5	139,1,1
que_qsch01.gat,146,150,0	duplicate(#getspells_main)	getspell02#N1	139,1,1
que_qsch02.gat,146,150,0	duplicate(#getspells_main)	getspell02#N2	139,1,1
que_qsch03.gat,146,150,0	duplicate(#getspells_main)	getspell02#N3	139,1,1
que_qsch04.gat,146,150,0	duplicate(#getspells_main)	getspell02#N4	139,1,1
que_qsch05.gat,146,150,0	duplicate(#getspells_main)	getspell02#N5	139,1,1
que_qaru01.gat,131,117,0	duplicate(#getspells_main)	getspell03#F1	139,1,1
que_qaru02.gat,131,117,0	duplicate(#getspells_main)	getspell03#F2	139,1,1
que_qaru03.gat,131,117,0	duplicate(#getspells_main)	getspell03#F3	139,1,1
que_qaru04.gat,131,117,0	duplicate(#getspells_main)	getspell03#F4	139,1,1
que_qaru05.gat,131,117,0	duplicate(#getspells_main)	getspell03#F5	139,1,1
que_qsch01.gat,131,117,0	duplicate(#getspells_main)	getspell03#N1	139,1,1
que_qsch02.gat,131,117,0	duplicate(#getspells_main)	getspell03#N2	139,1,1
que_qsch03.gat,131,117,0	duplicate(#getspells_main)	getspell03#N3	139,1,1
que_qsch04.gat,131,117,0	duplicate(#getspells_main)	getspell03#N4	139,1,1
que_qsch05.gat,131,117,0	duplicate(#getspells_main)	getspell03#N5	139,1,1
que_qaru01.gat,117,150,0	duplicate(#getspells_main)	getspell04#F1	139,1,1
que_qaru02.gat,117,150,0	duplicate(#getspells_main)	getspell04#F2	139,1,1
que_qaru03.gat,117,150,0	duplicate(#getspells_main)	getspell04#F3	139,1,1
que_qaru04.gat,117,150,0	duplicate(#getspells_main)	getspell04#F4	139,1,1
que_qaru05.gat,117,150,0	duplicate(#getspells_main)	getspell04#F5	139,1,1
que_qsch01.gat,117,150,0	duplicate(#getspells_main)	getspell04#N1	139,1,1
que_qsch02.gat,117,150,0	duplicate(#getspells_main)	getspell04#N2	139,1,1
que_qsch03.gat,117,150,0	duplicate(#getspells_main)	getspell04#N3	139,1,1
que_qsch04.gat,117,150,0	duplicate(#getspells_main)	getspell04#N4	139,1,1
que_qsch05.gat,117,150,0	duplicate(#getspells_main)	getspell04#N5	139,1,1
que_qaru01.gat,150,135,0	duplicate(#getspells_main)	getspell05#F1	139,1,1
que_qaru02.gat,150,135,0	duplicate(#getspells_main)	getspell05#F2	139,1,1
que_qaru03.gat,150,135,0	duplicate(#getspells_main)	getspell05#F3	139,1,1
que_qaru04.gat,150,135,0	duplicate(#getspells_main)	getspell05#F4	139,1,1
que_qaru05.gat,150,135,0	duplicate(#getspells_main)	getspell05#F5	139,1,1
que_qsch01.gat,150,135,0	duplicate(#getspells_main)	getspell05#N1	139,1,1
que_qsch02.gat,150,135,0	duplicate(#getspells_main)	getspell05#N2	139,1,1
que_qsch03.gat,150,135,0	duplicate(#getspells_main)	getspell05#N3	139,1,1
que_qsch04.gat,150,135,0	duplicate(#getspells_main)	getspell05#N4	139,1,1
que_qsch05.gat,150,135,0	duplicate(#getspells_main)	getspell05#N5	139,1,1
que_qaru01.gat,117,121,0	duplicate(#getspells_main)	getspell06#F1	139,1,1
que_qaru02.gat,117,121,0	duplicate(#getspells_main)	getspell06#F2	139,1,1
que_qaru03.gat,117,121,0	duplicate(#getspells_main)	getspell06#F3	139,1,1
que_qaru04.gat,117,121,0	duplicate(#getspells_main)	getspell06#F4	139,1,1
que_qaru05.gat,117,121,0	duplicate(#getspells_main)	getspell06#F5	139,1,1
que_qsch01.gat,117,121,0	duplicate(#getspells_main)	getspell06#N1	139,1,1
que_qsch02.gat,117,121,0	duplicate(#getspells_main)	getspell06#N2	139,1,1
que_qsch03.gat,117,121,0	duplicate(#getspells_main)	getspell06#N3	139,1,1
que_qsch04.gat,117,121,0	duplicate(#getspells_main)	getspell06#N4	139,1,1
que_qsch05.gat,117,121,0	duplicate(#getspells_main)	getspell06#N5	139,1,1
que_qaru01.gat,131,154,0	duplicate(#getspells_main)	getspell07#F1	139,1,1
que_qaru02.gat,131,154,0	duplicate(#getspells_main)	getspell07#F2	139,1,1
que_qaru03.gat,131,154,0	duplicate(#getspells_main)	getspell07#F3	139,1,1
que_qaru04.gat,131,154,0	duplicate(#getspells_main)	getspell07#F4	139,1,1
que_qaru05.gat,131,154,0	duplicate(#getspells_main)	getspell07#F5	139,1,1
que_qsch01.gat,131,154,0	duplicate(#getspells_main)	getspell07#N1	139,1,1
que_qsch02.gat,131,154,0	duplicate(#getspells_main)	getspell07#N2	139,1,1
que_qsch03.gat,131,154,0	duplicate(#getspells_main)	getspell07#N3	139,1,1
que_qsch04.gat,131,154,0	duplicate(#getspells_main)	getspell07#N4	139,1,1
que_qsch05.gat,131,154,0	duplicate(#getspells_main)	getspell07#N5	139,1,1
que_qaru01.gat,146,121,0	duplicate(#getspells_main)	getspell08#F1	139,1,1
que_qaru02.gat,146,121,0	duplicate(#getspells_main)	getspell08#F2	139,1,1
que_qaru03.gat,146,121,0	duplicate(#getspells_main)	getspell08#F3	139,1,1
que_qaru04.gat,146,121,0	duplicate(#getspells_main)	getspell08#F4	139,1,1
que_qaru05.gat,146,121,0	duplicate(#getspells_main)	getspell08#F5	139,1,1
que_qsch01.gat,146,121,0	duplicate(#getspells_main)	getspell08#N1	139,1,1
que_qsch02.gat,146,121,0	duplicate(#getspells_main)	getspell08#N2	139,1,1
que_qsch03.gat,146,121,0	duplicate(#getspells_main)	getspell08#N3	139,1,1
que_qsch04.gat,146,121,0	duplicate(#getspells_main)	getspell08#N4	139,1,1
que_qsch05.gat,146,121,0	duplicate(#getspells_main)	getspell08#N5	139,1,1

-	script	#Okolnir_cages	-1,{
OnTouch:
	set '@name$,substr(strnpcinfo(2),0,2);
	set '@num,substr(strnpcinfo(2),8,1);
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
	sc_end SC_STONE;
	setarray '@n, 108,151,106,135,113,115,158,106,163,133,150,154;
	warp '@map$,'@n['@num*2],'@n['@num*2+1];
	hideonnpc;
	end;
}
que_qaru01.gat,103,153,0	duplicate(#Okolnir_cages)	#F1_cage01	139,1,1
que_qaru02.gat,103,153,0	duplicate(#Okolnir_cages)	#F2_cage01	139,1,1
que_qaru03.gat,103,153,0	duplicate(#Okolnir_cages)	#F3_cage01	139,1,1
que_qaru04.gat,103,153,0	duplicate(#Okolnir_cages)	#F4_cage01	139,1,1
que_qaru05.gat,103,153,0	duplicate(#Okolnir_cages)	#F5_cage01	139,1,1
que_qsch01.gat,103,153,0	duplicate(#Okolnir_cages)	#N1_cage01	139,1,1
que_qsch02.gat,103,153,0	duplicate(#Okolnir_cages)	#N2_cage01	139,1,1
que_qsch03.gat,103,153,0	duplicate(#Okolnir_cages)	#N3_cage01	139,1,1
que_qsch04.gat,103,153,0	duplicate(#Okolnir_cages)	#N4_cage01	139,1,1
que_qsch05.gat,103,153,0	duplicate(#Okolnir_cages)	#N5_cage01	139,1,1
que_qaru01.gat,102,135,0	duplicate(#Okolnir_cages)	#F1_cage02	139,1,1
que_qaru02.gat,102,135,0	duplicate(#Okolnir_cages)	#F2_cage02	139,1,1
que_qaru03.gat,102,135,0	duplicate(#Okolnir_cages)	#F3_cage02	139,1,1
que_qaru04.gat,102,135,0	duplicate(#Okolnir_cages)	#F4_cage02	139,1,1
que_qaru05.gat,102,135,0	duplicate(#Okolnir_cages)	#F5_cage02	139,1,1
que_qsch01.gat,102,135,0	duplicate(#Okolnir_cages)	#N1_cage02	139,1,1
que_qsch02.gat,102,135,0	duplicate(#Okolnir_cages)	#N2_cage02	139,1,1
que_qsch03.gat,102,135,0	duplicate(#Okolnir_cages)	#N3_cage02	139,1,1
que_qsch04.gat,102,135,0	duplicate(#Okolnir_cages)	#N4_cage02	139,1,1
que_qsch05.gat,102,135,0	duplicate(#Okolnir_cages)	#N5_cage02	139,1,1
que_qaru01.gat,113,111,0	duplicate(#Okolnir_cages)	#F1_cage03	139,1,1
que_qaru02.gat,113,111,0	duplicate(#Okolnir_cages)	#F2_cage03	139,1,1
que_qaru03.gat,113,111,0	duplicate(#Okolnir_cages)	#F3_cage03	139,1,1
que_qaru04.gat,113,111,0	duplicate(#Okolnir_cages)	#F4_cage03	139,1,1
que_qaru05.gat,113,111,0	duplicate(#Okolnir_cages)	#F5_cage03	139,1,1
que_qsch01.gat,113,111,0	duplicate(#Okolnir_cages)	#N1_cage03	139,1,1
que_qsch02.gat,113,111,0	duplicate(#Okolnir_cages)	#N2_cage03	139,1,1
que_qsch03.gat,113,111,0	duplicate(#Okolnir_cages)	#N3_cage03	139,1,1
que_qsch04.gat,113,111,0	duplicate(#Okolnir_cages)	#N4_cage03	139,1,1
que_qsch05.gat,113,111,0	duplicate(#Okolnir_cages)	#N5_cage03	139,1,1
que_qaru01.gat,161,105,0	duplicate(#Okolnir_cages)	#F1_cage04	139,1,1
que_qaru02.gat,161,105,0	duplicate(#Okolnir_cages)	#F2_cage04	139,1,1
que_qaru03.gat,161,105,0	duplicate(#Okolnir_cages)	#F3_cage04	139,1,1
que_qaru04.gat,161,105,0	duplicate(#Okolnir_cages)	#F4_cage04	139,1,1
que_qaru05.gat,161,105,0	duplicate(#Okolnir_cages)	#F5_cage04	139,1,1
que_qsch01.gat,161,105,0	duplicate(#Okolnir_cages)	#N1_cage04	139,1,1
que_qsch02.gat,161,105,0	duplicate(#Okolnir_cages)	#N2_cage04	139,1,1
que_qsch03.gat,161,105,0	duplicate(#Okolnir_cages)	#N3_cage04	139,1,1
que_qsch04.gat,161,105,0	duplicate(#Okolnir_cages)	#N4_cage04	139,1,1
que_qsch05.gat,161,105,0	duplicate(#Okolnir_cages)	#N5_cage04	139,1,1
que_qaru01.gat,168,135,0	duplicate(#Okolnir_cages)	#F1_cage05	139,1,1
que_qaru02.gat,168,135,0	duplicate(#Okolnir_cages)	#F2_cage05	139,1,1
que_qaru03.gat,168,135,0	duplicate(#Okolnir_cages)	#F3_cage05	139,1,1
que_qaru04.gat,168,135,0	duplicate(#Okolnir_cages)	#F4_cage05	139,1,1
que_qaru05.gat,168,135,0	duplicate(#Okolnir_cages)	#F5_cage05	139,1,1
que_qsch01.gat,168,135,0	duplicate(#Okolnir_cages)	#N1_cage05	139,1,1
que_qsch02.gat,168,135,0	duplicate(#Okolnir_cages)	#N2_cage05	139,1,1
que_qsch03.gat,168,135,0	duplicate(#Okolnir_cages)	#N3_cage05	139,1,1
que_qsch04.gat,168,135,0	duplicate(#Okolnir_cages)	#N4_cage05	139,1,1
que_qsch05.gat,168,135,0	duplicate(#Okolnir_cages)	#N5_cage05	139,1,1
que_qaru01.gat,150,159,0	duplicate(#Okolnir_cages)	#F1_cage06	139,1,1
que_qaru02.gat,150,159,0	duplicate(#Okolnir_cages)	#F2_cage06	139,1,1
que_qaru03.gat,150,159,0	duplicate(#Okolnir_cages)	#F3_cage06	139,1,1
que_qaru04.gat,150,159,0	duplicate(#Okolnir_cages)	#F4_cage06	139,1,1
que_qaru05.gat,150,159,0	duplicate(#Okolnir_cages)	#F5_cage06	139,1,1
que_qsch01.gat,150,159,0	duplicate(#Okolnir_cages)	#N1_cage06	139,1,1
que_qsch02.gat,150,159,0	duplicate(#Okolnir_cages)	#N2_cage06	139,1,1
que_qsch03.gat,150,159,0	duplicate(#Okolnir_cages)	#N3_cage06	139,1,1
que_qsch04.gat,150,159,0	duplicate(#Okolnir_cages)	#N4_cage06	139,1,1
que_qsch05.gat,150,159,0	duplicate(#Okolnir_cages)	#N5_cage06	139,1,1

-	script	#gd_main_mobctrl	-1,{
OnEnable:
	setarray '@mob$[1][0], "�s�A���b�g�̂�������","1738";
	setarray '@mobpos[1][0], 107,152,109,135,113,116,157,107,163,133,149,156,131,139,135,136,131,132,128,136,110,145,129,114,148,114,155,128,152,145,131,151,110,130;
	setarray '@mob$[2][0], "�A���X","1275";
	setarray '@mobpos[2][0], 130,139,135,137,130,132,128,137,109,145,109,130,128,114,147,114,154,128,151,145,130,151;
	setarray '@mob$[3][0], "���@�C�I���[","1390";
	setarray '@mobpos[3][0], 132,139,135,135,132,132,128,135,111,145,111,130,130,114,149,114,156,128,153,145,132,151;
	setarray '@mob$[4][0], "�s�A���b�g�̕�","1699";
	setarray '@mobpos[4][0], 133,139,135,134,133,132,128,135,112,145,131,114,150,114,157,128,154,145,133,151,112,130;
	set '@name$,strnpcinfo(2);
	set '@c, 1;
	while ('@c <= 4) {
		for (set '@i, 0; '@i < getarraysize('@mobpos['@c][0]); set '@i, '@i + 2)
			monster "this",'@mobpos['@c]['@i],'@mobpos['@c]['@i+1],'@mob$['@c][0],'@mob$['@c][1],1,"gd_mobctrl#"+'@name$+"::OnKilled";
		set '@c, '@c + 1;
	}
	end;
OnReset:
	killmonster "this","gd_mobctrl#"+strnpcinfo(2)+"::OnKilled";
	end;
OnKilled:
	set '@name$,strnpcinfo(2);
	if(getmapmobs("this","gd_mobctrl#"+'@name$+"::OnKilled") < 7) {
		setarray '@n, 107,152,109,135,113,116,157,107,163,133,149,156;
		for(set '@i, 0; '@i < getarraysize('@n); set '@i, '@i + 2)
			monster "this",'@n['@i],'@n['@i+1],"�s�A���b�g�̂�������",1738,1,"gd_mobctrl#"+'@name$+"::OnKilled";
	}
	end;
}
que_qaru01.gat,1,8,0	duplicate(#gd_main_mobctrl)	gd_mobctrl#F1	139
que_qaru02.gat,1,8,0	duplicate(#gd_main_mobctrl)	gd_mobctrl#F2	139
que_qaru03.gat,1,8,0	duplicate(#gd_main_mobctrl)	gd_mobctrl#F3	139
que_qaru04.gat,1,8,0	duplicate(#gd_main_mobctrl)	gd_mobctrl#F4	139
que_qaru05.gat,1,8,0	duplicate(#gd_main_mobctrl)	gd_mobctrl#F5	139
que_qsch01.gat,1,8,0	duplicate(#gd_main_mobctrl)	gd_mobctrl#N1	139
que_qsch02.gat,1,8,0	duplicate(#gd_main_mobctrl)	gd_mobctrl#N2	139
que_qsch03.gat,1,8,0	duplicate(#gd_main_mobctrl)	gd_mobctrl#N3	139
que_qsch04.gat,1,8,0	duplicate(#gd_main_mobctrl)	gd_mobctrl#N4	139
que_qsch05.gat,1,8,0	duplicate(#gd_main_mobctrl)	gd_mobctrl#N5	139

que_qaru01.gat,149,105,0	warp	windpath03#F1	1,1,que_qaru01.gat,119,103
que_qaru02.gat,149,105,0	warp	windpath03#F2	1,1,que_qaru02.gat,119,103
que_qaru03.gat,149,105,0	warp	windpath03#F3	1,1,que_qaru03.gat,119,103
que_qaru04.gat,149,105,0	warp	windpath03#F4	1,1,que_qaru04.gat,119,103
que_qaru05.gat,149,105,0	warp	windpath03#F5	1,1,que_qaru05.gat,119,103
que_qsch01.gat,149,105,0	warp	windpath03#N1	1,1,que_qsch01.gat,119,103
que_qsch02.gat,149,105,0	warp	windpath03#N2	1,1,que_qsch02.gat,119,103
que_qsch03.gat,149,105,0	warp	windpath03#N3	1,1,que_qsch03.gat,119,103
que_qsch04.gat,149,105,0	warp	windpath03#N4	1,1,que_qsch04.gat,119,103
que_qsch05.gat,149,105,0	warp	windpath03#N5	1,1,que_qsch05.gat,119,103

que_qaru01.gat,128,104,0	warp	windpath04#F1	1,1,que_qaru01.gat,146,109
que_qaru02.gat,128,104,0	warp	windpath04#F2	1,1,que_qaru02.gat,146,109
que_qaru03.gat,128,104,0	warp	windpath04#F3	1,1,que_qaru03.gat,146,109
que_qaru04.gat,128,104,0	warp	windpath04#F4	1,1,que_qaru04.gat,146,109
que_qaru05.gat,128,104,0	warp	windpath04#F5	1,1,que_qaru05.gat,146,109
que_qsch01.gat,128,104,0	warp	windpath04#N1	1,1,que_qsch01.gat,146,109
que_qsch02.gat,128,104,0	warp	windpath04#N2	1,1,que_qsch02.gat,146,109
que_qsch03.gat,128,104,0	warp	windpath04#N3	1,1,que_qsch03.gat,146,109
que_qsch04.gat,128,104,0	warp	windpath04#N4	1,1,que_qsch04.gat,146,109
que_qsch05.gat,128,104,0	warp	windpath04#N5	1,1,que_qsch05.gat,146,109

//============================================================
// �i�C�g���A�L�[�p�[�G���A
//------------------------------------------------------------
-	script	#nm_switch_main	-1,{
OnTouch:
	hideonnpc;
	initnpctimer;
	end;
OnDisable:
	hideonnpc;
	stopnpctimer;
	end;
OnTimer1000:
	announce "�E�B�b�V�����C�f�� : �s�A���b�g�Ƃ̂��V�Y�͊y�����������ˁH", 0x9, 0x00ff00;
	end;
OnTimer4000:
	announce "�E�B�b�V�����C�f�� : �������܂��I���ł͂Ȃ��B����̖ڑO�ɌÂ̐_�a�ɂď������ꂵ�҂����������c�c", 0x9, 0x00ff00;
	end;
OnTimer9000:
	announce "�E�B�b�V�����C�f�� : ��̂Ƃ���܂ŁA�����H�蒅���Ă݂���B", 0x9, 0x00ff00;
	end;
OnTimer10000:
	donpcevent "nmsom_jin01#"+strnpcinfo(2)+"::OnEnable";
	end;
OnTimer190000:
	donpcevent "nmsom_jin02#"+strnpcinfo(2)+"::OnEnable";
	end;
OnTimer370000:
	donpcevent "nmsom_jin03#"+strnpcinfo(2)+"::OnEnable";
	stopnpctimer;
	end;
}
que_qaru01.gat,253,273,0	duplicate(#nm_switch_main)	nm_switch#F1	139,5,5
que_qaru02.gat,253,273,0	duplicate(#nm_switch_main)	nm_switch#F2	139,5,5
que_qaru03.gat,253,273,0	duplicate(#nm_switch_main)	nm_switch#F3	139,5,5
que_qaru04.gat,253,273,0	duplicate(#nm_switch_main)	nm_switch#F4	139,5,5
que_qaru05.gat,253,273,0	duplicate(#nm_switch_main)	nm_switch#F5	139,5,5
que_qsch01.gat,253,273,0	duplicate(#nm_switch_main)	nm_switch#N1	139,5,5
que_qsch02.gat,253,273,0	duplicate(#nm_switch_main)	nm_switch#N2	139,5,5
que_qsch03.gat,253,273,0	duplicate(#nm_switch_main)	nm_switch#N3	139,5,5
que_qsch04.gat,253,273,0	duplicate(#nm_switch_main)	nm_switch#N4	139,5,5
que_qsch05.gat,253,273,0	duplicate(#nm_switch_main)	nm_switch#N5	139,5,5

-	script	#nmsommain_jin01	-1,{
OnEnable:
	set '@name$,strnpcinfo(2);
	setarray '@xy, 227,294,229,294,231,296,231,298,230,300,228,301,226,301,224,299,224,297,225,295;
	for (set '@i, 0; '@i < getarraysize('@xy); set '@i, '@i + 2)
		monster "this",'@xy['@i],'@xy['@i+1],"���������w�̎���",1752,1,"nmsom_jin01#"+'@name$+"::OnKilled1";
	initnpctimer;
	end;
OnDisable:
	set '@name$,strnpcinfo(2);
	killmonster "this","nmsom_jin01#"+'@name$+"::OnKilled1";
	killmonster "this","nmsom_jin01#"+'@name$+"::OnKilled2";
	stopnpctimer;
	end;
OnTimer5000:
	set '@name$,strnpcinfo(2);
	setarray '@xy, 226,288,227,289,228,290,229,291,230,292,231,293,232,294,233,295,234,296,235,297,228,286,229,287,230,288,231,289,232,290,233,291,234,292,235,293,236,294,237,295,230,284,231,285,232,286,233,287,234,288,235,289,236,290,237,291,238,292,239,293;
	announce "�����̖����w�������I�@�e�̔Ԑl���������ꂽ�I",0x9,0x4d4dff;
	for (set '@i, 0; '@i < getarraysize('@xy); set '@i, '@i + 2)
		monster "this",'@xy['@i],'@xy['@i+1],"�e�̔Ԑl",1752,1,"nmsom_jin01#"+'@name$+"::OnKilled2";
	end;
OnTimer25000:
OnTimer55000:
OnTimer85000:
OnTimer120000:
	set '@name$,strnpcinfo(2);
	setarray '@xy2, 226,294,227,294,228,294,229,294,230,295,231,296,231,297,231,298,231,299,230,300,229,301,228,301,227,301,226,301,225,300,224,299,224,298,224,297,224,296,225,295;
	for (set '@i, 0; '@i < getarraysize('@xy2); set '@i, '@i + 2)
		monster "this",'@xy2['@i],'@xy2['@i+1],"�e�̔Ԑl",1752,1,"nmsom_jin01#"+'@name$+"::OnKilled2";
	end;
OnTimer180000:
	stopnpctimer;
	end;
OnKilled1:
	set '@name$,strnpcinfo(2);
	if(getmapmobs("this","nmsom_jin01#"+'@name$+"::OnKilled1") == 0) {
		set getvariableofnpc('gqse_sealcount,"�E�B�b�V�����C�f��#"+ '@name$ +"_b"),getvariableofnpc('gqse_sealcount,"�E�B�b�V�����C�f��#"+ '@name$ +"_b")+1;
		donpcevent "nmsom_jin01#"+'@name$+"::OnDisable";
		if(getvariableofnpc('gqse_sealcount,"�E�B�b�V�����C�f��#"+ '@name$ +"_b") == 3) {
			donpcevent "�E�B�b�V�����C�f��#"+'@name$+"_b::OnFight";
		}
	}
	end;
OnKilled2:
	end;
}
que_qaru01.gat,229,297,0	duplicate(#nmsommain_jin01)	nmsom_jin01#F1	-1
que_qaru02.gat,229,297,0	duplicate(#nmsommain_jin01)	nmsom_jin01#F2	-1
que_qaru03.gat,229,297,0	duplicate(#nmsommain_jin01)	nmsom_jin01#F3	-1
que_qaru04.gat,229,297,0	duplicate(#nmsommain_jin01)	nmsom_jin01#F4	-1
que_qaru05.gat,229,297,0	duplicate(#nmsommain_jin01)	nmsom_jin01#F5	-1
que_qsch01.gat,229,297,0	duplicate(#nmsommain_jin01)	nmsom_jin01#N1	-1
que_qsch02.gat,229,297,0	duplicate(#nmsommain_jin01)	nmsom_jin01#N2	-1
que_qsch03.gat,229,297,0	duplicate(#nmsommain_jin01)	nmsom_jin01#N3	-1
que_qsch04.gat,229,297,0	duplicate(#nmsommain_jin01)	nmsom_jin01#N4	-1
que_qsch05.gat,229,297,0	duplicate(#nmsommain_jin01)	nmsom_jin01#N5	-1

-	script	#nmsommain_jin02	-1,{
OnEnable:
	set '@name$,strnpcinfo(2);
	setarray '@xy, 275,301,277,301,279,299,279,297,278,295,276,294,274,294,272,296,272,298,273,300;
	for (set '@i, 0; '@i < getarraysize('@xy); set '@i, '@i + 2)
		monster "this",'@xy['@i],'@xy['@i+1],"���������w�̎���",1753,1,"nmsom_jin02#"+'@name$+"::OnKilled1";
	initnpctimer;
	end;
OnDisable:
	set '@name$,strnpcinfo(2);
	killmonster "this","nmsom_jin02#"+'@name$+"::OnKilled1";
	killmonster "this","nmsom_jin02#"+'@name$+"::OnKilled2";
	stopnpctimer;
	end;
OnTimer5000:
	set '@name$,strnpcinfo(2);
	announce "�����̖����w�������I�@���̎�l���������ꂽ�I",0x9,0x4d4dff;
	setarray '@xy, 263,292,264,291,265,290,266,289,267,288,268,287,269,286,270,285,271,284,272,283,265,294,266,293,267,292,268,291,269,290,270,289,271,288,272,287,273,286,274,285,267,296,268,295,269,294,270,283,271,282,272,281,273,280,274,279,275,276,276,275;
	for(set '@i, 0; '@i < getarraysize('@xy); set '@i, '@i + 2)
		monster "this",'@xy['@i],'@xy['@i+1],"���̎�l",1753,1,"nmsom_jin02#"+'@name$+"::OnKilled2";
	end;
OnTimer25000:
OnTimer55000:
OnTimer85000:
OnTimer120000:
	set '@name$,strnpcinfo(2);
	setarray '@xy2, 274,301,275,301,276,301,277,301,278,300,279,299,279,298,279,297,279,296,278,295,277,294,276,294,275,294,274,294,273,295,272,296,272,297,272,298,272,299,273,300;
	for(set '@i, 0; '@i < getarraysize('@xy2); set '@i, '@i + 2)
		monster "this",'@xy2['@i],'@xy2['@i+1],"���̎�l",1753,1,"nmsom_jin02#"+'@name$+"::OnKilled2";
	end;
OnTimer180000:
	stopnpctimer;
	end;
OnKilled1:
	set '@name$,strnpcinfo(2);
	if(getmapmobs("this","nmsom_jin02#"+'@name$+"::OnKilled1") == 0) {
		set getvariableofnpc('gqse_sealcount,"�E�B�b�V�����C�f��#"+ '@name$ +"_b"),getvariableofnpc('gqse_sealcount,"�E�B�b�V�����C�f��#"+ '@name$ +"_b")+1;
		donpcevent "nmsom_jin02#"+'@name$+"::OnDisable";
		if(getvariableofnpc('gqse_sealcount,"�E�B�b�V�����C�f��#"+ '@name$ +"_b") == 3) {
			donpcevent "�E�B�b�V�����C�f��#"+'@name$+"_b::OnFight";
		}
	}
	end;
OnKilled2:
	end;
}
que_qaru01.gat,275,299,0	duplicate(#nmsommain_jin02)	nmsom_jin02#F1	-1
que_qaru02.gat,275,299,0	duplicate(#nmsommain_jin02)	nmsom_jin02#F2	-1
que_qaru03.gat,275,299,0	duplicate(#nmsommain_jin02)	nmsom_jin02#F3	-1
que_qaru04.gat,275,299,0	duplicate(#nmsommain_jin02)	nmsom_jin02#F4	-1
que_qaru05.gat,275,299,0	duplicate(#nmsommain_jin02)	nmsom_jin02#F5	-1
que_qsch01.gat,275,299,0	duplicate(#nmsommain_jin02)	nmsom_jin02#N1	-1
que_qsch02.gat,275,299,0	duplicate(#nmsommain_jin02)	nmsom_jin02#N2	-1
que_qsch03.gat,275,299,0	duplicate(#nmsommain_jin02)	nmsom_jin02#N3	-1
que_qsch04.gat,275,299,0	duplicate(#nmsommain_jin02)	nmsom_jin02#N4	-1
que_qsch05.gat,275,299,0	duplicate(#nmsommain_jin02)	nmsom_jin02#N5	-1

-	script	#nmsommain_jin03	-1,{
OnEnable:
	set '@name$,strnpcinfo(2);
	setarray '@xy, 251,343,252,343,255,341,255,340,254,337,253,336,250,336,249,337,248,340,248,341;
	for (set '@i, 0; '@i < getarraysize('@xy); set '@i, '@i + 2)
		monster "this",'@xy['@i],'@xy['@i+1],"�k�������w�̎���",1933,1,"nmsom_jin03#"+'@name$+"::OnKilled1";
	initnpctimer;
	end;
OnDisable:
	set '@name$,strnpcinfo(2);
	killmonster "this","nmsom_jin03#"+'@name$+"::OnKilled1";
	killmonster "this","nmsom_jin03#"+'@name$+"::OnKilled2";
	stopnpctimer;
	end;
OnTimer5000:
	set '@name$,strnpcinfo(2);
	announce "�k���̖����w�������I�@�_�a�̎��҂��������ꂽ�I", 0x9, 0x4d4dff;
	setarray '@xy, 247,329,249,329,251,329,253,329,255,329,243,339,245,337,247,335,247,333,254,333,256,335,258,337,260,339;
	for (set '@i, 0; '@i < getarraysize('@xy); set '@i, '@i + 2)
		monster "this",'@xy['@i],'@xy['@i+1],"�_�a�̎���",1933,1,"nmsom_jin03#"+'@name$+"::OnKilled2";
	end;
OnTimer120000:
	set '@name$,strnpcinfo(2);
	setarray '@xy2, 251,343,252,343,255,341,255,340,254,337,253,336,250,336,249,337,248,340,248,341;
	for (set '@i, 0; '@i < getarraysize('@xy2); set '@i, '@i + 2)
		monster "this",'@xy2['@i],'@xy2['@i+1],"�_�a�̎���",1933,1,"nmsom_jin03#"+'@name$+"::OnKilled2";
	end;
OnTimer240000:
	set '@name$,strnpcinfo(2);
	setarray '@xy3, 250,343,252,343,254,342,255,340,255,338,253,336,250,336,248,338,248,340,249,342;
	for (set '@i, 0; '@i < getarraysize('@xy3); set '@i, '@i + 2)
		monster "this",'@xy3['@i],'@xy3['@i+1],"�_�a�̎���",1933,1,"nmsom_jin03#"+'@name$+"::OnKilled2";
	end;
OnTimer360000:
	set '@name$,strnpcinfo(2);
	setarray '@xy4, 250,343,252,343,254,342,255,340,255,338,253,336,251,336,249,337,248,339,248,341;
	for (set '@i, 0; '@i < getarraysize('@xy4); set '@i, '@i + 2)
		monster "this",'@xy4['@i],'@xy4['@i+1],"�_�a�̎���",1933,1,"nmsom_jin03#"+'@name$+"::OnKilled2";
	stopnpctimer;
	end;
OnKilled1:
	set '@name$,strnpcinfo(2);
	if(getmapmobs("this","nmsom_jin03#"+'@name$+"::OnKilled1") == 0) {
		set getvariableofnpc('gqse_sealcount,"�E�B�b�V�����C�f��#"+ '@name$ +"_b"),getvariableofnpc('gqse_sealcount,"�E�B�b�V�����C�f��#"+ '@name$ +"_b")+1;
		donpcevent "nmsom_jin03#"+'@name$+"::OnDisable";
		if(getvariableofnpc('gqse_sealcount,"�E�B�b�V�����C�f��#"+ '@name$ +"_b") == 3) {
			donpcevent "�E�B�b�V�����C�f��#"+'@name$+"_b::OnFight";
		}
	}
	end;
OnKilled2:
	end;
}
que_qaru01.gat,251,340,0	duplicate(#nmsommain_jin03)	nmsom_jin03#F1	-1
que_qaru02.gat,251,340,0	duplicate(#nmsommain_jin03)	nmsom_jin03#F2	-1
que_qaru03.gat,251,340,0	duplicate(#nmsommain_jin03)	nmsom_jin03#F3	-1
que_qaru04.gat,251,340,0	duplicate(#nmsommain_jin03)	nmsom_jin03#F4	-1
que_qaru05.gat,251,340,0	duplicate(#nmsommain_jin03)	nmsom_jin03#F5	-1
que_qsch01.gat,251,340,0	duplicate(#nmsommain_jin03)	nmsom_jin03#N1	-1
que_qsch02.gat,251,340,0	duplicate(#nmsommain_jin03)	nmsom_jin03#N2	-1
que_qsch03.gat,251,340,0	duplicate(#nmsommain_jin03)	nmsom_jin03#N3	-1
que_qsch04.gat,251,340,0	duplicate(#nmsommain_jin03)	nmsom_jin03#N4	-1
que_qsch05.gat,251,340,0	duplicate(#nmsommain_jin03)	nmsom_jin03#N5	-1

-	script	�e�̔Ԑl#Okolnir	-1,{
	end;
OnTouch:
	set '@name$,strnpcinfo(2);
	set '@in,substr('@name$,4,1);
	hideonnpc;
	switch('@in) {
	case 1: setarray '@n, 234,284,235,285,236,286; break;
	case 2: setarray '@n, 223,289,224,290,225,291; break;
	case 3: setarray '@n, 235,295,236,296,237,297; break;
	case 4: setarray '@n, 224,302,225,303,226,304; break;
	}
	for (set '@i, 0; '@i < getarraysize('@n); set '@i, '@i + 2)
		monster "this",'@n['@i],'@n['@i+1],"�e�̔Ԑl",1752,1,"�e�̔Ԑl#"+'@name$+"::OnKilled";
	end;
OnDisable:
	killmonster "this","�e�̔Ԑl#"+strnpcinfo(2)+"::OnKilled";
	hideonnpc;
	end;
OnKilled:
	end;
}
que_qaru01.gat,235,285,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F1_01	1752,4,4
que_qaru01.gat,224,290,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F1_02	1752,4,4
que_qaru01.gat,236,296,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F1_03	1752,4,4
que_qaru01.gat,225,303,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F1_04	1752,4,4
que_qaru02.gat,235,285,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F2_01	1752,4,4
que_qaru02.gat,224,290,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F2_02	1752,4,4
que_qaru02.gat,236,296,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F2_03	1752,4,4
que_qaru02.gat,225,303,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F2_04	1752,4,4
que_qaru03.gat,235,285,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F3_01	1752,4,4
que_qaru03.gat,224,290,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F3_02	1752,4,4
que_qaru03.gat,236,296,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F3_03	1752,4,4
que_qaru03.gat,225,303,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F3_04	1752,4,4
que_qaru04.gat,235,285,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F4_01	1752,4,4
que_qaru04.gat,224,290,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F4_02	1752,4,4
que_qaru04.gat,236,296,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F4_03	1752,4,4
que_qaru04.gat,225,303,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F4_04	1752,4,4
que_qaru05.gat,235,285,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F5_01	1752,4,4
que_qaru05.gat,224,290,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F5_02	1752,4,4
que_qaru05.gat,236,296,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F5_03	1752,4,4
que_qaru05.gat,225,303,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#F5_04	1752,4,4
que_qsch01.gat,235,285,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N1_01	1752,4,4
que_qsch01.gat,224,290,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N1_02	1752,4,4
que_qsch01.gat,236,296,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N1_03	1752,4,4
que_qsch01.gat,225,303,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N1_04	1752,4,4
que_qsch02.gat,235,285,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N2_01	1752,4,4
que_qsch02.gat,224,290,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N2_02	1752,4,4
que_qsch02.gat,236,296,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N2_03	1752,4,4
que_qsch02.gat,225,303,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N2_04	1752,4,4
que_qsch03.gat,235,285,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N3_01	1752,4,4
que_qsch03.gat,224,290,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N3_02	1752,4,4
que_qsch03.gat,236,296,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N3_03	1752,4,4
que_qsch03.gat,225,303,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N3_04	1752,4,4
que_qsch04.gat,235,285,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N4_01	1752,4,4
que_qsch04.gat,224,290,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N4_02	1752,4,4
que_qsch04.gat,236,296,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N4_03	1752,4,4
que_qsch04.gat,225,303,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N4_04	1752,4,4
que_qsch05.gat,235,285,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N5_01	1752,4,4
que_qsch05.gat,224,290,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N5_02	1752,4,4
que_qsch05.gat,236,296,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N5_03	1752,4,4
que_qsch05.gat,225,303,5	duplicate(�e�̔Ԑl#Okolnir)	�e�̔Ԑl#N5_04	1752,4,4

-	script	���̎�l#Okolnir	-1,{
	end;
OnTouch:
	set '@name$,strnpcinfo(2);
	set '@in,substr('@name$,4,1);
	hideonnpc;
	switch('@in) {
	case 1: setarray '@n, 265,297,266,296,267,295; break;
	case 2: setarray '@n, 270,284,271,283,272,282; break;
	case 3: setarray '@n, 269,308,270,307,271,306; break;
	case 4: setarray '@n, 278,301,279,300,280,299; break;
	}
	for(set '@i, 0; '@i < getarraysize('@n); set '@i, '@i + 2)
		monster "this",'@n['@i],'@n['@i+1],"���̎�l",1753,1,"���̎�l#"+'@name$+"::OnKilled";
	end;
OnDisable:
	killmonster "this","���̎�l#"+strnpcinfo(2)+"::OnKilled";
	hideonnpc;
	end;
OnKilled:
	end;
}
que_qaru01.gat,266,296,3	duplicate(���̎�l#Okolnir)	���̎�l#F1_01	1753,4,4
que_qaru01.gat,271,283,3	duplicate(���̎�l#Okolnir)	���̎�l#F1_02	1753,4,4
que_qaru01.gat,270,307,3	duplicate(���̎�l#Okolnir)	���̎�l#F1_03	1753,4,4
que_qaru01.gat,279,300,3	duplicate(���̎�l#Okolnir)	���̎�l#F1_04	1753,4,4
que_qaru02.gat,266,296,3	duplicate(���̎�l#Okolnir)	���̎�l#F2_01	1753,4,4
que_qaru02.gat,271,283,3	duplicate(���̎�l#Okolnir)	���̎�l#F2_02	1753,4,4
que_qaru02.gat,270,307,3	duplicate(���̎�l#Okolnir)	���̎�l#F2_03	1753,4,4
que_qaru02.gat,279,300,3	duplicate(���̎�l#Okolnir)	���̎�l#F2_04	1753,4,4
que_qaru03.gat,266,296,3	duplicate(���̎�l#Okolnir)	���̎�l#F3_01	1753,4,4
que_qaru03.gat,271,283,3	duplicate(���̎�l#Okolnir)	���̎�l#F3_02	1753,4,4
que_qaru03.gat,270,307,3	duplicate(���̎�l#Okolnir)	���̎�l#F3_03	1753,4,4
que_qaru03.gat,279,300,3	duplicate(���̎�l#Okolnir)	���̎�l#F3_04	1753,4,4
que_qaru04.gat,266,296,3	duplicate(���̎�l#Okolnir)	���̎�l#F4_01	1753,4,4
que_qaru04.gat,271,283,3	duplicate(���̎�l#Okolnir)	���̎�l#F4_02	1753,4,4
que_qaru04.gat,270,307,3	duplicate(���̎�l#Okolnir)	���̎�l#F4_03	1753,4,4
que_qaru04.gat,279,300,3	duplicate(���̎�l#Okolnir)	���̎�l#F4_04	1753,4,4
que_qaru05.gat,266,296,3	duplicate(���̎�l#Okolnir)	���̎�l#F5_01	1753,4,4
que_qaru05.gat,271,283,3	duplicate(���̎�l#Okolnir)	���̎�l#F5_02	1753,4,4
que_qaru05.gat,270,307,3	duplicate(���̎�l#Okolnir)	���̎�l#F5_03	1753,4,4
que_qaru05.gat,279,300,3	duplicate(���̎�l#Okolnir)	���̎�l#F5_04	1753,4,4
que_qsch01.gat,266,296,3	duplicate(���̎�l#Okolnir)	���̎�l#N1_01	1753,4,4
que_qsch01.gat,271,283,3	duplicate(���̎�l#Okolnir)	���̎�l#N1_02	1753,4,4
que_qsch01.gat,270,307,3	duplicate(���̎�l#Okolnir)	���̎�l#N1_03	1753,4,4
que_qsch01.gat,279,300,3	duplicate(���̎�l#Okolnir)	���̎�l#N1_04	1753,4,4
que_qsch02.gat,266,296,3	duplicate(���̎�l#Okolnir)	���̎�l#N2_01	1753,4,4
que_qsch02.gat,271,283,3	duplicate(���̎�l#Okolnir)	���̎�l#N2_02	1753,4,4
que_qsch02.gat,270,307,3	duplicate(���̎�l#Okolnir)	���̎�l#N2_03	1753,4,4
que_qsch02.gat,279,300,3	duplicate(���̎�l#Okolnir)	���̎�l#N2_04	1753,4,4
que_qsch03.gat,266,296,3	duplicate(���̎�l#Okolnir)	���̎�l#N3_01	1753,4,4
que_qsch03.gat,271,283,3	duplicate(���̎�l#Okolnir)	���̎�l#N3_02	1753,4,4
que_qsch03.gat,270,307,3	duplicate(���̎�l#Okolnir)	���̎�l#N3_03	1753,4,4
que_qsch03.gat,279,300,3	duplicate(���̎�l#Okolnir)	���̎�l#N3_04	1753,4,4
que_qsch04.gat,266,296,3	duplicate(���̎�l#Okolnir)	���̎�l#N4_01	1753,4,4
que_qsch04.gat,271,283,3	duplicate(���̎�l#Okolnir)	���̎�l#N4_02	1753,4,4
que_qsch04.gat,270,307,3	duplicate(���̎�l#Okolnir)	���̎�l#N4_03	1753,4,4
que_qsch04.gat,279,300,3	duplicate(���̎�l#Okolnir)	���̎�l#N4_04	1753,4,4
que_qsch05.gat,266,296,3	duplicate(���̎�l#Okolnir)	���̎�l#N5_01	1753,4,4
que_qsch05.gat,271,283,3	duplicate(���̎�l#Okolnir)	���̎�l#N5_02	1753,4,4
que_qsch05.gat,270,307,3	duplicate(���̎�l#Okolnir)	���̎�l#N5_03	1753,4,4
que_qsch05.gat,279,300,3	duplicate(���̎�l#Okolnir)	���̎�l#N5_04	1753,4,4

-	script	�_�a�̎���#Okolnir	-1,{
	end;
OnTouch:
	set '@name$,strnpcinfo(2);
	set '@in,substr('@name$,4,1);
	hideonnpc;
	switch ('@in) {
	case 1: setarray '@n, 246,330,247,330,248,330; break;
	case 2: setarray '@n, 254,330,255,330,256,330; break;
	}
	for(set '@i, 0; '@i < getarraysize('@n); set '@i, '@i + 2)
		monster "this",'@n['@i],'@n['@i+1],"�_�a�̎���",1933,1,"�_�a�̎���#"+'@name$+"::OnKilled";
	end;
OnDisable:
	killmonster "this","�_�a�̎���#"+strnpcinfo(2)+"::OnKilled";
	hideonnpc;
	end;
OnKilled:
	end;
}
que_qaru01.gat,247,330,5	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#F1_01	1933,4,4
que_qaru01.gat,255,330,3	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#F1_02	1933,4,4
que_qaru02.gat,247,330,5	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#F2_01	1933,4,4
que_qaru02.gat,255,330,3	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#F2_02	1933,4,4
que_qaru03.gat,247,330,5	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#F3_01	1933,4,4
que_qaru03.gat,255,330,3	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#F3_02	1933,4,4
que_qaru04.gat,247,330,5	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#F4_01	1933,4,4
que_qaru04.gat,255,330,3	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#F4_02	1933,4,4
que_qaru05.gat,247,330,5	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#F5_01	1933,4,4
que_qaru05.gat,255,330,3	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#F5_02	1933,4,4
que_qsch01.gat,247,330,5	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#N1_01	1933,4,4
que_qsch01.gat,255,330,3	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#N1_02	1933,4,4
que_qsch02.gat,247,330,5	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#N2_01	1933,4,4
que_qsch02.gat,255,330,3	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#N2_02	1933,4,4
que_qsch03.gat,247,330,5	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#N3_01	1933,4,4
que_qsch03.gat,255,330,3	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#N3_02	1933,4,4
que_qsch04.gat,247,330,5	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#N4_01	1933,4,4
que_qsch04.gat,255,330,3	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#N4_02	1933,4,4
que_qsch05.gat,247,330,5	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#N5_01	1933,4,4
que_qsch05.gat,255,330,3	duplicate(�_�a�̎���#Okolnir)	�_�a�̎���#N5_02	1933,4,4

-	script	�E�B�b�V�����C�f��#boss	-1,{
OnDisable:
	killmonster "this","�E�B�b�V�����C�f��#"+strnpcinfo(2)+"::OnKilled";
	stopnpctimer;
	end;
OnFight:
	initnpctimer;
	end;
OnTimer1000:
	announce "�E�B�b�V�����C�f�� : �����܂ŒH�蒅�������c�c��̔Ԑl�͑S�ē|���ꂽ�Ɓc�c",0x9,0x00ff00;
	end;
OnTimer4000:
	announce "�E�B�b�V�����C�f�� : ��A�E�B�b�V�����C�f���I�@�S�͂œ�������}���悤!!",0x9,0x00ff00;
	end;
OnTimer5000:
	set '@name$,strnpcinfo(2);
	misceffect 72,"�E�B�b�V�����C�f��#"+'@name$+"_g";
	monster "this",252,340,"�E�B�b�V�����C�f��",1931,1,"�E�B�b�V�����C�f��#"+'@name$+"::OnKilled";
	stopnpctimer;
	end;
OnKilled:
	set '@name$,substr(strnpcinfo(2),0,2);
	if(!getmapmobs("this","�E�B�b�V�����C�f��#"+'@name$+"_b::OnKilled")) {
		donpcevent "okolnir#"+'@name$+"::OnStop";
		donpcevent "�E�B�b�V�����C�f��#"+'@name$+"_g::OnEnable";
		announce "�E�B�b�V�����C�f�� : �������c�c����ɏ��_�̌��P���󂯂鎑�i�����邱�Ƃ�F�߂悤�c�c",0x9,0x00ff00;
	}
	end;
}
que_qaru01.gat,1,5,0	duplicate(�E�B�b�V�����C�f��#boss)	�E�B�b�V�����C�f��#F1_b	139
que_qaru02.gat,1,5,0	duplicate(�E�B�b�V�����C�f��#boss)	�E�B�b�V�����C�f��#F2_b	139
que_qaru03.gat,1,5,0	duplicate(�E�B�b�V�����C�f��#boss)	�E�B�b�V�����C�f��#F3_b	139
que_qaru04.gat,1,5,0	duplicate(�E�B�b�V�����C�f��#boss)	�E�B�b�V�����C�f��#F4_b	139
que_qaru05.gat,1,5,0	duplicate(�E�B�b�V�����C�f��#boss)	�E�B�b�V�����C�f��#F5_b	139
que_qsch01.gat,1,5,0	duplicate(�E�B�b�V�����C�f��#boss)	�E�B�b�V�����C�f��#N1_b	139
que_qsch02.gat,1,5,0	duplicate(�E�B�b�V�����C�f��#boss)	�E�B�b�V�����C�f��#N2_b	139
que_qsch03.gat,1,5,0	duplicate(�E�B�b�V�����C�f��#boss)	�E�B�b�V�����C�f��#N3_b	139
que_qsch04.gat,1,5,0	duplicate(�E�B�b�V�����C�f��#boss)	�E�B�b�V�����C�f��#N4_b	139
que_qsch05.gat,1,5,0	duplicate(�E�B�b�V�����C�f��#boss)	�E�B�b�V�����C�f��#N5_b	139

-	script	�E�B�b�V�����C�f��#gift	-1,{
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
	set '@name$,substr('@map$,5,3);
	set '@num,substr('@map$,9,1);
	set '@GID,getcastledata('@name$+"g_cas0"+'@num+".gat",1);
	if(getcharid(2) == '@GID) {
		if(strcharinfo(0) != getguildmaster('@GID)) {
			cutin "wish_maiden12",1;
			mes "[�E�B�b�V�����C�f��]";
			mes "�F�A�悭�������܂œw�͂��Ă��ꂽ�B";
			mes "�c�c�l�Ԃ̒c���͂͑f���炵�����̂��B";
			mes "�������A�����~�]�ɖڂ�ῂ�ł��܂��B";
			next;
			mes "[�E�B�b�V�����C�f��]";
			mes "����ȕs���S�ȑ��݂����炱���A";
			mes "�_�����߂Ă���������̂�";
			mes "������b���c�c";
			next;
			mes "[�E�B�b�V�����C�f��]";
			mes "�����c�c�����";
			mes "���̓��A���̏u�Ԃ�";
			mes "���X�Ɛ����邪�������낤�B";
			mes "�����̉ߋ���������悤�Ȃ��Ƃق�";
			mes "�߂������̂͂Ȃ�����ȁB";
			close2;
			cutin "wish_maiden11",255;
			end;
		}
		if('@name$ == "aru") {
			setarray '@need,7835,7836,7837,7838,2513,7291,7293,7063,757;
			setarray '@amount,1,1,1,1,1,10,10,100,20;
			set '@gain, 2541; //�A�X�v���J
		}
		else if('@name$ == "sch") {
			setarray '@need,7830,7831,7832,7833,7834,2357,7510,969,757;
			setarray '@amount,1,1,1,1,1,1,100,10,20;
			set '@gain, 2383; //�u�������q���f
		}
		for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
			if(countitem('@need['@i]) >= '@amount['@i])
				set '@check, '@check + 1;
		}
		if('@check >= 9) {
			cutin "wish_maiden12",1;
			mes "[�E�B�b�V�����C�f��]";
			mes "���������z�������܂œ��B����";
			mes "����ɁA" +getitemname('@gain)+ "�̗͂�^����B";
			mes "���̂������̕i��";
			mes getitemname('@gain)+ "�̗͂����}�̂ŁB";
			mes "�b���グ��̂��c�c";
			next;
			mes "[�E�B�b�V�����C�f��]";
			mes "�̑�Ȃ郔�@���L���[��";
			mes "�\�͂���߂��Ă���c�c";
			next;
			mes "[�E�B�b�V�����C�f��]";
			mes "��́A�]���ɂЂƂA";
			mes "���ɂ�����Ƃ������̂𑡂낤�B";
			mes "�y���ނ��ǂ��B";
			next;
			mes "[�E�B�b�V�����C�f��]";
			mes "���w����W���m�[��";
			mes "�w���r�Z�t�x�o���ɉ���Ă݂��";
			mes "�������낤�B";
			next;
			cutin "wish_maiden32",1;
			mes "[�E�B�b�V�����C�f��]";
			mes "���̏ꏊ�ɖ߂邽�߂̃Q�[�g��";
			mes "�J���Ă�낤�B";
			mes "�I�[�R���j���͉i���ł͂Ȃ�����ȁc�c";
			mes "�t�t�t�c�c";
			for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1)
				delitem '@need['@i],'@amount['@i];
			getitem '@gain,1;
			getitem 7840,1;
			initnpctimer;
			hideonnpc;
			hideoffnpc "to_agit_gate#"+substr(strnpcinfo(2),0,2);
			announce "�M���h["+ GetGuildName('@GID) +"]�̃M���h�}�X�^�[["+ strcharinfo(0) +"]�ɂ���āA�_��A�C�e��["+getitemname('@gain)+"]���a�����܂����B",0;
			close2;
			cutin "wish_maiden11",255;
			end;
		}
		else {
			cutin "wish_maiden13",1;
			mes "[�E�B�b�V�����C�f��]";
			mes "���������z�������܂œ��B����";
			mes "����ɁA" +getitemname('@gain)+ "��";
			mes "�͂�^����c�c";
			mes "�ƌ��������Ƃ��낾���A";
			mes getitemname('@gain)+ "�̗͂�������}�́c�c";
			mes "�K�v�ȃA�C�e�����s�����Ă���ȁB";
			next;
			mes "[�E�B�b�V�����C�f��]";
			mes "�c�c�����Y��Ă��Ȃ����H";
			close2;
		}
	}
	cutin "wish_maiden11",255;
	end;

OnEnable:
	hideoffnpc;
	initnpctimer;
	end;
OnDisable:
	hideonnpc;
	stopnpctimer;
	end;
OnTimer280000:
	announce "�E�B�b�V�����C�f�� : �I�[�R���j���͊Ԃ��Ȃ��Ăі���ɂ��B��������̏ꏊ�ɖ߂��Ă�낤�B",0x9,0x00ff00;
	end;
OnTimer290000:
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);
	callfunc "GodSEAgitWarp",strnpcinfo(2);
	hideonnpc "to_agit_gate#"+substr(strnpcinfo(2),0,2);
	end;
OnTimer300000:
	set '@name$,substr(strnpcinfo(2),0,2);
	donpcevent "okolnir#"+'@name$+"::OnDisable";
	donpcevent "okolnir_time01#"+'@name$+"::OnEnable";
	set getvariableofnpc('gqse_mobcount,"Gate_manager#"+ '@name$),0;
	set getvariableofnpc('gqse_pccount,"Gate_manager#"+ '@name$),0;
	set getvariableofnpc('gqse_cagecount,"gdtimer01#"+ '@name$),0;
	set getvariableofnpc('gqse_sealcount,"�E�B�b�V�����C�f��#"+ '@name$ +"_b"),0;
	stopnpctimer;
	end;
}
que_qaru01.gat,252,340,3	duplicate(�E�B�b�V�����C�f��#gift)	�E�B�b�V�����C�f��#F1_g	403
que_qaru02.gat,252,340,3	duplicate(�E�B�b�V�����C�f��#gift)	�E�B�b�V�����C�f��#F2_g	403
que_qaru03.gat,252,340,3	duplicate(�E�B�b�V�����C�f��#gift)	�E�B�b�V�����C�f��#F3_g	403
que_qaru04.gat,252,340,3	duplicate(�E�B�b�V�����C�f��#gift)	�E�B�b�V�����C�f��#F4_g	403
que_qaru05.gat,252,340,3	duplicate(�E�B�b�V�����C�f��#gift)	�E�B�b�V�����C�f��#F5_g	403
que_qsch01.gat,252,340,3	duplicate(�E�B�b�V�����C�f��#gift)	�E�B�b�V�����C�f��#N1_g	403
que_qsch02.gat,252,340,3	duplicate(�E�B�b�V�����C�f��#gift)	�E�B�b�V�����C�f��#N2_g	403
que_qsch03.gat,252,340,3	duplicate(�E�B�b�V�����C�f��#gift)	�E�B�b�V�����C�f��#N3_g	403
que_qsch04.gat,252,340,3	duplicate(�E�B�b�V�����C�f��#gift)	�E�B�b�V�����C�f��#N4_g	403
que_qsch05.gat,252,340,3	duplicate(�E�B�b�V�����C�f��#gift)	�E�B�b�V�����C�f��#N5_g	403

que_qaru01.gat,252,339,0	warp	to_agit_gate#F1	1,1,arug_cas01.gat,157,369
que_qaru02.gat,252,339,0	warp	to_agit_gate#F2	1,1,arug_cas02.gat,349,355
que_qaru03.gat,252,339,0	warp	to_agit_gate#F3	1,1,arug_cas03.gat,321,153
que_qaru04.gat,252,339,0	warp	to_agit_gate#F4	1,1,arug_cas04.gat,321,153
que_qaru05.gat,252,339,0	warp	to_agit_gate#F5	1,1,arug_cas05.gat,321,153
que_qsch01.gat,252,339,0	warp	to_agit_gate#N1	1,1,schg_cas01.gat,369,306
que_qsch02.gat,252,339,0	warp	to_agit_gate#N2	1,1,schg_cas02.gat,177,355
que_qsch03.gat,252,339,0	warp	to_agit_gate#N3	1,1,schg_cas03.gat,81,95
que_qsch04.gat,252,339,0	warp	to_agit_gate#N4	1,1,schg_cas04.gat,369,306
que_qsch05.gat,252,339,0	warp	to_agit_gate#N5	1,1,schg_cas05.gat,369,306

-	script	okolnir_timer#Okolnir	-1,{
OnEnable:
	initnpctimer;
	set $GodSEActivete['castle],2;
	end;
OnReset:
	set $GodSEActivete['castle],0;
	stopnpctimer;
	end;
OnTimer3600000:
	if($GodSEActivete['castle] < 14) {
		set $GodSEActivete['castle],$GodSEActivete['castle]+1;
		initnpctimer;
	}
	else if($GodSEActivete['castle] == 14) {
		set $GodSEActivete['castle],0;
		set '@name$,strnpcinfo(2);
		hideoffnpc "�E�B�b�V�����C�f��#"+'@name$+"_e";
		hideoffnpc "�s�A���b�g#"+'@name$;
		hideoffnpc "�E�B�b�V�����C�f��#"+'@name$+"_b";
		stopnpctimer;
	}
	end;
OnInit:
	set '@dummy,getmapxy('@map$,'@dummy,'@dummy,1);		//'@map$�ȊO�̓_�~�[
	if('@map$ == "-")					//duplicate���͉������Ȃ�
		end;
	set '@name$,substr(strnpcinfo(2),0,1);
	set '@num,substr(strnpcinfo(2),1,1);
	if('@name$ == "F")
		set 'castle,0;
	else if('@name$ == "N")
		set 'castle,5;
	if('@num > 0)
		set 'castle,'castle+'@num-1;
	if($GodSEActivete['castle] >= 2)
		initnpctimer;
	end;
}
que_qaru01.gat,1,6,0	duplicate(okolnir_timer#Okolnir)	okolnir_time01#F1	139
que_qaru02.gat,1,6,0	duplicate(okolnir_timer#Okolnir)	okolnir_time01#F2	139
que_qaru03.gat,1,6,0	duplicate(okolnir_timer#Okolnir)	okolnir_time01#F3	139
que_qaru04.gat,1,6,0	duplicate(okolnir_timer#Okolnir)	okolnir_time01#F4	139
que_qaru05.gat,1,6,0	duplicate(okolnir_timer#Okolnir)	okolnir_time01#F5	139
que_qsch01.gat,1,6,0	duplicate(okolnir_timer#Okolnir)	okolnir_time01#N1	139
que_qsch02.gat,1,6,0	duplicate(okolnir_timer#Okolnir)	okolnir_time01#N2	139
que_qsch03.gat,1,6,0	duplicate(okolnir_timer#Okolnir)	okolnir_time01#N3	139
que_qsch04.gat,1,6,0	duplicate(okolnir_timer#Okolnir)	okolnir_time01#N4	139
que_qsch05.gat,1,6,0	duplicate(okolnir_timer#Okolnir)	okolnir_time01#N5	139

que_qaru01.gat,116,313,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru01.gat,120,285,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru01.gat,117,236,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru01.gat,103,223,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru01.gat,85,204,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru01.gat,79,186,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru01.gat,73,167,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru01.gat,68,150,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru01.gat,71,128,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru01.gat,69,118,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru01.gat,117,78,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru01.gat,110,79,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru01.gat,141,80,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru01.gat,158,84,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru01.gat,193,104,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru01.gat,119,269,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru01.gat,155,77,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru01.gat,110,317,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru01.gat,115,295,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru01.gat,116,256,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru01.gat,113,242,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru01.gat,99,223,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru01.gat,94,216,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru01.gat,77,198,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru01.gat,70,174,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru01.gat,72,147,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru01.gat,64,134,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru01.gat,77,107,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru01.gat,84,88,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru01.gat,98,82,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru01.gat,129,79,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru01.gat,91,124,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru01.gat,173,95,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru01.gat,179,127,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru01.gat,195,120,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru01.gat,178,159,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru01.gat,88,145,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru01.gat,94,157,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru01.gat,95,177,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru01.gat,129,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru01.gat,154,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru01.gat,170,187,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru01.gat,194,180,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru01.gat,214,181,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru01.gat,243,199,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru02.gat,116,313,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru02.gat,120,285,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru02.gat,117,236,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru02.gat,103,223,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru02.gat,85,204,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru02.gat,79,186,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru02.gat,73,167,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru02.gat,68,150,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru02.gat,71,128,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru02.gat,69,118,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru02.gat,117,78,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru02.gat,110,79,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru02.gat,141,80,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru02.gat,158,84,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru02.gat,193,104,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru02.gat,119,269,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru02.gat,155,77,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru02.gat,110,317,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru02.gat,115,295,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru02.gat,116,256,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru02.gat,113,242,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru02.gat,99,223,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru02.gat,94,216,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru02.gat,77,198,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru02.gat,70,174,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru02.gat,72,147,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru02.gat,64,134,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru02.gat,77,107,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru02.gat,84,88,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru02.gat,98,82,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru02.gat,129,79,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru02.gat,91,124,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru02.gat,173,95,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru02.gat,179,127,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru02.gat,195,120,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru02.gat,178,159,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru02.gat,88,145,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru02.gat,94,157,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru02.gat,95,177,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru02.gat,129,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru02.gat,154,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru02.gat,170,187,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru02.gat,194,180,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru02.gat,214,181,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru02.gat,243,199,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru03.gat,116,313,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru03.gat,120,285,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru03.gat,117,236,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru03.gat,103,223,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru03.gat,85,204,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru03.gat,79,186,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru03.gat,73,167,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru03.gat,68,150,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru03.gat,71,128,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru03.gat,69,118,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru03.gat,117,78,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru03.gat,110,79,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru03.gat,141,80,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru03.gat,158,84,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru03.gat,193,104,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru03.gat,119,269,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru03.gat,155,77,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru03.gat,110,317,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru03.gat,115,295,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru03.gat,116,256,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru03.gat,113,242,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru03.gat,99,223,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru03.gat,94,216,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru03.gat,77,198,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru03.gat,70,174,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru03.gat,72,147,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru03.gat,64,134,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru03.gat,77,107,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru03.gat,84,88,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru03.gat,98,82,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru03.gat,129,79,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru03.gat,91,124,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru03.gat,173,95,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru03.gat,179,127,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru03.gat,195,120,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru03.gat,178,159,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru03.gat,88,145,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru03.gat,94,157,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru03.gat,95,177,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru03.gat,129,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru03.gat,154,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru03.gat,170,187,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru03.gat,194,180,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru03.gat,214,181,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru03.gat,243,199,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru04.gat,116,313,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru04.gat,120,285,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru04.gat,117,236,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru04.gat,103,223,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru04.gat,85,204,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru04.gat,79,186,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru04.gat,73,167,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru04.gat,68,150,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru04.gat,71,128,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru04.gat,69,118,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru04.gat,117,78,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru04.gat,110,79,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru04.gat,141,80,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru04.gat,158,84,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru04.gat,193,104,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru04.gat,119,269,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru04.gat,155,77,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru04.gat,110,317,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru04.gat,115,295,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru04.gat,116,256,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru04.gat,113,242,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru04.gat,99,223,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru04.gat,94,216,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru04.gat,77,198,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru04.gat,70,174,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru04.gat,72,147,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru04.gat,64,134,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru04.gat,77,107,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru04.gat,84,88,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru04.gat,98,82,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru04.gat,129,79,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru04.gat,91,124,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru04.gat,173,95,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru04.gat,179,127,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru04.gat,195,120,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru04.gat,178,159,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru04.gat,88,145,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru04.gat,94,157,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru04.gat,95,177,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru04.gat,129,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru04.gat,154,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru04.gat,170,187,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru04.gat,194,180,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru04.gat,214,181,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru04.gat,243,199,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru05.gat,116,313,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru05.gat,120,285,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru05.gat,117,236,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru05.gat,103,223,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru05.gat,85,204,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru05.gat,79,186,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru05.gat,73,167,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru05.gat,68,150,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru05.gat,71,128,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru05.gat,69,118,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru05.gat,117,78,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru05.gat,110,79,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru05.gat,141,80,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru05.gat,158,84,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru05.gat,193,104,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru05.gat,119,269,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru05.gat,155,77,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qaru05.gat,110,317,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru05.gat,115,295,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru05.gat,116,256,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru05.gat,113,242,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru05.gat,99,223,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru05.gat,94,216,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru05.gat,77,198,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru05.gat,70,174,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru05.gat,72,147,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru05.gat,64,134,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru05.gat,77,107,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru05.gat,84,88,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru05.gat,98,82,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru05.gat,129,79,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru05.gat,91,124,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru05.gat,173,95,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru05.gat,179,127,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru05.gat,195,120,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru05.gat,178,159,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru05.gat,88,145,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru05.gat,94,157,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru05.gat,95,177,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru05.gat,129,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru05.gat,154,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru05.gat,170,187,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru05.gat,194,180,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qaru05.gat,214,181,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qaru05.gat,243,199,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch01.gat,116,313,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch01.gat,120,285,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch01.gat,117,236,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch01.gat,103,223,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch01.gat,85,204,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch01.gat,79,186,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch01.gat,73,167,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch01.gat,68,150,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch01.gat,71,128,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch01.gat,69,118,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch01.gat,117,78,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch01.gat,110,79,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch01.gat,141,80,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch01.gat,158,84,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch01.gat,193,104,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch01.gat,119,269,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch01.gat,155,77,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch01.gat,110,317,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch01.gat,115,295,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch01.gat,116,256,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch01.gat,113,242,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch01.gat,99,223,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch01.gat,94,216,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch01.gat,77,198,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch01.gat,70,174,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch01.gat,72,147,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch01.gat,64,134,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch01.gat,77,107,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch01.gat,84,88,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch01.gat,98,82,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch01.gat,129,79,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch01.gat,91,124,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch01.gat,173,95,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch01.gat,179,127,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch01.gat,195,120,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch01.gat,178,159,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch01.gat,88,145,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch01.gat,94,157,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch01.gat,95,177,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch01.gat,129,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch01.gat,154,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch01.gat,170,187,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch01.gat,194,180,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch01.gat,214,181,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch01.gat,243,199,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch02.gat,116,313,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch02.gat,120,285,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch02.gat,117,236,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch02.gat,103,223,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch02.gat,85,204,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch02.gat,79,186,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch02.gat,73,167,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch02.gat,68,150,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch02.gat,71,128,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch02.gat,69,118,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch02.gat,117,78,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch02.gat,110,79,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch02.gat,141,80,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch02.gat,158,84,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch02.gat,193,104,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch02.gat,119,269,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch02.gat,155,77,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch02.gat,110,317,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch02.gat,115,295,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch02.gat,116,256,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch02.gat,113,242,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch02.gat,99,223,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch02.gat,94,216,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch02.gat,77,198,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch02.gat,70,174,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch02.gat,72,147,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch02.gat,64,134,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch02.gat,77,107,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch02.gat,84,88,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch02.gat,98,82,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch02.gat,129,79,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch02.gat,91,124,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch02.gat,173,95,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch02.gat,179,127,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch02.gat,195,120,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch02.gat,178,159,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch02.gat,88,145,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch02.gat,94,157,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch02.gat,95,177,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch02.gat,129,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch02.gat,154,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch02.gat,170,187,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch02.gat,194,180,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch02.gat,214,181,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch02.gat,243,199,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch03.gat,116,313,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch03.gat,120,285,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch03.gat,117,236,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch03.gat,103,223,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch03.gat,85,204,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch03.gat,79,186,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch03.gat,73,167,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch03.gat,68,150,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch03.gat,71,128,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch03.gat,69,118,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch03.gat,117,78,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch03.gat,110,79,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch03.gat,141,80,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch03.gat,158,84,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch03.gat,193,104,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch03.gat,119,269,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch03.gat,155,77,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch03.gat,110,317,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch03.gat,115,295,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch03.gat,116,256,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch03.gat,113,242,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch03.gat,99,223,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch03.gat,94,216,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch03.gat,77,198,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch03.gat,70,174,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch03.gat,72,147,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch03.gat,64,134,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch03.gat,77,107,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch03.gat,84,88,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch03.gat,98,82,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch03.gat,129,79,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch03.gat,91,124,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch03.gat,173,95,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch03.gat,179,127,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch03.gat,195,120,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch03.gat,178,159,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch03.gat,88,145,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch03.gat,94,157,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch03.gat,95,177,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch03.gat,129,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch03.gat,154,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch03.gat,170,187,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch03.gat,194,180,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch03.gat,214,181,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch03.gat,243,199,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch04.gat,116,313,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch04.gat,120,285,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch04.gat,117,236,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch04.gat,103,223,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch04.gat,85,204,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch04.gat,79,186,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch04.gat,73,167,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch04.gat,68,150,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch04.gat,71,128,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch04.gat,69,118,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch04.gat,117,78,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch04.gat,110,79,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch04.gat,141,80,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch04.gat,158,84,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch04.gat,193,104,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch04.gat,119,269,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch04.gat,155,77,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch04.gat,110,317,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch04.gat,115,295,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch04.gat,116,256,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch04.gat,113,242,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch04.gat,99,223,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch04.gat,94,216,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch04.gat,77,198,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch04.gat,70,174,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch04.gat,72,147,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch04.gat,64,134,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch04.gat,77,107,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch04.gat,84,88,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch04.gat,98,82,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch04.gat,129,79,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch04.gat,91,124,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch04.gat,173,95,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch04.gat,179,127,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch04.gat,195,120,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch04.gat,178,159,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch04.gat,88,145,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch04.gat,94,157,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch04.gat,95,177,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch04.gat,129,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch04.gat,154,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch04.gat,170,187,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch04.gat,194,180,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch04.gat,214,181,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch04.gat,243,199,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch05.gat,116,313,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch05.gat,120,285,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch05.gat,117,236,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch05.gat,103,223,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch05.gat,85,204,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch05.gat,79,186,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch05.gat,73,167,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch05.gat,68,150,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch05.gat,71,128,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch05.gat,69,118,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch05.gat,117,78,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch05.gat,110,79,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch05.gat,141,80,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch05.gat,158,84,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch05.gat,193,104,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch05.gat,119,269,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch05.gat,155,77,0,0	monster	�K�[�f���L�[�p�[	1932,1,180000,0,0
que_qsch05.gat,110,317,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch05.gat,115,295,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch05.gat,116,256,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch05.gat,113,242,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch05.gat,99,223,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch05.gat,94,216,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch05.gat,77,198,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch05.gat,70,174,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch05.gat,72,147,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch05.gat,64,134,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch05.gat,77,107,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch05.gat,84,88,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch05.gat,98,82,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch05.gat,129,79,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch05.gat,91,124,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch05.gat,173,95,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch05.gat,179,127,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch05.gat,195,120,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch05.gat,178,159,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch05.gat,88,145,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch05.gat,94,157,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch05.gat,95,177,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch05.gat,129,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch05.gat,154,196,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch05.gat,170,187,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch05.gat,194,180,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0
que_qsch05.gat,214,181,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,600000,0,0
que_qsch05.gat,243,199,0,0	monster	�K�[�f���E�H�b�`���[	1933,1,1200000,0,0