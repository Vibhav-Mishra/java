package com.masai.day9.ques1;


import java.util.Scanner;

public class Student {
	
	private int roll; 
	private String  name ;
	private int  marks  ;
	private char grade;
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		//this.grade = grade;
	}

	public Student ()
	{
		
	}
	public void displayDetails() { 
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter the Name:");
//		 name = scan.next();
//		
//		System.out.println("Enter the Roll No:");
//		  roll = scan.nextInt();
//		
//		System.out.println("Enter the Marks:");
//		  marks= scan.nextInt();
		
		Student student = new Student(roll,name,marks);
		 grade = calculateGrade();
		
		// System.out.println("Details of a Student is:");
		 
		//Student student = new Student(roll,name,marks,grade);
		

	}
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	private char calculateGrade() {
		//System.out.println("marks"+marks);
		if(marks>= 500)
		{
			return 'A';
		}
		else if(marks<500 && marks>=400)
		{
			return 'B';
		}
		else {
			return 'C';
		}
		
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}
	
	
}