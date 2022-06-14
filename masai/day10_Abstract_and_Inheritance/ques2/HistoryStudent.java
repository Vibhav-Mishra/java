package com.masai.day10_Abstract_and_Inheritance.ques2;

public class HistoryStudent extends Student {
	
	
	int historyMarks;
	
	int civicsMarks;
	
	public HistoryStudent() {
		
		super();
		
	}
	
	@Override
	void  getPercentage() {
		
		int total = (historyMarks+civicsMarks);
		
        float percentage =(total /2);
        

		System.out.println("Percentage of Histrory Student is:"+" "+percentage+"%");
		
		
	}

}