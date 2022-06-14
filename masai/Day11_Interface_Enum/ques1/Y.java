package com.masai.Day11_Interface_Enum.ques1;

public interface Y {

	
	void yAbstract();
	default void yDefault() {
		System.out.println("Inside yDefault method of interface Y");
	}
	static void yStatic() {
		System.out.println("Inside yStatic method of interface Y");
	}
	
}