package com.class16;

public class MethodsReturningValue {

	public static void main(String[] args) {
		
		// create String and based on the length of the String 
		//we define whether string is short or long
		
		String str ="Hello friend";
		int Length = str.length();
		
		if(Length >10) {
			System.out.println("String ids long");
		}else {
			System.out.println("String is short");
		}
	
	//compare 2 numbers and then we indntify  whether largest number is even or odd
		
		Methods obj = new Methods();
		int num =obj.isLarger(10, 20);
		//create method that returns largest number form 2 given numbers
		//int num=obj.Largest(12,13);
		
		MethodsReturningValue newObject=new MethodsReturningValue();
		int num=newObject.Largest(12, 13);
		newObject.isOdd.isOdd
	}
	//create a method that retuerns largest numbers frome 2 given numbers
		
	int Largest(int a, int b) {
			
			int Largest;
			if(a>b) {
				Largest=a;
			}else {
				Largest=b;
			}
		return Largest;
		}
	
	void isOdd(int num) {
		boolean isOdd(int num) {
			
		}
		
		if(num%2==0) {
			isOdd=false;
		}else {
			isOdd=true;
		}
	
		return ;
	}

}
