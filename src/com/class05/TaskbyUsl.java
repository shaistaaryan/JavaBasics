package com.class05;

public class TaskbyUsl {

	public static void main (String [] args ) {
		//task number2
		//2.Create a Java program and store values of mortgage rate 
		//and mortgage price. First, program should check if rate is
		//higher than 4.5 user will not buy a house, otherwise user
		//will consider buying. Once user decides to buy a house,
		//if price of the house is larger than 200000 than user will
		//take a loan, otherwise user will pay cash.
		
		
		int price=50000;
		double rate=4.7;
		
		if (rate>4.5) {
			System.out.println("morgage very high");
		}else {
			System.out.println("Yes, i am buying a house ");
			
			if (price>200000) {
				System.out.println("i need morge");
			}else {
				System.out.println("I pay cash");
			}
		}
		
		
	}	
		
		
	
}
