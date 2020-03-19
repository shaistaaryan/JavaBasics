package com.class13;

public class Recap {

	public static void main(String[] args) {

		String str = ""; // empty value
		System.out.println(str.isEmpty());

		String str1 = null;// no value at all
		// System.out.println(str1.isEmpty()); CE-->nullpointerExeption

		String str2 = "Good Morning ";
		String str3 = "students";
		String str4 = "!";
		// "Good Morning -->Good Morning--> Good Moringstudents-->
		str2 = str2.trim().concat(str3).

		// "Good Moringstudents
				concat(str4);

		System.out.println(str2);

		String str5 = "Day";
		int data = 25;

		// str5.cocat(data);CE:change type

		String str6 = " Hello ";
		String str7 = "Syntax";
//		 str6=str6.concat(str7).trim();
//		 System.out.println(dtr6);--->"Hello Syantax"
		str6 = str6.trim().concat(str7);
		System.out.println(str6);// "Hello Sysntax"

	}

}
