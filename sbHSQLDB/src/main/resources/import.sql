drop table if exists caseCWS;
create table caseCWS (case_id int not null primary key, childid int, createDate timestamp, modifyDate timestamp, deleted int );
drop table if exists child;
create table child (child_id int not null primary key, first varchar(30),last varchar(30),gender varchar(5), dob date, image varchar(40) );
drop table if exists statusUpdates;
create table statusUpdates (status_id int not null primary key, caseid int, statusUpdate varchar(250), createDate timestamp, modifyDate timestamp, deleted int );
     
insert into child (child_id, first, last, gender, dob, image) values (10, 'jim', 'smith', 'M', '2007-01-10', 'img/jim1.jpg');
insert into child (child_id, first, last, gender, dob, image) values (11, 'sally', 'johnson', 'F', '2001-01-05', 'img/sally1.jpg');
insert into caseCWS (case_id, child_id, createDate) values (1000, 10, now());
insert into statusUpdates (status_id, case_id, statusUpdate, createDate) values (50, 1000, 'this is the first status update for this case. Jim is doing well', now());
insert into statusUpdates (status_id, case_id, statusUpdate,  createDate) values (51, 1000, 'this is the second status update for this case. Jim is doing well', now());