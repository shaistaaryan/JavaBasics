package com.class04;

public class CompareNumbers {

	public static void main (String [] args) {
		
		double numberOne = 10;
		double numberTwo = 10;
		
		if (numberOne>numberTwo) {
			System.out.println("Number one is larger than number 2");
		}else if (numberOne<numberTwo){
		System.out.println("Number one is smaller than number 2");
		}else {
			System.out.println("Numbers are equal");
		}
		
		
		System.out.println("---------------------------");
		
		//declare variable for a day and then based on the value we will 
		
		
		int day=4;//in this place what we write the will print it this line 
		
		if (day==1) {
			System.out.println("It is Monday, on calss today");
		}else if (day==2) {
			System.out.println("Its Tusday we have SDLC Class");
		}else if (day==3) {
			System.out.println("Its wednesday we have SDLC Class");
		}else if(day==4) {
			System.out.println("It is Friday, we have Reviwe Class ");
		}else if(day==5) {
			System.out.println("It is Saturday, on calss");
		}else if(day==6) {
			System.out.println("It is Sunday, we have java Class");
		}else if(day==7) {
			System.out.println("Invalid weekday");
		}
	}
	
	
}
