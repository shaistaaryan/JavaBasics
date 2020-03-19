package com.class12;

public class StringComperison {

	public static void main(String[] args) {
		
		String str1="Hello";
		String str2=new String("Hello");
		
		String str3="Hello";
		
		if(str1.equals(str2)) {
			System.out.println("String are equal");
		}else {
			System.out.println("String anr not equal");
		}
		System.out.println("----COMPERING USING == OPERATOR-----");
		
		if(str1==str2) {
			System.out.println("String are equal");
		}else {
			System.out.println("String are not equal");
		}

		//String str1==str2
	}

}
