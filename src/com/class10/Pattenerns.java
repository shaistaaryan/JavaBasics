package com.class10;

public class Pattenerns {

	public static void main(String[] args) {
       //***** it print five stars
		
		for(int a=1; a<=5; a++) {
			System.out.print("*");
			
		}
		System.out.println();	
		
		System.out.println("----print pattaern using nexted loops----- ");
		
		for (int i=1; i <=5; i++) {
			
			for (int j=1; j<=5; j++) {
				System.out.print("*");
			}
		System.out.println();
		}

	
	}

}
