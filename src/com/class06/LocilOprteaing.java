package com.class06;

public class LocilOprteaing {
	public static void main(String[] args) {
		
		/*task or home work
		 *  if declared number is 
		 * between 1-10--> this number is small
		 * between11-100-->this number is big number
		 * between 101-1000-->this large number 
		 */
		 int num=178;
		 
		 // this is mean || or
		
		 if (num>=1 && num<=10) {
			 System.out.println(" This number is small");
		 }else if (num>10&&num<=100) {
			 System.out.println("This is a big number");	 
		 }else if (num>100 && num<=1000) {
			 System.out.println("This islarge number");
		 }else {
			 System.out.println("Number is super large");
		 }
			
		
		
}
}
