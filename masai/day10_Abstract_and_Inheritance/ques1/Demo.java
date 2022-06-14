package com.masai.day10_Abstract_and_Inheritance.ques1;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount) {
		
		if(amount> 1000)
		{
			TajHotel taj = new TajHotel();
			
			return taj;
		}
		else if(amount>200 && amount<=1000)
		{
			RoadSideHotel roadHotel = new RoadSideHotel();
			
			return roadHotel;
		}
		else {
			System.out.println("Please enter a valid amount");
			return null;
		}
		
	
		
	}
	
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount");
		
//		scan.close();
		
		int amount = scan.nextInt();
		
		Demo d1 = new Demo();
		Hotel hotel = d1.provideFood(amount);
		
		if(hotel != null)
		{
			hotel.chickenBiryani();
			hotel.masalaDosa();
		}
		
		
	}
	
	
}