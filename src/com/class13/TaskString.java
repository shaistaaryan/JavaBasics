package com.class13;

public class TaskString {

	public static void main(String[] args) {

		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS).
		 * 
		 * 
		 * Create a String and if the String is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String. Write a program that reads two
		 * people’s first names and if they expecting boy or girl? Based on the input
		 * suggests a name for a baby: Example Output: Mom’s first name? Mary Dad’s
		 * first name? Daniel Boy or Girl? boy Suggested baby name: DANRY
		 * 
		 * Example Output: Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl?
		 * girl Suggested baby name: MAIEL
		 * 
		 */
		//Task Number One
		
		String str = "Sunday";
		char reverse;
		for (int i = 5; i >= 0; i--) {
			reverse = str.charAt(i);
			System.out.print(reverse);
		}
		System.out.println();
	}

}
