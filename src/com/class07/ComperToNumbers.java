package com.class07;

import java.util.Scanner;

public class ComperToNumbers {
public static void main(String[] arg) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter any numbers");
	int num1 =input.nextInt();
	int num2 =input.nextInt();
	int num3 =input.nextInt();
	int largest;
	
	if (num1>num2) {
		////here num1 is already larger than num2
		
		if(num1>num3) {
       largest =num1;
	}else {//num1>2 butnum1<num3
         largest=num3;
	}
	}else {// num2>num1
		if(num2>num3) {//num2 is larger than num1 and num2 is >num3
			largest=num2;
		}else {//num2>num1 but num2<num3
			largest=num3;
			
		}
			
		}
	System.out.println("Largest number is "+largest);
	
	
	
	
}
	
}
