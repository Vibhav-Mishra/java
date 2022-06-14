package com.masai.Day11_Interface_Enum.ques2;

public class Mobile {
	
	void searchOutdatedModel(String cName,String... mName){
		
		String[] outdatedModels = {"note4","note5","note6","note7"};
		
		
		//System.out.println(mName.length);
		if(mName.length >0)
		{
			for(int i=0;i<outdatedModels.length;i++)
			{
				for(int j=0;j<mName.length;j++)
				{
					if(outdatedModels[i].equals(mName[j]))
					{
						
							System.out.println(mName[j]+"_"+"OUTDATED");
						break;
					}
				}
	
			}
		}
		else
			System.out.println("Please give Model Number");
		
	}
	
	public static void main(String[] args) {
		
	
		
		
		Mobile mobile = new Mobile();
		
		mobile.searchOutdatedModel("mi","note7"); //as we are using var-args we can supply any no of arguments even no arguments also
		
		
	}

}