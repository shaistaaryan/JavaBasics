package com.class13;

public class StringIsImmutable {

	public static void main(String[] args) {
		
		String str="Hello";
		String str1="Hello";
		String str2="World";
		
		str=str1.toUpperCase();
		
		System.out.println(str);
	}
}
