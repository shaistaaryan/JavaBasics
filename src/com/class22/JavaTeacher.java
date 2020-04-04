package com.class22;

public class JavaTeacher extends Teacher {

	String certifications;
	
	JavaTeacher(String name , String lastName, String certifications){
		super(name, lastName);
		this.certifications=certifications;
		
		
	}
	
	JavaTeacher(String name, String lastName){
		super(name, lastName);
	}
}
