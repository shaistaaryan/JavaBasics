package com.class17;

public class Shelter {

	public static void main(String[] args) {
		// access instance variables of defferent class
		Dog puppy=new Dog();
		puppy.name="Charly";
		System.out.println(puppy.name);
		
		//Accesses static variables of different class
		System.out.println(Dog.breed);

	}

}
