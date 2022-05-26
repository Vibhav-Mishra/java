package com.masai.day4;

public class Demo {
	
	public Demo() {
		System.out.println("This is constructor one()");
	}
	public Demo(int i) {
		System.out.println("This is constructor two = " + i);
	}
	public Demo(float f) {
		System.out.println("This is constructor three = " + f);
	}
	public Demo(String s) {
		System.out.println("This is constructor four = " + s);
	}

	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		d1 = new Demo(10);
		d1 = new Demo(12.04f);
		d1 = new Demo("Namaste");
		
	}
}
