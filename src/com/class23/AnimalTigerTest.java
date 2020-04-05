package com.class23;

public class AnimalTigerTest {
	public static void main(String[] args) {
		
		//Non primitive  casting: upcasting
		Animal obj=new Tiger();
		obj.sleep();
		obj.eat();
		//obj.run(); CE: method is indefined in Animal class
		
		
		System.out.println("--------ACcessing method using parent classs");
		Animal animal=new Animal();
		//method only of parent class will be vailable
		animal.eat();
		animal.sleep();
		
		System.out.println("-------Accessing method using child clsss");
		Tiger tiger=new Tiger();
		tiger.eat();
		tiger.sleep();
		tiger.run();
		
	}

}
