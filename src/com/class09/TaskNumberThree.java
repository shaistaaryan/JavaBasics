package com.class09;

import java.util.Scanner;

public class TaskNumberThree {
public static void main(String[] args) {
	/*write a program that 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
     Scanner scan = new Scanner(System.in);
     int totalEven =0;
     int totalOdd=0;
     
     System.out.println("please entr two number");
     int min =scan.nextInt();//10
     int max = scan.nextInt();//20
     
     for (int i= min; i<=max;i++) {
    	 if( i% 2 == 0) {
    		 totalEven =totalEven + i;
    	 }else {
    		 totalOdd = totalOdd + i;
    	 }
     System.out.println("The total of even  numbers between "+ min+ "to");
     System.out.println("The total of dd  numbers between "+min+"to" );
     }












     }
}
