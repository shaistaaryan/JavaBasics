package com.class12;

public class StringValidtiom {

	public static void main(String[] args) {
		 
	String str1="Welcome to Syantx student";
    String str2 ="Wlcome Syantax Student";
	
	//to compare 2 Strings
    System.out.println("------eequlas() equalsIgnoreCase() FUNTION------");
    
    System.out.println(str1.equals(str2));
    System.out.println(str1.equalsIgnoreCase(str2));
    
    String expected="home - Syantax Technologies";
    String actual="Home - Syantax Tachnologies";
    
    //
    if(actual.equals(expected)) {
    	System.out.println("Teast case pass. Titles are matched");
    }else {
         System.out.println("Teast case fails.Titles are Not matched");
    }	
    
    System.out.println("------FRIST TRIM AND THEN COMPARE----");
    if(actual.trim().equals(expected)) {
    	System.out.println("The case pass. titles are matches");
     }else {
    	 System.out.println("Test case fails. titles are Not matched");
     }
    
    String browser="CHROME";
    if(browser.trim().equalsIgnoreCase("chrome"));
    
	
	}

}
