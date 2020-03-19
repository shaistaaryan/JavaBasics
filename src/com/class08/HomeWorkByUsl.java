package com.class08;

import java.util.Scanner;

public class HomeWorkByUsl {
public static void main(String[] args) {
	 
	//Exmple of the while loop
	
	Scanner s;
	double price;
	
	s =new Scanner(System.in);
	
	do {
		System.out.println("please pay for a candy");
		price =s.nextDouble();
		
	}while (price !=2);
	
	System.out.println("Enjoy your candy");
	
	System.out.println("please pay for candy");
	price =s.nextDouble();
	
	while(price!=2) {
		System.out.println("plwase pay for a candy");
       price=s.nextDouble(); 
	}
	System.out.println("Enjoy candy");
	
	
  }
}
