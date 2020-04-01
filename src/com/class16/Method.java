package com.class16;

public class Method {

	//Method is block of code that performs certain action.
	
	// create a method that will say welcome 10 times

	void sayWlcome() {

		for (int i = 0; i < 10; i++) {
			System.out.println("welcome");
		}
	}

// Create method that will say any word #number of that
	void sayAnything(String word, int times) {

		for (int i = 1; i <= times; i++) {
			System.out.println(word);
		}
	}
   void evenOdd(int a) {
	   if(a % 2== 0) {
		   System.out.println(a + "is an ");
	   }else {
		   System.out.println(a + "is an");
	   }
   }

   void isLarger(int a, int b) {
	   if(a< b) {
		   System.out.println(b + is larger);
	   }else if (a>b) {
		   System.out.println(a + "is");
	   }else {
		   System.out.println("Numbers");
	   }
   }
   
   void isPalindreome()
   
   
	void isItRaining(boolean isRain) {
		if (isRain) {
			System.out.println("It is raining stay home and learn java");
		} else {
			System.out.println("It is not raining go for a walk");
		}
	}

	void evenOdd(int a , int b) {
		if (a < b) {
			System.out.println(b + " is larger than " + a);
		} else if (a > b) {
			System.out.println(a + " is larger than " + b);
		} else {
			System.out.println("Numbers are even");
		
			
		if(revers.equal)
		System.out.println("word is palindrome");
		}else{
		System.out.println("word is not palindrome");
		}
	}

	void sayHello(String country){
		switch (country.toLowerCase()) {
		case "Russia":
			System.out.println("Privet");
			break;
		case "Mexico":
			System.out.println("hola");
			break;
		case "tajkastian":
			System.out.println("Salom");
			break;
		default:
			System.out.println("wrong language");
		}
	}

}
