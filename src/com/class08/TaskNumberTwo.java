package com.class08;

public class TaskNumberTwo {
public static void main(String[] args) {
	
	int num =1;
	while (num<20) {
		System.out.println(num);
		num +=2;
	}
	
	//2 way using mod and if condition 
	System.out.println("_____________________");
	int num4 = 1;
	while (num4 <= 20) {
		
		if (num4 % 2 !=0) {
			System.out.println(num4);
		}
       num4++;
       
	}
	
	System.out.println("***********");
	//way 3 
	
	int y =1;
	while (y<= 20) {
		System.out.println(y++);
       y++;
	}
	
}
}
