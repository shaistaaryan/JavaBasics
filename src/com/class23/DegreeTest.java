package com.class23;

public class DegreeTest {

	public static void main(String[] args) {

		Degree degree = new Degree();

		degree.degree="degree";
		degree.degree();
		
		Masters ms=new Masters();
		ms.degree ="phd";
		ms.degree();
		
		CreditCard cc=new CreditCard();
		cc.degree ="master";
		cc.degree();
		
		instance ie =new instance();
		ie.degree = "doc";
		ie.degree();
	}
}
