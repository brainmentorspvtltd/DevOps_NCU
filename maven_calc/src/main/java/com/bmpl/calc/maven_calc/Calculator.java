package com.bmpl.calc.maven_calc;

public class Calculator {
	public int evaluate(String expression) {
		int sum = 0;
		for (String expr : expression.split("\\+")) {
			sum += Integer.valueOf(expr);
		}
		return sum;
	}
}
