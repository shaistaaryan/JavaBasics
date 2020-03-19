package com.class10;

public class CarMailgPrintInFoorLoops {

	public static void main(String[] args) {
		//using nested loops to print car audiometer
		
		for ( int i = 0; i <10 ; i++) {
			
			for (int j =0; j < 10; j++) {
				
				for(int k =0; k <10; k++) {
					
					for(int z =0 ; z < 10; z++) {
						System.out.println(i + "" + j + "" + k + "" + z);
					}
				}
			}
		}
		
	}

}
