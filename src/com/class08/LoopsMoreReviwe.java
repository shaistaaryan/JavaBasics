package com.class08;

public class LoopsMoreReviwe {
public static void main(String[] args) {
	//to print number from 50 to 1
	
	for(int i =50; i>=1; i--) {
		System.out.println(i);
		
	}
 System.out.println("-----------PRITING ODD NUMBER--------");
 //PRINT odd number between 20 and 50
 for(int i=20; i<=50; i++) {
	 
	 if(i%2!=0){
		 System.out.println(i);
	 }
}
//what is the output 
System.out.println("-----total------");
 int total=2;
 
 for(int k=1; k<4; k++) {
	 total=total*k;
	 
 }
 System.out.println("final total)"+total);
 



 }
}
