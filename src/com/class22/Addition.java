package com.class22;

public class Addition {
	
	//Method over loading by changing number of parameter
	void add(int num, int num1) {
		System.out.println(num+num1);
	}

	void add (int num, int num1 ,int num2) {
		System.out.println(num+num1+num2);
	}

 
	void add(int num , int num1 , int num2 ,int num3) {
		System.out.println(num+num1+num2+num3);
	}

	//Method overLOADING BY 
	void add(int num , int num1) {
		System.out.println();
	}

}
