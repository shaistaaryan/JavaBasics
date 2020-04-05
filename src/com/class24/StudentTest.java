package com.class24;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("-----Student object and student type");
		Student student = new Student();
		student.study();
		student.doHomework();
 
		System.out.println("-----Syntax Student Ojbect and Reference SyntaxStudnet type");
		SyntaxStudent syntax = new SyntaxStudent();
		syntax.doHomework();
		syntax.study();
		syntax.accessParentOverridenMethod();
		syntax.getJob();

		System.out.println("-----SynyaxStudent Object and Studnet Reference typs");
		Student st = new SyntaxStudent();
        st.study();
		st.doHomework();
		
		
		
		// SyntaxStudent st1=new Student ();

	}

}
