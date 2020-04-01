package com.class18;

public class AccessingMembersOfClass {
  
	public static void main(String[] args) {
	Employee emp =new Employee();
	emp.name="faisal";
	emp.lastName="Sakhi";
	emp.salary=100000;
//	emp.ssn=78969;CE: field ssn isnot visable 
	
	Employee.method1();
	emp.mehtod2();
	emp.method3();
	//emp.methos
}
}
