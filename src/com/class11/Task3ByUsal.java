package com.class11;

public class Task3ByUsal {
public static void main(String[] args) {
	String [] countries = { "USA", "Poland", "Ukraine", "Turkey", "Spain"};
	
	for (String country :countries){
		
		if (country.equals("USA")){
			System.out.println("The capital of "+ country+ " is Washington DC");
		}else if (country.equals("Polang")){
			System.out.println("The capital of "+ country+ " is Warsaw");
		}else  if (country.equals("Ukraine")){
			System.out.println("The capital of "+ country+ " is Kiev");
		}else  if (country.equals("Turkey")){
			System.out.println("The capital of "+ country+ " is Ankara");
		}else if (country.equals("Spain")){
			System.out.println("The capital of "+ country+ " is Madrid");
		}
		
		System.out.println("--------2nd method----");
		//2way
		for( int y = 0; y < countries.length; y++){
			switch(countries[y]) {
			
			case"USA":
				System.out.println("The capital is washington DC");
				break;
			case"Poland":
				System.out.println("the capital is Warsaw");
				break;
			case"Ukrain":
				System.out.println("the capital is Kiev ");
				break;
			case"Turkey":
				System.out.println("the capital is ankra");
				break;
			case "Spain":
				System.out.println("the capital is madrid");
				break;
			}
			
	}
  }
 }
}
