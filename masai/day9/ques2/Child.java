package com.masai.day9.ques2;

public class Child extends Parent {
	
	
	
	public Child(int num)
	{
		super( num);
	}
	
	@Override
	void method1() {
		System.out.println("inside child method 1");
		System.out.println("Entered number is "+" "+this.number);
		
	}

	
	void method3()
	{
		System.out.println("Inside method 3 of Child class");
	}
	
	void method4()
	{
		System.out.println("Inside method 4 of Child class");
	}
	


}