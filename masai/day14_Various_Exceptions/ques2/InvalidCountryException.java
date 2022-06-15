package com.masai.day14_Various_Exceptions.ques2;

public class InvalidCountryException extends Exception{

	String errorMessage;
	
	public InvalidCountryException(String errorMessage) {
		super(errorMessage);
		this.errorMessage=errorMessage;
	}
	
	
}