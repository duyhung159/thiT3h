Create database T3H
go

use T3H
go

Create table t3hT1 (
	username varchar(25) PRIMARY KEY,
	avartar varchar(200),
	email varchar(100),
	full_name varchar(100),
	status tinyint,
	source varchar(15),
	password varchar(200)
);

insert into t3hT1 (username,avartar,email,full_name,status,source,password) values ('hung','null','duyhung@gmail.com','duy hung','1','none','123')
insert into t3hT1 (username,avartar,email,full_name,status,source,password) values ('hoang','null','huyhoang@gmail.com','huy hoang','0','none','321')

select * from t3hT1