package com.class14;

public class Q4 {

	public static void main(String[] args) {
		/*
		 * find out how many alpha charcters are present in a String ?
		 */
	
	    
		String str="Hih9898jhjh%%^^$%^ oio ";
		str=str.replace("[^A-Za-z]", "");
		int number=str.length();
		System.out.println("Number of alpha character ="+number);
		
		String myString="Today is Wednesday and it is java class";
		String[] array=myString.split(" ");
		int world = array.length;
		System.out.println("Total world in string:"+myString+"="+world);
	
	
	
	
	
	}
	

}
