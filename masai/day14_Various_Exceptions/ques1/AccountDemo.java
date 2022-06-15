package com.masai.day14_Various_Exceptions.ques1;

public class AccountDemo {
	
	
	
	public static void main(String[] args) {
		
		
		try {
			Account acc = new Account("5478");
			acc.deposit(2000);
			double Ans = acc.withdraw(1900);
			System.out.println("Rs "+ Ans);
		} catch (InsufficientFundsException e) {
			
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("End of Main");
		
	}

}