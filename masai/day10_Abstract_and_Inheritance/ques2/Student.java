package com.masai.day10_Abstract_and_Inheritance.ques2;

public abstract class Student {

	 String name;
	 
	 String address;
	 
	 abstract void getPercentage();

	public Student(String name, String address) {
		super();
		
		this.name = name;
		
		this.address = address;
		
	}
	public Student() {
			
		} 
	 
	
}