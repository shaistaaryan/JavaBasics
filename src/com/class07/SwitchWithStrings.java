package com.class07;

import java.util.Scanner;

public class SwitchWithStrings {

	public static void main(String[] args) {

		/*
		 * ask
		 * 
		 * 
		 * 
		 */

		Scanner scan;
		String country;
		String favoriteFood;

		scan = new Scanner(System.in);
		System.out.println("please enter youre country");
		country = scan.nextLine();

		switch (country) {

		case "Morocco":
			favoriteFood = "Couscous";
			break;
		case "Belarus":
			favoriteFood = "Potato";
			break;
		case "Tajikistan":
			favoriteFood = "Osh";
			break;
		case "Turkey":
			favoriteFood = "Baklava";
			break;
		case "Afghanistan":
			favoriteFood = "Mantu";
			break;
		case "Kazakhstan":
			favoriteFood = "Beshparmak";
			break;
          default:
        	  favoriteFood ="unkown";
		}
		System.out.println("your favorit food is " +favoriteFood);
		
      scan.close();
	}
}
