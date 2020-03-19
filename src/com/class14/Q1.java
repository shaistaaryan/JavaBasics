package com.class14;

public class Q1 {

	public static void main(String[] args) {
		/*
		 * write a program to swp 2 numbers without a temporary variable ? swp 2
		 * string without a temporary variable
		 */
       int a = 100;
       int b =200;

       a=a+b;//30
       b=a-b;//30-20=10
       a=a-b;

       System.out.println("The value of a = "+a);
       System.out.println("The value of b="+b);

       String str1="Day";
       String str2="Night";
       
       str1=str1+str2;//DayNight
       str2=str1.substring(0,str1.length()-str2.length());//Day
       str1=str1.substring(str2.length());//Night
       
       System.out.println("The value str1 = "+str1);
       System.out.println("The value str2 = "+str2);
       
       // another way
       String s1="Hello";
       String s2="Bye";
       
       String shorterstr1 =s1+s2;
       s2=shorterstr1.replace(s2,"");
       s2=shorterstr1.replace(s2,"");
       
       System.out.println("The value str1 = "+s1);
       System.out.println("The value str1 = "+s2);
	}

}
