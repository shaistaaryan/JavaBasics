package com.class12;

import java.util.Scanner;

public class StringVerification {

	public static void main(String[] args) {
		Scanner scan;
		String username;
		String password;
		String confirmedPassword;

		scan = new Scanner(System.in);
		System.out.println("please enter youre username");
		username = scan.nextLine();

		System.out.println("please enter youre password ");
		password = scan.nextLine();

		if (!(username.isEmpty() && password.isEmpty())) {
			if (password.length() >= 8) {
				if (!password.contains(username)) {

				System.out.println("password is too short");
					confirmedPassword = scan.nextLine();
					if (password.equals(confirmedPassword)) {
						System.out.println("Your account is created");
					} else {
						System.out.println("Password are not matched");
					}else {
						System.out.println("password connot conyian username");
					}else {
						System.out.println("password is too short");
				    }else {
				    	System.out.println("username and password cannot be empty");
				    }
				}

			}
		}
		
		}

}
