package com.class19;

public class ConstructorIntro {
//block of code( similar to a method , special method ) that is executed when an
//object of the class is created.
//why we need constructor ?       	
//constructor initializes the object (initial state to your object	

		//ConstructorIntro(){
		
	//	}
		//to create a constructor: 1. name must be same as class name 
//	                           2.no return type
	
	
	ConstructorIntro(){
		System.out.println("I am a constructoe");
	}
	
		public static void main(String[] args) {
		
		ConstructorIntro obj=new ConstructorIntro();
		
	    System.out.println("Code after construtor");
	
		obj.hello();
		
		}

		void hello() {
			System.out.println("Hello Class");
		}
}
