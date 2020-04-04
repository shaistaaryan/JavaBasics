package com.class23;

public class OverLoadingMain {

	public static void main(int[] args) {
		System.out.println("Method wtih array arguments");

	}

	public static void main(String args) {
		System.out.println("Method wtih String arguments"+args);
	}

	public static void main(String args, String args1) {
		System.out.println("Method wtih 2 String arguments");
	}

	public static void main(String args, int num) {
		System.out.println("Method wtih 2 String arguments");
	}

	public static void main(int num, String args) {
		System.out.println("Method wtih 2 String arguments");
	}

	public static void main(String[] args) { // java always looks for this method with this signature
		System.out.println("Method wtih String array arguments");
		OverLoadingMain.main("str");
		main("str");
		main("hello", "hi");
		// int[] arr=new int[2];
		main(new int[2]);
	}

}
