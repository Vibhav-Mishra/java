package com.masai.Day11_Interface_Enum.ques1;

public class ZImpl implements Z{

	@Override
	public void xAbstract() {
		
		System.out.println("Inside xAbstract of class ZImpl");
	}

	@Override
	public void yAbstract() {
	
		System.out.println("Inside yAbstract of class ZImpl");
	}

	@Override
	public void zAbstract() {
		System.out.println("Inside zAbstract of class ZImpl");
		
	}
	
	@Override
	public void xDefault() {

		//Z.super.xDefault();
		System.out.println("Inside xDefault of class ZImpl");
	}
	

}

