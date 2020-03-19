package com.class12;

public class Array2D {

	public static void main(String[] args) {
		// Lets create array of groceries

		String[][] groceries = {
				{ "cucumer", "potato", "carrot" },
				{ "mango", "apple", "banana", "kiwi" },
				{ "milk", "cheese", "yogurt" }
				};

		System.out.println(groceries[1][2]);
		// get all values from 2D array
		// loop through rows
		for (int r = 0; r < groceries.length; r++) {
			// loop through columns
			for (int c = 0; c < groceries[r].length; c++) {
				System.out.print(groceries[r][c] + " ");
			}
			System.out.println();
		}

		System.out.println("----GETING ELEMENTS USING ADVACED FOR LOOP-------");
		// loops through all arrays
		for (String[] array : groceries) {
			// loops through single array
			for (String items : array) {
				System.out.print(items + " ");
			}
			System.out.println();
		}

	}

}
