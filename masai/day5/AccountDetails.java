package com.masai.day5;

import java.util.Scanner;
public class AccountDetails {
	Account check = new Account() ;  //accessing class Account in a class AccountDetails
	int amountWithdraw;
	Scanner scan = new Scanner(System.in);  //Scanner for taking input
	public Account getAccountDetails()
	{
		
		
		System.out.println("Enter account id:");
		check.setAccountId(scan.nextInt());
		//check.setAccountId(accId)) ;
		//System.out.println(check.getAccountId());
		
		System.out.println("Enter account type:");
		check.setAccountType(scan.next());
		

		while( true)
		{
			System.out.println("Enter balance:");
			  check.setBalance(scan.nextInt());
			if(check.getBalance()>0)
			{
				break;
			}
			else {
				System.out.println("Enter a Valid Balance");
			}
		}
	  
		
		return check ;
	}
	
	
	public int getWithdrawAmount() 
	{
		while(true)
		{
			System.out.println("Enter Amount to be Withdraw: ");
			amountWithdraw = scan.nextInt();
			if(	amountWithdraw >0)
			{
				
				   break;
			}
			else {
				System.out.println("Amount should be positive");
			      
			}
			
		}
		return amountWithdraw;
//		System.out.println(amountWithdraw);
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails obj = new AccountDetails();  // creating obj for the class AccountDetails
		
		Account userDetails =  obj.getAccountDetails(); //Catching return value of class Account  obj from getAccountDetails()
		
		
//		System.out.println(userDetails.getBalance() );
		

		//obj.amountWithdraw = obj.scan.nextInt();
		//System.out.println(obj.amountWithdraw);
		obj. getWithdrawAmount() ;
		
		if(obj.check.withdraw(obj.amountWithdraw) == true)
		{
			System.out.println("Balance Amount after Withdraw:"+(obj.check.getBalance()- obj.amountWithdraw) );
		}
		else {
			System.out.println("Sorry!!! No enough balance");
		}
		
	}

}