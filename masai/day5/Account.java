package com.masai.day5;

public class Account {

	private int accountId ;
	private String accountType ;
	private int balance ;
	
	public boolean withdraw(int withdrawAmount)
	{
		if(withdrawAmount<=balance)
		{
			return true;
		}
		else {
			return false;
		}
		
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	

}