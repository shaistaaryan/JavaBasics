package com.class23;

public class Recap {
	public void hello() {
		System.out.println("Hello");  //--->this method is overloaded
	}

	public void hello(String name ) {    //--->this method is over loaded
		System.out.println("hello "+name);
	}

	public void hello(int num) {  //==== this method os overloaded
		System.out.println("hello" +num);
	}
	
	// CE: overloading is not possaible by changig access modifier
//	private void hello(String str) {
//		System.out.println(str);
//	}

	
	//CE: overloading is not possiable by changing rturn type
//	public String hello(String name){
//return name;
	//}
}
