create table department(
dept_code int,
dept_name varchar(10),
primary key(dept_name));

create table student(
std_id varchar(10),
std_name varchar(50),
f_name varchar(50),
m_name varchar(50),
address varchar(50),
contact_no varchar(12),
date_of_birth varchar(20),
password varchar(20),
primary key(std_id));

create table admission_info(
std_id varchar(10),
admitted_semester varchar(20),
year_of_admission varchar(4),
dept_name varchar(10),
foreign key (std_id) references student(std_id),
foreign key (dept_name) references department(dept_name));

create table course(
course_code varchar(10),
title varchar(50),
level_term varchar(5),
dept_name varchar(10),
credit varchar(10),
primary key (course_code),
foreign key (dept_name) references department(dept_name));

create table result(
std_id varchar(10),
course_code varchar(10),
gpa numeric(2,1),
exam_type varchar(10),
exam_date varchar(20),
foreign key (std_id) references student(std_id),
foreign key (course_code) references course(course_code));

create table session_clearance(
std_id varchar(10),
level_term varchar(5), 
session_fee numeric(8,2), 
payment_amount numeric(8,2),
pay_status varchar(20),
foreign key (std_id) references student(std_id));

select *from department;
select *from student;
select *from admission_info;
select *from course;
select *from result;
select *from session_clearance;