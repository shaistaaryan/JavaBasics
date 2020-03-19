package com.class13;

public class TaskNumber3 {

	public static void main(String[] args) {

		String me = "I ama good tester";

		System.out.println("------replace() FUNCTION-------");
		// replace old value with new value
		String newString = me.replace("a", "c");
		System.out.println(newString);
// if it find matchign char sequence -->then replace
		me = me.replace("good", "great");
		System.out.println(me);

		// if it is not finding matching sequense-->not replace
		me = me.replace("Great", "Awesome");
		System.out.println(me);

			
		String car = "i have a toyota";
		car = car.replace("toyota", "Lexus");
		System.out.println(car);

		String str3="Hello all students";
		str3.replace(" ", " ");
		System.out.println(str3);
		
		
		System.out.println("------replaceAll() FUNCTION----");
		
		String str="phon number is 1234567890";
		System.out.println(str);
		str=str.replaceAll("[A-Za-z]","");
		
		System.out.println(str);
		
		String str1="Hello1234567**&&**  !!!89";
		str1=str1.replace("[0-9]","");
		
		str=str.replaceAll("[^A-Za-z]","");
		System.out.println(str1);
		
		String str2="Hello1234567**&&**  !";
		str2=str2.replaceAll("[^A-Za-z0-9]","");
		System.out.println(str2);
		
		String subject="Java";
		
		subject=subject.replace("a", "e").replace("J","I").toUpperCase();
        System.out.println(subject);
        System.out.println(subject.replaceFirst("E","g"));
		
	}

}
