--검색을 위한 데미데이터 추가 입력
insert into board
	values (seq_board_num.nextval, 'aaaaaaaaaa', 'aaa', 'kopo', sysdate, 0);
insert into board
	values (seq_board_num.nextval, 'bbbbbbbbbb', 'bbb', 'kopo', sysdate, 0);
insert into board
	values (seq_board_num.nextval, 'cccccccccc', 'ccc', 'kopo', sysdate, 0);
insert into board
	values (seq_board_num.nextval, 'dddddddddd', 'dddd', 'kopo', sysdate, 0);		

commit;