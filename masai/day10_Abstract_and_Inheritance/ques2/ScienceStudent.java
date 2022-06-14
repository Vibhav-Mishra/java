package com.masai.day10_Abstract_and_Inheritance.ques2;

public class ScienceStudent extends Student {
	
	int physicsMarks;
	
	int chemistryMarks;
	
	int mathsMarks;
	
	
	public ScienceStudent() {
		
		super();
	}
	
	
	@Override
	void getPercentage() {
		
		
		int total = (physicsMarks+chemistryMarks+mathsMarks);
		System.out.println(total);
        double percentage =((total /300.00)*100.00);
        
		
		
		System.out.println("Percentage of Science Student is:"+" "+percentage+"%");
		
	}

}