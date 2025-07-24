drop database if exists 과제5;
create database 과제5;
use 과제5;

create table product(
	물품번호_pk int auto_increment primary key,
    닉네임 varchar(20) not null unique,
    비밀번호 int not null,
    물품명 varchar(30) not null,
    가격 int not null,
    설명 longtext ,
    판매여부 varchar(4) default '판매중',
    등록날짜 date default now()
);

create table inquiry(
	문의번호_pk int auto_increment primary key,
    물품번호_pk int ,
    i닉네임 varchar(20) not null unique,
    i비밀번호 int not null,
    문의내용 longtext not null,
    문의등록날짜 date default now(),
    constraint foreign key(물품번호_pk) references product(물품번호_pk)
);
insert into product (닉네임, 비밀번호, 물품명, 가격, 설명)values ('coolguy12', 1234, '게이밍 키보드', 45000, 'LED 백라이트가 있는 기계식 키보드');
insert into product (닉네임, 비밀번호, 물품명, 가격, 설명)values ('smartgirl88', 5678, '중고 아이폰 12', 350000, '생활 기스 조금 있음, 배터리 85%');
insert into product (닉네임, 비밀번호, 물품명, 가격, 설명)values ('techman21', 9999, '블루투스 스피커', 23000, '야외 사용 가능, 충전식 배터리 포함');
insert into product (닉네임, 비밀번호, 물품명, 가격, 설명)values ('lovelycat', 4321, '고양이 집', 15000, '겨울용 보온 집, 새제품');
insert into product (닉네임, 비밀번호, 물품명, 가격, 설명)values ('bookworm55', 7777, '토익 교재 세트', 10000, '해설집 포함, 형광펜 표시 약간 있음');

insert into inquiry (물품번호_pk, i닉네임, i비밀번호, 문의내용)values (1, 'asker101', 1111, '이 키보드에는 숫자패드도 포함되어 있나요?');
insert into inquiry (물품번호_pk, i닉네임, i비밀번호, 문의내용)values (2, 'phonefan', 2222, '액정 깨진 부분은 없나요?');
insert into inquiry (물품번호_pk, i닉네임, i비밀번호, 문의내용)values (3, 'musiclover', 3333, '완충 시 몇 시간 사용 가능한가요?');
insert into inquiry (물품번호_pk, i닉네임, i비밀번호, 문의내용)values (4, 'catmom', 4444, '고양이 집 사이즈가 어떻게 되나요?');
insert into inquiry (물품번호_pk, i닉네임, i비밀번호, 문의내용)values (5, 'student777', 5555, '교재는 몇 년도 버전인가요?');