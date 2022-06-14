package com.masai.Day11_Interface_Enum.ques3;

import java.util.Scanner;

public class IPL {

	
	void homeTeamStadium(Stadium stadium)
	{
		//System.out.println(stadium);
		
		switch(stadium) 
		{
		case EDEN_GARDENS_STADIUM:
			System.out.println("This is the home ground of KKR");
			break;
		case WANKHEDE_STADIUM:
			System.out.println("This is the home ground of Mumbai");
			break;
		case CHIDAMBARAM_STADIUM:
			System.out.println("This is the home ground of CSK");
			break;
		case M_CHINNASWAMY_STADIUM:
			System.out.println("This is the home ground of RCB");
			break;
		}
	}
	
	public static void main(String[] args) {

		try {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Please Enter Stadium Name : ");
			
			String name = input.next();
			//System.out.println(name);
			
			Stadium stadiumName = Stadium.valueOf(name);
			
			//System.out.println(stadiumName);
			
			IPL ipl = new IPL();
			
			ipl.homeTeamStadium(stadiumName);
		}
		catch(IllegalArgumentException iae)
		{
			
			System.out.println("Please Enter a valid name");
			
			
			//iae.printStackTrace();
			
			//System.out.println(iae.getLocalizedMessage());
		}
		
	}
	
	
}