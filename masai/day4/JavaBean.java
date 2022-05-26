package com.masai.day4;

 public class JavaBean {

// defining instance variables
	String name;
	int rollno;
 	int age;
	int marks;
	
// This is zero argument constructor and this is the constructor (No further use of it)

	public JavaBean() {
		
	}
	
	
// This is parameterized constructor
	
	public JavaBean(String name, int rollno, int age, int marks) {
		this.name = name;
		this.rollno =rollno;
		this.age = age;
		this.marks = marks;
	}
	

// Performing encapsulation here :-
	public void details() {
		if(age>18 || marks>30) {
			System.out.println("Your name is " + name);
			System.out.println("Your rollno is " + rollno);
			System.out.println("Your age is " + age);
			System.out.println("Your marks is " + marks);

		}
		else {
			System.out.println("below Age , data not found !");

		}
	}

	
	
	public static void main(String[] args) {

		JavaBean j2 = new JavaBean("Vibhav",23,22,35);
		j2.details();

     } 
  }
 