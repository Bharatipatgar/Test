1) create table Student;
( studentid int,
studentname varchar(10),
stu_address varchar(20),
email varchar(20),
stu_rollno int);

2)INSERT INTO Student(studentid,studentname,stu_address,email,stu_rollno)
values(1,"abc",'btm','abc@gmail.com',2),
(2,"xyz",'btm','xyz@gmail.com',3),
(3,"pqr",'btm','pqr@gmail.com',4),
(4,"abc",'btm','abc@gmail.com',5),
(5,"xyz",'jpnagar','xyz@gmail.com',6);

3)UNIQUE and NOT NULL is the constraints in this unique does not allows duplicate values and NOT NULL does not allows null values into the column.

5) ALTER TABLE tablename ADD COLUMN columnname datatype;
   EX: ALTER TABLE Student ADD COLUMN section varchar(10);

6)ALTER TABLE tablename DROP COLUMN columnname;
  Ex:ALTER TABLE Student DROP COLUMN stu_rollno;

7)ALTER TABLE tablename RENAME COLUMN columnname to columnname;
 Alter table student rename column studentname to stu_name;

8)ALTER TABLE tablename CHANGE COLUMN columnname to columnname datatype;
 Ex: ALTER TABLE Student CHANGE COLUMN emailvarchar to stu_email varchar (20);																																																																			



