package com.class13;

import java.util.Scanner;

public class TaskNumber2 {

	public static void main(String[] args) {
     

		 /* Create a String and if the String is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String. Write a program that reads two
		 * people’s first names and if they expecting boy or girl? Based on the input
		 * suggests a name for a baby: Example Output: Mom’s first name? Mary Dad’s
		 * first name? Daniel Boy or Girl? boy Suggested baby name: DANRY
		 * 
		 * Example Output: Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl?
		 * girl Suggested baby name: MAIEL
		 */
		// task 2
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string please");
		String text=input.nextLine();
		if(text.length() % 2== 1 && text.length()>=3) {
			System.out.println();
		}
		
		//Task number 3
		Scanner scan = new Scanner(System.in);
		System.out.println("What is mom frist name ");
		String name1 = scan .nextLine();
		
		System.out.println("what is DAD frist name ");
		String name2=scan.nextLine();

		System.out.println("Boy or Gril ");
        String babynmame=scan.nextLine();
        
        String SuggestedBname=null;
        
        int half1=name1.length() /2;
        int half2 =name2.length() /2;		
	
	
	
	
	}

}
