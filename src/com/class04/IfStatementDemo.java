package com.class04;

public class IfStatementDemo {

	public static void main(String[] args) {
		// if it is raining, I will stay at home
		
		boolean isRaining=false;
		
		if(isRaining) {
			System.out.println("I will stay at home");
		}
		
		
		System.out.println("*******If else********");
		
		boolean isResturantNear=true;
		
		if(isResturantNear) {
			System.out.println("Eat outside");
		}else {
			System.out.println("Eat at home, resturant is far");
		}
		
		System.out.println("*******Below is if else ladder******");

		int num=303;
		
		if(num==10) {
			System.out.println("Num is 10");
		}else if(num==20) {
			System.out.println("Num is 20");
		}else if(num==30) {
			System.out.println("Num is 30");
		}else if(num==40) {
			System.out.println("Num is 40");
		}else {
			System.err.println("I don't know the number you entered");
		}
		
	}

}
