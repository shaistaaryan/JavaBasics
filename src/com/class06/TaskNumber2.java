package com.class06;

public class TaskNumber2 {
	public static void main(String[] args) {
		
		int day =4;
		 if (day >= 1 && day <= 5) {
			 System.out.println("It is a weekday");
		 }else if (day >= 6 && day <=7) {
			 System.out.println("It is weekend");
		 }else {
			 System.out.println("Invalid day");
		 }
		
		System.out.println("-------------using ors-------");
    
		 if (day==1 || day==2 || day==3 || day==4 || day==5) {
			 System.out.println("It is weekday");
		 }
		
		
		
		
		
		
		
	}
	
	

}
