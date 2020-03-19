package com.class07;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {


   Scanner scan;
   char gender;
   String genderType;
   
   scan=new Scanner(System.in);
   System.out.println("Pleaase enter gender: M or F");
   gender=scan.next().charAt(0);
   
   switch(gender) {
   
   case 'M':
   genderType="Male";
   break;
   
   case 'F':
   genderType="Female";
   break;
   
   default:
	   genderType ="Unknow";
	   
   }
System.out.println("You re gender is " + genderType);






}
}
