package com.class13;

public class StringManipulitionMore {

	public static void main(String[] args) {
		//t get substring from a given string 
		//substring =string inside youre string 
		System.out.println("----Substring() FUNCTION-----");
		
		String str="Today is a rainy day";
		//is a rainy 
		String partialStrig = str.substring(6);//start from 6 until the end of staring 
		System.out.println(partialStrig);
		
		//rainy day 
		partialStrig=str.substring(11);
		System.out.println(partialStrig);
		
		//Today
		partialStrig=str.substring(0, 5);//start from 0 end at index 5
		System.out.println(partialStrig);
		
        //rainy
		partialStrig=str.substring(11, 16);
		System.out.println(partialStrig);
	}

}
