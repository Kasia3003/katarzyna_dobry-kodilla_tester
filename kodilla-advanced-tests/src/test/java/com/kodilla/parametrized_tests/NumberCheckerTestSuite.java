package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTestSuite {
    private NumberChecker numberChecker = new NumberChecker();

    @ParameterizedTest
    @ValueSource(ints = {0, 3, 6, -3, -12, 15})
    public void shouldReturnTrueForNumberDivisibleByThree(int number) {
        boolean reasult = numberChecker.isDivisibleByThree(number);
            assertTrue(reasult);
    }
    @ParameterizedTest
    @ValueSource(ints = {-2, -1, 1, 2, 4, 5})
    public void shouldReturnTrueForNumberNotDivisibleByThree(int number) {
        boolean reasult = numberChecker.isDivisibleByThree(number);
        assertFalse(reasult);
    }

}
