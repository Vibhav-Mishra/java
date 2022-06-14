package com.masai.day10_Abstract_and_Inheritance.ques4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Area area = new Area();
		int sqArea = area.squareArea(20);
		System.out.println("Square area is :"+" "+sqArea);
		
		int recArea = area.rectangleArea(20,30);
		System.out.println("Square area is :"+" "+recArea);
		
		int cirArea = area.squareArea(10);
		System.out.println("Square area is :"+" "+cirArea);
		
		
	}

}