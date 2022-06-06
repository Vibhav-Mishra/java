package com.masai.day9.ques1;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		Student student = new Student(); 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Name:");
		student.setName(scan.next());
		
		System.out.println("Enter the Roll No:");
		student.setRoll( scan.nextInt());
		
		System.out.println("Enter the Marks:");
		student.setMarks(scan.nextInt());
		
	
		
		//Student student1 = new Student(scan.nextInt(),scan.next(),scan.nextInt());
		student.displayDetails();
		
		System.out.println("Details of Student 1:");
		System.out.println(student);
		System.out.println("===================");
		
//		Student student2 = new Student();
//		student2.displayDetails();
//		System.out.println(student2);
		
		System.out.println("Enter the Name:");
		student.setName(scan.next());
		
		System.out.println("Enter the Roll No:");
		student.setRoll( scan.nextInt());
		
		System.out.println("Enter the Marks:");
		student.setMarks(scan.nextInt());
		
	student.displayDetails();
		
		System.out.println("Details of Student 2:");
		System.out.println(student);
		System.out.println("===================");
		
	}

}