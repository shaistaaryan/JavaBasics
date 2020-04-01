package com.class20;

//this keyword is used to reefer to the current instance 
//members(variables and method).. this is used to access instance variable
// we need it when local and instance variables are same..  --> int a, b->instance varbls
public class ThisKeyword {

	int a,b;
	
	public ThisKeyword() {
		System.out.println("I am non argument constructor");
	}
	
	public ThisKeyword(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void sum(int a, int b) {
		// sum of which variable am i calculating?
		System.out.println("Sum of the local variable " + (a + b));
		System.out.println("Sum of instance varible " + (this.a + this.b));
	}

	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword(10, 20);
		obj.sum(100, 200);
		
		System.out.println("-----------------------");
		ThisKeyword obj2=new ThisKeyword();
		obj2.sum(20, 40);
	}
}
