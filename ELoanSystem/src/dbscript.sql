DROP DATABASE IF EXISTS eloanb7;

CREATE DATABASE eloanb7;

USE eloanb7;

CREATE TABLE loaninfo(
applno INT PRIMARY KEY AUTO_INCREMENT,
purpose VARCHAR(40) NOT NULL,
amtrequest INT(40) NOT NULL,
doa VARCHAR(20),
bstructure VARCHAR(20),
bindicator VARCHAR(20),
tindicator VARCHAR(20),
address VARCHAR(40),
emailid VARCHAR(20) NOT NULL UNIQUE,
mobileno CHAR(10) NOT NULL UNIQUE,
status VARCHAR(20),
username varchar(20),
constraint fk_username
foreign key(username) references eloanb7_users(username)

);


 
 CREATE TABLE eloanb7_users(
 	username varchar(20) primary key,
 	password varchar(20) not null,
 	role varchar(10) not null
 ); 
 
 INSERT INTO eloanb7_users VALUES
 ('admin','admin','ADMIN');
 	

 COMMIT;