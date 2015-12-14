create table member (
mb_no number(10),
mb_id varchar2(20),
mb_password varchar2(20),
mb_name varchar2(20),
mb_address varchar2(20),
mb_registerDate Date,
mb_email varchar2(20),
mb_type varchar2(20),
mb_level number(10),
primary key(car_mb_no)
);



desc member;
select * from member;
drop table member purge;

delete from member where mb_no < 6;

insert into member values(1,'test','test','test','test',sysdate,'test');