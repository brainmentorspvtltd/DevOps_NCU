package com.bmpl.calc.maven_calc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void evaluateExpression() {
    	Calculator calc = new Calculator();
    	String expression = "1+2+3+4";
    	int sum = calc.evaluate(expression);
    	int expectedResult = 11;
    	assertEquals(expectedResult, sum);
    }
}
