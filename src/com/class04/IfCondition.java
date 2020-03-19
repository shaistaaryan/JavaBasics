package com.class04;

public class IfCondition {
	
	public static void main (String [] args) {
		//Decliare anumber and compare if number is larger than 100
		//if number is larger than 100 --->my number is large
		
		System.out.println("String coding");
		
		int num=178;
		
		if (num>1000) {
			System.out.println("My number is large");
		}
		System.out.println("End of the program");
		
		System.out.println("------------------------------");
		
		int expectedHours=15;
		int actualHours=4;
		
		if (actualHours>=expectedHours) {//if true  go inside if block 
			System.out.println("You will love java");
		}else {//othrewise (if false) --->go inside else block 
			System.out.println("you will not like java");
		}
			
		System.out.println("-----------------------------");
		
		double budget=10000;
		double carPrice=12000;
		
		if(budget>carPrice) {
		System.out.println("I will buys this car todaty");
		System.out.println("I will be so happy");
		}else {
	     System.out.println("I will not buy this car today "+""
		  + "I will go learn java");
		System.out.println("I will be motivated");
	     
		}
		
	     System.out.println("I am code after if condition");
	     
	}
	}
