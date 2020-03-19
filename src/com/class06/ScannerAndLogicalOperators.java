package com.class06;

import java.util.Scanner;

public class ScannerAndLogicalOperators {
	public static void main(String[] args) {

		/*
		 * Take age input from a user and than based on the age print output if age
		 * from 0-3-->you are baby if age from 4-5-->you are a kid is age from 6-12-->youre
		 * child if age from 13-19-->you are teenager if age from 20-64-->you are adult if
		 * age is more or equal to 65 --> you are a senior
		 */

		// 1- Lets declare all variables
		int age;
		Scanner scan;// to import we use mac: cmd+shift+o
						// windows : ctrl+shift+o
		// 2.capture values
		scan = new Scanner(System.in);
		System.out.println("Please entr you are age");
		age = scan.nextInt();

		// 3.perform verification
		if (age > 0 && age < 3) {
			System.out.println("you are a baby");
		} else if (age >= 3 && age <= 5) {
			System.out.println("you are a kid");
		} else if (age >= 6 && age <= 12) {
			System.out.println("you are a chlid");
		} else if (age >= 13 && age <= 19) {
			System.out.println("you are a ateenager");
		} else if (age >= 20 && age > 65) {
			System.out.println("you are an adult");
		} else {
			System.out.println("you are enjoying your life");
		}

	
		
		
		
	}

}
