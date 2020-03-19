package com.class08;

import java.util.Scanner;

public class ScannerInputInWhiloop {
public static void main(String[] args) {
	
	//we are playing lottery and lucky nyumber is 17;
    //we want to keep asking user any number from 1-20
    //until he guess the lucky number then output should be->congrats    

	int z=1;
	Scanner input=new Scanner(System.in);
	while(z<20) {
		System.out.println("the lucky number from 1 tp 20 ");
		z=input.nextInt();
		if(z==17) {
			System.out.println("congrats");
		}
	   z++;
	}
	
	
	
	
	
	
	
	
}
}
