package com.masai.day12_Regular_Expression__Exception_handling.ques2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	
 public boolean validate(String name, String aadharCard, String mobileNum) {
		
   if(Pattern.matches("[a-zA-Z]{3,8}", name)== true &&Pattern.matches("[0-9]{12}",aadharCard)==true &&Pattern.matches("[6789]{1}[0-9]{9}", mobileNum) ==true)
		{
			return true;
		}
		else {
			return false;
		}
	//System.out.println(Pattern.matches("[a-zA-Z]{3,8}", "Vibhav"));//name validation
	//System.out.println(Pattern.matches("[0-9]{12}", "123456879123"));//aadhar validation
	//System.out.println(Pattern.matches("[6789]{1}[0-9]{9}", "9621204970")); //mobile num validation[6789] first letter should bw
		
			
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
//		input.close();
		
		
		System.out.println("Enter the Name: ");
		String name = input.next();
		
        
        System.out.println("Enter aadhard card number");
        String aadharNumber = input.next();

		System.out.println("Enter the Mobile Number : ");
        String mNumber = input.next();
        
        Demo d1 = new Demo();
        d1.validate(name, aadharNumber, mNumber);
        boolean validate = d1.validate(name,aadharNumber, mNumber);
      //  System.out.println(validate);
        
       if(validate == true)
       {
    	   Citizen citizen = new Citizen(name,aadharNumber,mNumber);
    	   
    	   citizen.getDetails();
       }
       else {
    	   System.out.println("Please enter a valid details");
       }
        		
	}

	
	
}