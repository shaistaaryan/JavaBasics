package com.class06;

import java.util.Scanner;

public class SaleAndDiscound {
	public static void main(String[] args) {

		/*
		 * writ a program to ask user if there is sale if no sale --> not going shopping
		 * of sale we will ask the price of the item based on the price we will apply
		 * discount and calculate final price
		 * 
		 * if price less than 20-->apply 10% if price is between 20 and 100 --> apply
		 * 20% if price between 100 and 5000 ->apply 30% if price more than 500 -->apply
		 * 50% after discount ____ the price of the item reduced from__to___
		 */
		// frist decliar

		Scanner scan;
		String sale;
		double price;
		double discount = 0;
		double finalPrice = 0;

		scan = new Scanner(System.in);
		System.out.println("IS there is a sale");
		sale = scan.nextLine();

		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("what is the price");
			price = scan.nextDouble();

			if (price <= 20) {
				discount = price ;
			} else if (price > 20 && price <= 100) {
				discount = price * 0.2;
				finalPrice = price - discount;
			} else if (price > 100 && price <= 500) {
				discount = price * 0.3;
				finalPrice = price - discount;
			} else {
				discount = price * 0.5;
				finalPrice = price - discount;
		}
		
			 System.out.println("After" + discount + " discount the price of the item reduce from " 
					 + price + "to" + finalPrice);

		
		} else
			
			System.out.println("no shopping to day");

		

	}

}
