package com.class08;

public class PostAndPreIncrement {
public static void main(String[] args) {
	
	// ++,--
	//preincrement ++y, pstincrement y++
	
	int y=10;
    y=y++;   //postincremenet = first use the variable and then incremenet
    
    System.out.println(y);
	
    int w;
	int x=10;
	w=++x; // first incermenet and then use it and assign it 
	System.out.println(w);
	
	int num=1;
	while(num<5) {
		++num;
		System.out.println(++num);
	}
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	int num1=1;
	while(num1<5) {
		++num;
		System.out.println(num1++);
	}
	
	
	
}
}
