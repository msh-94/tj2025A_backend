drop database if exists exam10;
create database exam10;
use exam10;
set SQL_SAFE_UPDATES = 0;

create table board(
	bno int auto_increment ,
    bcontent longtext not null,
    bwriter varchar(30) not null,
    constraint primary key(bno)
);

# 샘플 
insert into board(bcontent , bwriter) values( '안녕하세요','유재석' );
insert into board(bcontent , bwriter) values( '반갑습니다','강호동' );
insert into board(bcontent , bwriter) values( '수고하세요','신동엽' );
insert into board(bcontent , bwriter) values( '운전할게요','이수근' );
insert into board(bcontent , bwriter) values( '배고프네요','이광수' );

select * from board;