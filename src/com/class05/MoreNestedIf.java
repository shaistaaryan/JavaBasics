package com.class05;

public class MoreNestedIf {

	
	public static void main (String [] args) {
		
	//declare data and a day.
	//if day is friday ----> if data is 13 -->watch a scary movie 
    //---> if data is not 13 -->watch a comedy    
		
		boolean isFriday= false;
		int data=14;
		
		if (isFriday) {
			System.out.println("today is friday , i am going to a movies");
			
			if (data==13) {
				System.out.println("I will wacth scary movie ");
			}else {
				System.out.println("I will watch comedy");
			}
		}else {
			System.out.println("Today is not friday , I am staying home ");
		}
		
		
		//Check if patian has any allergies 
		//if no allergies -->you are helthe 
		//otherwise chek if patian has: orange allergy
		//do not eat orange
		//apple akkerge -->do not eat apples.
		//kiei allergy do not eat kiwi
		
		boolean allergy=false;
		boolean orange=false;
		boolean apple=true;
		boolean kiwi=false;
		
		if(allergy) {
			System.out.println("we need to do allrgy test");
	   }
	
         
	
	
	
	
	}	
}
