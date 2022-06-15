package com.masai.day14_Various_Exceptions.ques1;

public class InsufficientFundsException extends Exception{
	
	String errorMessage;
	
	public InsufficientFundsException(String errorMessage) {
		super(errorMessage);
		this.errorMessage=errorMessage;
	}

}