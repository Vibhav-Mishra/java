package com.masai.day10_Abstract_and_Inheritance.ques2;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		

		ScienceStudent sStudent =  new ScienceStudent();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Name:");
		sStudent.name = scan.next();
		
		scan.nextLine();
		System.out.println("Enter address :");
		sStudent.address = scan.nextLine();
		
		System.out.println("Enter Marks of Maths");
		sStudent.mathsMarks = scan.nextInt();
		
		System.out.println("Enter Marks of Physice");
		sStudent.physicsMarks = scan.nextInt();
		
		System.out.println("Enter Marks of Chemistry");
		sStudent.chemistryMarks = scan.nextInt();
		
		System.out.println(sStudent.name);
		System.out.println(sStudent.address);
		System.out.println(sStudent.mathsMarks);
		System.out.println(sStudent.physicsMarks);
		System.out.println(sStudent.chemistryMarks);
		
	sStudent.getPercentage();
	
		
	}

}