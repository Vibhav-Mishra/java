package com.masai.day15_Collection_Framework.ques1;

public class InvalidDateFormat extends Exception{

String errorMessage;
	
	public InvalidDateFormat(String errorMessage) {
		super(errorMessage);
		this.errorMessage=errorMessage;
	}
}