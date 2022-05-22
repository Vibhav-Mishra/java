package com.masai.day2;

public class SumOfNaturalNumbers {

	// function/method logic
	void sum(int n) {
		
//		function or method
		int bag = 0;
		for(int i=0; i<=n; i++) {
			bag+=i;
		}
	   
		System.out.println("sum of first "+ n +" Natural number is "+bag);
	}
	
	//call for execute function
	public static void main(String[] args) {
		SumOfNaturalNumbers x= new SumOfNaturalNumbers();
		x.sum(5);
	}

}
