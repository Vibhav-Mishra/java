package com.masai.day10_Abstract_and_Inheritance.ques1;

public class RoadSideHotel implements Hotel {

	
	
	@Override
	public void masalaDosa() {
		
		System.out.println("Masal dosa is Available in Road Side Hotel");
	}
	
	@Override
	public void chickenBiryani() {
		System.out.println("Biryani is Available in Road Side Hotel");
		
	}
}