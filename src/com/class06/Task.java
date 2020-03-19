package com.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*
		 * package com.class06;

import java.util.Scanner;

public class TaskFirst {
	public static void main(String[] args) {
		
		
		/** Task
		 * Prompt the user to enter person heights in inches. Person should be
		 * classified as one of the following: 
		 * short (under 60 inch) 
		 * medium(between 60-72 inch) 
		 * tall (over 72 inch)
		 */
		
	    Scanner input =new Scanner(System.in);
	    
	    System.out.println("please enter youre height in inches");
        int height=input.nextInt();
        
        if (height<=60) {
        System.out.println("you are short");
        }if  (height<=60 && height>=72){
        	System.out.println();
        }
        
        
        
   
}

		 

	}


