package com.class04;

public class AdditionVsConcatenition {

	public static void main (String [] args ) {
		
		int a=10;
		int b=20;
		
		String x="Hello";
		String y="Bye";
		
		//ctl+space ---> autocomplete
		
		System.out.println(a+b+x+y);//30HelloBye
		System.out.println(a+x+b+y);//10Hello20Bye
		System.out.println(x+y+a+b);//HelloBye1020
		System.out.println(x+y+(a+b));
		//1020HelloBye
		System.out.println(a+""+b+x+y);
		
		System.out.println();
		
		
		
	}
	
}
