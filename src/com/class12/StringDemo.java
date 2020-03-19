package com.class12;

public class StringDemo {

	public static void main(String[] args) {

		String school = " syntax";

		String str = new String("Hello");
		String str1 = " This a String 7834,&&& ";

		// how many charctars String has
        System.out.println("-----LENGTH() FUNTION");
		System.out.println(school.length());
		
		int size = str.length();
		System.out.println("String length is " + size);

		// convert String to lowercase or uppercase
		System.out.println("------TOUPPERCASE/TOLOWERCASE FUNTION");
		System.out.println(school.toUpperCase());
		System.out.println(str.toLowerCase());
		str = str.toLowerCase();
		System.out.println(str);
    
		System.out.println("-----CONCAT FUNCTAION-------");
		//cocatinate 2 string 
		String newString =str+school;
		System.out.println(newString);
	
		String day="Sturday";
		String date ="14";
		
	    String newDate=day.concat(date);
	    System.out.println();
	    
	    char grade='A';
	    String sta2="student";
	    //below code will give CE,
	    //since concat() method is used to attach 1 String to another String 
	   // str2.concat(grade);
	    
	    System.out.println("-----is Empty FUNCTION------");
	    //tells true if there is no characters inside the String
	    //tells falls if any characters are inside the String 	
	    String str3="";
	    boolean empty =str3.isEmpty();
	    System.out.println(empty);
	    
	    System.out.println("------trim() FUNTION----");
	    //remove empty space at the bgaining ans end of the String 
	    String str4=" Welcome to syntax!  ";
	    
	    str4=str4.trim();
	    System.out.println("String with no leading or trinling spaces:"+str4);
	    
	
	}

}
