drop database if exists mydb0722;
create database mydb0722;
use mydb0722;


create table Waiting(
	wno int auto_increment,
	phone varchar(13) not null,
    count int not null ,
    constraint primary key(wno)
);
select * from waiting;
  