package com.masai.day10_Abstract_and_Inheritance.ques1;

public class TajHotel implements Hotel {

	
	
	@Override
	public void masalaDosa() {
		// TODO Auto-generated method stub
		System.out.println("Masal dosa is Available in Taj");
		
	}
	
	@Override
	public void chickenBiryani() {
		
		System.out.println("Biryani is Available in Taj");
		
	}
	
	
	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
		}
}