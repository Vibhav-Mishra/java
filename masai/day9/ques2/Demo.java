package com.masai.day9.ques2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		
		
		if(num>1 && num<=10)
		{
			Parent parent = new Child(num);
			
			parent.method1();
			parent.method2();
			parent.method3();
			
			Child child = (Child) parent;
			child.method4();
			
			
			
		}
		else {
			System.out.println("Invalid Number");
		}
		

	}

}