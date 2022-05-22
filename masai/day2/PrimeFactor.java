package com.masai.day2;

public class PrimeFactor {

	//function or method
	void FindFactorsOfNumber(int N) {
		
		if(N>=2 && N<=100)
		{
			for(int i=1; i<=N; i++)
			{
				// if number is divided by i
                // i is the factor
				if(N % i == 0)
				{
					System.out.print(i+" ");
				}
			}
		}
				else
				{
					System.out.print("Invalid Number");
				}
				
			}
	//main method call function to execute code
	    public static void main(String[] args) {
	    	
	    	PrimeFactor x = new PrimeFactor();
	    	x.FindFactorsOfNumber(12);          	
	    }
	}


