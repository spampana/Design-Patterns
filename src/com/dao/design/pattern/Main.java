package com.dao.design.pattern;

public class Main {
	public static void main(String[] args) {
	      StudentDao studentDao = new StudentDaoImpl();

	      //print all students
	      for (Student student : studentDao.getAllStudents()) {
	         System.out.println("Student: [RollNo : "
	            +student.getRollNo()+", Name : "+student.getName()+" ]");
	      }


	      //update student
	      Student student =studentDao.getAllStudents().get(0);
	      student.setName("Michael");
	      studentDao.updateStudent(student);

	      //get the student
	      studentDao.getStudent(0);
	      System.out.println("Student: [RollNo : "
	         +student.getRollNo()+", Name : "+student.getName()+" ]");		
	   }
}
/*
You want to implement data access mechanisms to access and manipulate data in a persistent storage.
You want to decouple the persistent storage implementation from the rest of your application.
You want to provide a uniform data access API for a persistent mechanism to various types of data sources, such as RDBMS, LDAP, OODB, XML repositories, flat files, and so on.
You want to organize data access logic and encapsulate proprietary features to facilitate maintainability and portability.

DAO design pattern is way to reduce coupling between 
Business logic and  Persistence logic
 
The Data Access Object approach provides flexibility to change an
application’s persistence mechanism over time without the need to re-engineer
application logic that interacts with the Data Access Object tier

DAO or Data Access Object design pattern is good example of 
abstraction and encapsulation object oriented principles

The Data Access Object (DAO) pattern provides an abstraction layer between 
the business logic tier (business object) and the persistent storage tier 
(data source). Business objects access data sources via data access objects. 

This abstraction layer encapsulates the persistent storage type/vendor 
implementation. Ideally, changes made to the data source, such as switching 
database vendors or type, should not modify the business objects; 
only the data access objects themselves would need to change.





 */
