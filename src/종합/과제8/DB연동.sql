drop database if exists mydb0722;
create database mydb0722;
use mydb0722;

create table test(
	content varchar(30)
);
select * from test;

create table Waiting(
	phone varchar(13) not null,
    count int not null 
);
select * from waiting;
  