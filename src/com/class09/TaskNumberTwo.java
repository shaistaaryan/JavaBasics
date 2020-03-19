package com.class09;

import java.util.Scanner;

public class TaskNumberTwo {
public static void main(String[] args) {
	
	/*2. Create a program that will be asking user to apply for a credit 
    * card 10 times. As soon you get an “yes” from a user program should
    *  stop asking.
	*/
  
    Scanner scan =new Scanner(System.in);
    for (int i = 1; i<= 10; i++) {
    	String creditCard = scan.next();
    	if ( creditCard.equals("yes")) {
    		System.out.println("cong");
    	}
    }







  }
}
