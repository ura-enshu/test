drop database if exists sampledb_urano;
create database sampledb_urano;
use sampledb_urano;

create table sample_table(
No int,
name varchar(255),
age int,
Mail varchar(255)
);

insert into sample_table values(1,"Yamada",21,"xxx@yahoo.co.jp");
insert into sample_table values(2,"Sato",39,"yyy@google.com");
insert into sample_table values(3,"Harada",44,"zzz@yahoo.co.jp");