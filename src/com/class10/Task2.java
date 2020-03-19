package com.class10;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * print the following pattern
		 *
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 *
		*/
	
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print("*"+"");
		}
	System.out.println();
	}
	
	for(int i=4; i>=1;i--) {
		for(int j=1; j<=i; j++) {
			System.out.print("*"+"");
		}
	System.out.println();
	}
	
	}
}
