package com.class05;

public class NestedIf {

	public static void main(String[] args) {

		// Nested if statement that’ is target of
		// another if or else.

		boolean classToday = false;
		boolean flag = true;

		if (flag) {

			System.out.println("Hello");

			if (classToday) {
				System.out.println("Hello friend");
			} else {
				System.out.println("Hello family");
			}
		} else {
			System.out.println("Bye");
		}
		System.out.println("I am outside of if condition");

	}

}
