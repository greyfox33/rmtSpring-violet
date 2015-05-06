insert into child (childid, first, last, gender, dob, image) values
   (10, 'jim', 'smith', 'M', '2007-01-10', 'img/jim1.jpg');
insert into child (childid, first, last, gender, dob, image) values
   (11, 'sally', 'johnson', 'F', '2001-01-05', 'img/sally1.jpg');
insert into caseCWS (caseid, childid, createDate) values (1000, 10, now());
insert into statusUpdates (statusid, caseid, statusUpdate, createDate) values
   (50, 1000, 'this is the first status update for this case. Jim is doing well', now());
insert into statusUpdates (statusid, caseid, statusUpdate,  createDate) values
   (51, 1000, 'this is the second status update for this case. Jim is doing well', now());