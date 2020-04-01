package com.class14;

public class Q5 {

	public static void main(String[] args) {
		/*
		 * Reverse String
		 * world by word
		 */
		
	  
	String given="I love java ";
	String reversed="";
	for(int i=given.length()-1; i>=0; i--) {
		reversed=reversed+given.charAt(i);
		 
	}
	
	System.out.println("Reversed String ="+reversed);
	
	String[] array=given.split(" ");
	String reversedWorld="";
	for(int i=array.length-1; i>=0; i--) {
		reversedWorld=reversedWorld+array[i];
	}

	System.out.println("ReversedWorld String word by word ="+reversedWorld);
	
	}
	

}
