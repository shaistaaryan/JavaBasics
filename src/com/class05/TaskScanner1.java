package com.class05;

import java.util.Scanner;

public class TaskScanner1 {
	public static void main(String[] args) {

		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan
		 * is needed. If loan is less than 200,000 then you would lend the money
		 * otherwise you would reject the client.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("how much loan do you need");

		int loan = scan.nextInt();
		System.out.println(loan + "USD");

		if (loan < 200000) {
			System.out.println("i will give you loan");
		} else {
			System.out.println("sorry i can not approve you ");
		}
		scan.close();

	}

}
