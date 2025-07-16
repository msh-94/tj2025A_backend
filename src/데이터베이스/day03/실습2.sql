drop database if exists 실습2;
create database 실습2;
use 실습2;
set sql_safe_updates = 0;
# [문제1]
create table members(
	member_id varchar(20) ,
    member_name varchar(50) not null ,
    email varchar(100) not null unique , 
    join_date datetime default now() , 
    points int default 0 ,
    constraint primary key(member_id)
);
# [문제2]
insert into members(member_id , member_name , email ,points) values ("user01" , "김철수" , "chulsoo@example.com" , 1000);
# [문제3]
select member_id , email from members;
# [문제4]
 update members set points = 1500 where member_id = "user01";
 # [문제5]
 delete from members where member_id = "user01";
select * from members;

# [문제6]
create table products(
	product_code int auto_increment ,
    product_name varchar(100) not null,
    price int unsigned not null ,
    stock_quantity int not null default 0 ,
    category varchar(50) ,
    constraint primary key(product_code)
);
# [문제7]
insert into products(product_name , price , stock_quantity , category) values ("프리미엄키보드" , 120000 , 50 , "컴퓨터주변기기");
# [문제8]
select product_name , price from products where category = "컴퓨터주변기기";
# [문제9]
update products set stock_quantity = 45 where product_name = "프리미엄키보드";
# [문제10]
delete from products where product_name = "프리미엄키보드";
select * from products;