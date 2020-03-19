package com.class09;

public class BreakAndContinue2 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++)

			if (i == 4) {
				System.out.println("i am stopping loop");
				break;
			}
		System.out.println();

		System.out.println("-----------continue-------------");

		for (int y = 1; y <= 10; y++) {

			if (y == 4) {
				System.out.println("I am skipping itertion");
				// continue;

			}

			System.out.println("Iam inside the loop");
			System.out.println(y);

		}
System.out.println();
		
// write a program that print number from 1 to 20
		// i do not want to print 5,6,7

		for (int i = 1; i < 21; i++) {
			if (i == 5 || i == 6 || i == 7) {
				continue;
			}
			System.out.println(i);

		}
		System.out.println("------------continue example---------------");
		// write a program that print number from 1 to 100
				// i do not want to print 35-55
				for (int i = 1; i <=100 ; i++) {
					if (i >= 35 && i <= 55) {
						continue;
					}
					System.out.println(i);

				}
	
	
	
	
	
	}
}
