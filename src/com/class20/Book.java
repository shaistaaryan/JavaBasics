package com.class20;

public class Book {

	String book1 , book2;
	
	Book(){
	}
	Book(String Book1, String Book2){
		
		this.book1=book1;
		this.book2=book2;
		
	}
	void TwoBooks() {
		System.out.println(book1+" "+book2);
	}
	
	public static void main(String[] args) {
		
		Book book = new Book("english" , "spanic");
		 
		
	}
}