CREATE DATABASE altr;
USE altr;

create TABLE altr(
    employeeId INTEGER PRIMARY KEY,
    firstname varchar(30) not null,
    lastname varchar(30) not null,
    jobtittle varchar(20) not null,
    age INTEGER,
    salary INTEGER
);

select * from altr;

insert into altr(employeeId, firstname, lastname, jobtittle, age, salary)
values(001,'Sherlock','Holmes','Private Detective',60,12345);

select * from book;

insert into altr(employeeId, firstname, lastname, jobtittle, age, salary)
values(2,'John','Watson','Assistant',80,6789);

alter TABLE altr
DROP COLUMN salary;

commit;

ALTER TABLE altr
    RENAME TO book;

select * from book;
select concat(firstname, ' ',  lastname) as fullName from book
order by age desc ;

ALTER TABLE book
    RENAME COLUMN employeeId TO characterId;

ALTER TABLE book
    RENAME COLUMN jobtittle TO occupation;

ALTER TABLE book
    RENAME COLUMN firstname TO firstName;

ALTER TABLE book
    RENAME COLUMN lastname TO lastName;
