CREATE DATABASE altr;
USE altr;

create TABLE book(
    characterId INTEGER PRIMARY KEY,
    firstName varchar(30) not null,
    lastName varchar(30) not null,
    occupation varchar(20) not null,
    age INTEGER
);

insert into book(characterId, firstname, lastname, occupation, age)
values(001,'Sherlock','Holmes','Private Detective',60);

insert into book(characterId, firstname, lastname, occupation, age)
values(2,'John','Watson','Assistant',80);

commit;




