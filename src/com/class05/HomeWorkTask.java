package com.class05;

import java.util.Scanner;

public class HomeWorkTask {
	
	public static void main(String[] args) {
		
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Do you use credit card? ");
		String answer = userInput.nextLine();
		if (answer.equalsIgnoreCase("Yes")||answer.equalsIgnoreCase("true")){
			System.out.print("what is the current balance on your credit card?");
			double c=userInput.nextDouble();
			if (c>=1000) {
				System.out.println("Please pay off your dues immediately");
			}else {
				System.out.println("Please spend more to get higher credit limit");
			}
		} else {
			System.out.println("We have a great Credit Card offer for you. Are you interested?");
		}
		       System.out.println("--------------------");
		
		
	}

}
