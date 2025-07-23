drop database if exists hardexam1;
create database hardexam1;
use hardexam1;
set sql_safe_updates = 0;

create table account(
	bno int auto_increment not null unique,
	banknum varchar(30) ,
    apassword int not null ,
    money int default 0,
    constraint primary key(banknum)    
);

select * from account;
create table accountLog(
	logno int auto_increment ,
    banknump varchar(30) ,
    banknumr varchar(30) ,
    ltime datetime default now(),
    content varchar(5) ,
    transMoney varchar(20),
    nowMoney int ,
    constraint foreign key(banknump) references account(banknum),
    constraint foreign key(banknumr) references account(banknum),
    constraint primary key(logno)
);
