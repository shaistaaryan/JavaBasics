package com.class16;

public class ParametrsAndarguments {

	int sum(int a , int b) {
		return a+b;
	
		void sum1(int a , int b) {
		
		System.out.println(a+b);
		
	}
	
	}

	public static void main(String[] args) {
	
		ParametrsAndarguments obj = new ParametrsAndarguments();
		int sum = obj.sum(10, 12);
		//FTER YOU add 2 numbers now devide sum by 10
		int result=sum /10;
		
		int sum1 = obj .sum(1 , 2); //CE
		
		
		
		
		

	}

}
