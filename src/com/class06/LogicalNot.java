package com.class06;

public class LogicalNot {
	
	public static void main(String[] args) {
	
	//Not (!) - reverse the condition	
	  boolean b=!true;
	  boolean val=false;
	  System.out.println(b);
	  System.out.println(val);
	
	boolean isCold=false;
	if(!isCold) {
		System.out.println("hello ");
	}else {
		System.out.println("bye");
	}
	
	String day1="Monday";
	
	
	//if it is not Monday or Friday -->find me at syntax
	
	//day is not Monday and my day is not Friday
	if(!day1.equals("Monday") && !day1.equals("friday")){
    System.out.println("Find me at Syntax");		
    
	}
	System.out.println("-------------------");
	//day is not Monday and my day is Friday
	
	if(!(day1.equals("Monday") && day1.equals("friday"))){
	    System.out.println("Find me at Syntax");		
		}
	
	
	
	}
}
