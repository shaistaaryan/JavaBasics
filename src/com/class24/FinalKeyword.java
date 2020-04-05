package com.class24;

public class FinalKeyword {

	public static String str = "Hello";
	public static final String str1 = "Bye"; // Final variable=CONSTANT

	public static final String APPLICATION_URL = "https://syntaxtechs.com";

	final char GRADE = 'A';

	public static void main(String[] args) {

		str = "Hi";
		
		
		// str1="Good bye"; CE:
		// applicationURL="http://google.com"

	}

	public final void hello() {
		System.out.println("I am  a final method ");
	}

	public final void hello(String name) {
		System.out.println("Hello " + name);
	}
}

class SubClass extends FinalKeyword {

	// public void hellp(){ CE: cannot override final method 
    //  
	//}
	
	public void hello (int num) { //not overriding method is signature is different), it is a new method 
		System.out.println("Hello of child class");
	}
