package com.class13;

public class SpliFunction {

	public static void main(String[] args) {
		
		System.out.println("------split() FUNCTION-----");
		
		String today="Today is my favorite java class";
		
		String[] array = today.split("my");
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String today1="Today is my favorite java class";
		
		String[] stringArray=today1.split("a");
		//print all elements from array by 1 by 1
		//(elements type variableName:name of array
		for (String    arr    :stringArray) {
			System.out.println(arr+"|");
		}
		System.out.println("------------------------");
		//we want to print string world by world
		String today2="Today is my favorite java class";
		String[] worlds=today2.split(" ");
		
		for(int i=0;i<worlds.length; i++) {
			
			System.out.println(worlds[i]);
		}
		
		System.out.println("------------------------");
		
		String today3="Today is my favorite java class";
        today3=today.trim();
        System.out.println("String after trmming :"+today3);
        
        //today3=today3.split(" ");CE: type mismatchh-->split will give you back
        //array of Strings
}
}