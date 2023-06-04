package com.kodilla.basic_assertion.CalculatorTestSuite;

import basic_assertion.Calculator;
import org.junit.jupiter.api.Test;

import static java.lang.Math.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(2, -3, subtractResult);
    }
    public void testPow() {
        double c = 2;
        int d = 2;
        Math calculator;
        calculator = null;
        double powResult = pow(c);
        assertEquals(4, 3, powResult);
    }

    private double pow(double c) {
        return 2 * 2;
    }
}
