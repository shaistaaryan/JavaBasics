package com.class16;

public class CalculatorTeast {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		calc.add(100, 200);
		calc.sub(1000, 300);
		// clac.add(200);
		// clac.add(100.99, 200.99); CE

		calc.add(1000, 2000);
		calc.sub(10, 3);
		calc.mult(20, 10);
		calc.div(20, 10);

	}

}
