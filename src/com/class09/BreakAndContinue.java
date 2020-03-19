package com.class09;

public class BreakAndContinue {
public static void main(String[] args) {
	
	//once i = 4 -->we want to stop the loop
	
	for (int i=1; i<=10; i++) {
		if(i==4) {
			System.out.println("Iam stopping loop");
			break ;
			
		}
        System.out.println("I am inside the loops");	
		System.out.println(i); 
	}
       System.out.println("Iam outside of the loop");



 }
}
