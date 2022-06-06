package com.masai.day13_Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		try {
			
			System.out.println("start of main..");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter num1");
			int num1 = sc.nextInt();
			
			System.out.println("Enter num2");
			int num2 = sc.nextInt();

			int num3 = num1 / num2;
			
			
			String message = null;
			if(num3 > 10){
				
			message = "Welcome to Exception Handling ";
			
			
			}
		
		
			System.out.println("Message is :"+message.toUpperCase());
			
			
			
		}
		catch(Exception e) {
			//System.out.println(e);
			if(e instanceof ArithmeticException)
			{
				System.out.println("num2 should not be 0”");
			}
			else if (e instanceof InputMismatchException)
			{
				System.out.println("Please enter valid number");
			}
			else if(e instanceof NullPointerException)
			{
				System.out.println("String value is null");
			}
			
		}
		System.out.println("end of main");
		

	}

}