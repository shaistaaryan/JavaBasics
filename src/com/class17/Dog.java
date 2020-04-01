package com.class17;

public class Dog {

	String name, size;
	int age;
//static varibles
	static String breed = "Huscky";
	static int paws = 4;
	static int tail = 1;
	static int eyes = 2;

	void displayDog() {
		System.out.println("Dog name is " + name + "and it " + size + " dog and age is " + age);
		System.out.println("Dog breed is " + breed + " and it has " + paws + " paws and " + tail + " tail");
	}

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.name = "Lucy";
		dog1.size = "Big";
		dog1.age = 5;
		dog1.age = 6;
		dog1.displayDog();

		// hoe to accses static variable ?--> stastic variable to the calss -->accessed
		// by className
		System.out.println(Dog.breed);
		System.out.println(Dog.paws);
		System.out.println(Dog.breed);// accsses static variable in satstic way
		System.out.println(breed);

		// how to accses static variaible?--> by creating an object and using refernce
		// variaible

		System.out.println(Dog.breed);

		breed = "bulldog";

		Dog dog2 = new Dog();
		dog2.name = "Sharik";
		dog2.size = "Small";
		dog2.age = 2;
		dog2.displayDog();

		Dog dog3 = new Dog();
		dog3.name = "papsi";
		dog3.size = "Big";
		dog3.age = 10;
		dog3.displayDog();

	}

}
