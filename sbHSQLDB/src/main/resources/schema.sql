drop table if exists caseCWS;
create table caseCWS
   (caseid int not null primary key,
    childid int,
    createDate timestamp,
    modifyDate timestamp,
    deleted int
    );
drop table if exists child;
create table child
   (childid int not null primary key,
    first varchar(30),
    last varchar(30),
    gender varchar(5),
    dob date,
    image varchar(40)
    );
drop table if exists statusUpdates;
create table statusUpdates
    (statusid int not null primary key,
     caseid int,
     statusUpdate varchar(250),
     createDate timestamp,
     modifyDate timestamp,
     deleted int
     );