//====================================================================
//Ragnarok Online EP4.0(J) Marriage System      V1.0
//====================================================================
prt_church.gat,105,100,4	script	�{�q�R���p�j�I��	71,{
	mes "[�n�b�s�[�}���[]";
	mes "�{�q�Ƃ́A�K���𖲌���";
	mes "�S�Ă̎q���̊�]�ł��B";
	mes "���₨��A���������āc�c";
	mes "���Ȃ��A�{�q����������";
	mes "����������̂ł����H";
	next;
	switch (select("�{�q���g�ɂ��ĕ�������","�{�q���g���Ăǂ�����ł���","�{�q���g��\�����݂���","���͖��G�̃\���R�c�I")) {
	case 1:
		mes "[�n�b�s�[�}���[]";
		mes "����̓e�X�g�p�̎b�菈���ł�";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�{�q�ɂȂ�ƃp�����[�^�[���ʏ���";
		mes "�Ⴍ�Ȃ�A�]�����ł��Ȃ��Ȃ�܂��B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "��x�{�q�ɂȂ�Ό��ɖ߂邱�Ƃ��o���Ȃ���";
		mes "�ǂ�Ȃ��Ƃ����Ă��{�q�֌W��j�����鎖��";
		mes "�ł��܂���B";
		next;
		mes "�c";
		next;
		mes "�c�c";
		next;
		mes "�c�c���̎􂢂ł��ˁB";
		close;
	case 2:
		mes "[�n�b�s�[�}���[]";
		mes "�O�l�����̃p�[�e�B�[��g�݁A����";
		mes "�b�������Ă��������B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�ŏ��ɕ��e�̖��O�����ɕ�e�̖��O";
		mes "�𐳊m�ɂ��`�����������B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�{�q���g�̎��O�ɁA�K�����e�̖��O��";
		mes "���m�ȒԂ�����m�F���������B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "���@�Ƃ��܂��ẮA";
		mes "���e�Ɏ��ł����s���Ă݂��";
		mes "��낵���Ǝv���܂��B����ɒʂ����";
		mes "���̖��O���������Ԃ�ł����A�����ʂ�";
		mes "�Ȃ���΁A���O���Ԉ���Ă���\����";
		mes "����܂��B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�܂��A����Ɉ�x���ł������āA";
		mes "�`���b�g�E�B���h�E�����̃{�^����";
		mes "�����܂��B��������ƁA";
		mes "���ł����X�g�ɑ���̖��O��";
		mes "�\������܂��̂őI�����܂��傤�B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "����̖��O���{�^���̍���";
		mes "�\������܂��̂ŁA���̖��O��";
		mes "Ctrl+C�ŃR�s�[���Ă����܂��B";
		mes "��������΁A�񍐂̍ۂ�";
		mes "Shift�{Insert�ő���̖��O��";
		mes "�Ăяo�����Ƃ��ł��܂��B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "1)����Ǝ��ł���b������";
		mes "2)���ł����X�g�ɕ\�����ꂽ";
		mes "����̖��O��I������";
		mes "3)�`���b�g�E�B���h�E�̍�����";
		mes "�\�����ꂽ����̖��O��";
		mes "Ctrl+C�ŃR�s�[����B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "���̕��@�ŁA���e�̖��O��";
		mes "�m���ɋL���ł��܂��A";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "���������ł��ƂȂ�ł��̂ŁA1��";
		mes "�����Ă݂܂��傤���B";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "Ctrl�{C�ŃR�s�[�������̂�";
		mes "Shift�{Insert�L�[�ŌĂяo���Ă݂�";
		mes "���������B��낵���ł����H";
		next;
		input '@test$;
		mes "[�n�b�s�[�}���[]";
		mes "�ǂ��ł��A�o���܂������H";
		next;
		mes "[�n�b�s�[�}���[]";
		mes "�ł́A���������������Ǝv�������肪";
		mes "���܂�����A�\�����݂𐥔�ǂ����B";
		close;
	case 3:
		mes "[�n�b�s�[�}���[]";
		mes "�ł́A���e�̖��O����͂��Ă�������";
		next;
		input '@papa$;
		mes "[�n�b�s�[�}���[]";
		mes "�ł́A��e�̖��O����͂��Ă�������";
		next;
		input '@mama$;
		mes "[�n�b�s�[�}���[]";
		mes "�{���ɗ{�q�ɂȂ�܂����H";
		next;
		if(select("�͂�","������")==2) {
			mes "[�n�b�s�[�}���[]";
			mes "�������K���Ȉ���ɂȁ`������I";
			close;
		}
		if(adoption('@papa$,'@mama$)==0) {
			mes "[�n�b�s�[�}���[]";
			mes "�����𖞂����ĂȂ��悤�ł���";
			close;
		}
		mes "[�n�b�s�[�}���[]";
		mes "����ŗ{�q���g�͐������܂���";
		mes "���j���\���グ�܂��I";
		mes "�������낤�Ɗ֌W�������邱�Ƃ͂���܂���";
		mes "���i�����K����";
		close;
	case 4:
		mes "[�n�b�s�[�}���[]";
		mes "��l�ŋ��������Ă�����";
		close;
	}
}