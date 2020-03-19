package com.class08;

import java.util.Scanner;

public class TaskDoneByUsal {
public static void main(String[] args) {

	//we are playing lottery and lucky number is 17;
    //we want to keep asking user any number from 1-20
    //until he guess the lucky number then output should be->congrat    
   
	Scanner scan;
	int number;
	int LuckyNumber=17;
	scan=new Scanner(System.in);
	do {
		System.out.println("please enter any number from 1 to 20");
		number=scan.nextInt();
		
	}while(number!=LuckyNumber);
	System.out.println("You got it !!!!!!!!");
}
}
