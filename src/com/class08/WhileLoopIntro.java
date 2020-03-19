package com.class08;

public class WhileLoopIntro {
	public static void main(String[] args) {
// WHILE LOOP
		int time=10;
		
		if (time<12) {
			System.out.println("good morning");
			
		}
		
		System.out.println("-------WHILE LOOP-------");
//		While(time<12){
//		System.out.println("good morning );//CODE WILL EXECUT=E INFINETELY
//	}
		
		while (time<12) {
			System.out.println("good morning ");
			time++;
		}
	System.out.println("***********************");	
	//How to print numbers from 1 to 50?
		int num =1;
		while (num<=50) {
			System.out.println(num);
		  num++;
		}
		//how to print numbers form 20 tp 30
		int num1=20;
		while(num1<=30) {
			System.out.println(num1);
			num1++;
		}System.out.println("***************");
		//how to print number from 5 to 15 all in 1 line
		int num2=5;
		while(num2<=15) {
			System.out.print(num2+" ");
		  num2++;
		}
		System.out.println("*******************");
		// how to print values from 10 to 1?
		int num3=10;
		
		while(num3>=1) {
			System.out.println(num3);
            num3--;
		}
	}

}
