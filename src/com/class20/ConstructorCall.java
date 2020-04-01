package com.class20;

public class ConstructorCall {

	public ConstructorCall() {
		System.out.println("I am non argument constructor");
	}

	public ConstructorCall(String str) {
		this();
	}

	public ConstructorCall(String str, String str1) {
		//this("str", "str")CE:this error
		this("Hello");
	}

	public static void main(String[] args) {
		// Creating an object by passing 2 String value
		ConstructorCall obj = new ConstructorCall("Java", "Love");
	}
}
 
