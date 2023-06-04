package com.kodilla.basic_assertion.CalculatorTestSuite;

import basic_assertion.PrimeChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {
    private PrimeChecker primeChecker = new PrimeChecker();
    private static int count = 0;

    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
        boolean result = primeChecker.isPrime(14);
        count++;
        System.out.println("Test number: " + count);
        assertFalse(result);
    }

    @Test
    protected void shouldReturnTrueWhenPassingPrimeNumber() {
        boolean result = primeChecker.isPrime(13);
        count++;
        System.out.println("Test number:" + count);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingTwo() {
        boolean result = primeChecker.isPrime(2);
        count++;
        System.out.println("Test number:" + count);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingOne() {
        boolean result = primeChecker.isPrime(1);
        count++;
        System.out.println("Test number:" + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingZero() {
        boolean result = primeChecker.isPrime(0);
        count++;
        System.out.println("Test number: " + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {
        boolean result = primeChecker.isPrime(-6);
        count++;
        System.out.println("Test number: " + count);
        assertFalse(result);
    }
}
