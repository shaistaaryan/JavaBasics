package com.class13;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "Good Morning Students!";
		System.out.println("----charAT() FUNCTION--------");
		char letter1 = str.charAt(0);
		System.out.println(letter1);

		char letter5 = str.charAt(4);
		System.out.println("Letter at index 4 is " + letter5 + ".");

//		char somLetter=str.charAt(55); RunTime Exception -->stringIndexOutOfBoundsExcepyion
		// System.out.println(someLetter);
		
		// get all characters 1 by 1 from a string ?
		char letter;
		for (int i = 0; i < str.length(); i++) {

			letter = str.charAt(i);
			System.out.print(letter + " ");
		}

		System.out.println("-----indexOf() FUNCTION-------");

		String name = "Syntax Technologies";
		int index = name.indexOf("y");
		System.out.println(index);

		index = name.indexOf(" ");
		System.out.println(index);

		index = name.indexOf("Syntax");
		System.out.println(index);

		name.indexOf("!");
		System.out.println("Indexof not existing characters" + index);

		index = name.indexOf("Technologies");
		System.out.println("Indexof not existing characters" + index);
		
		index=name.lastIndexOf("o");
		System.out.println("Index of second o="+index);
		
		index=name.lastIndexOf("o");
		System.out.println("Index of secound o="+index);
	}
}