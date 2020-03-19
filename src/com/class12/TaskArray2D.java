package com.class12;

public class TaskArray2D {

	public static void main(String[] args) {

		/*
		 * Create an array of cars : american, german, korean, 
		 * italian. Then retrieve
		 * all values from that array using 2 different loop
		 */
		
		String[][] carmodles= {{"american","shive","manycopar"},
				               {"german","BMW","benz",},
				               {"korean","hounda","kia"},
			                   {"fiat","alfa","ford"}        
		                       };
		
		for(String[] cars:carmodles) {
			for(String title:cars) {
				System.out.print(title+" ");
			}
		System.out.println();
		}

	}

}
