# Java Simple Registration System

Step by step...

1) Download MySQL any programm and setting it...

2) Download MySQL Connector from https://dev.mysql.com/downloads/connector/j/ and add it to Structure of the Project ( you need the .jar file in the folder)

3) You can fined the database "Students.sql" in the project folder

4) Set up your database settings in the fields:

Class.forName("com.mysql.cj.jdbc.Driver");

con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentIT", "root", "");

5) Now you can add, remove and update students

#ENJOY !!!


