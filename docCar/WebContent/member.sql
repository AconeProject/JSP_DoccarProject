create table car_member (
car_mb_no number(10),
car_mb_id varchar2(20),
car_mb_password varchar2(20),
car_mb_name varchar2(20),
car_mb_address varchar2(20),
car_mb_registerDate Date,
car_mb_email varchar2(20),
car_mb_type varchar2(20),
primary key(car_mb_no)
);



desc member;
select * from member;
drop table member purge;

delete from member where mb_no < 6;

insert into member values(1,'test','test','test','test',sysdate,'test');