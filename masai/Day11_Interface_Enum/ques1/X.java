package com.masai.Day11_Interface_Enum.ques1;

public interface X {
	
	void xAbstract();
	
	default void xDefault() {
		System.out.println("Inside xDefault method of interface X");
	}
	
	static void xStatic() {
		System.out.println("Inside xStatic method of interface X");
	}

}