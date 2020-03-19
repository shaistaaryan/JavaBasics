package com.class07;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user.*/

		Scanner scan;
		int num1;
		int num2;
		char operator;
		double result = 0;
        scan = new Scanner(System.in);
		System.out.println("please enter two numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("what kind of opertor you perfer to perform: +,-,*,/ ");
		operator = scan.next().charAt(0);

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:

			System.out.println("you enter the wrong operator");
            return;
		}
            System.out.println("The result of the" + num1 + " plus" + num2 + " equal to" + result);

		

	}

}
