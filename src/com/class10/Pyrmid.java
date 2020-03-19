package com.class10;

public class Pyrmid {

	public static void main(String[] args) {
	//rows and columns is will be less than rows or equal 
		
		for(int r=1; r<=4; r++) {
			for (int c=1; c<=r; c++) {
				System.out.print("*");
			}
		System.out.println();
		}
	System.out.println("-----PRINT THE NUMBER ON THE ROWS AND COLUMS");
		for (int r=1; r<=5; r++) {
		
		for (int c=1; c<=r; c++) {
			System.out.print(r +" ");
		}
	System.out.println();
	}
		
	}

}
