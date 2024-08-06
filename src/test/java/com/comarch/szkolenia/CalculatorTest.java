package com.comarch.szkolenia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void addTwoPositiveNumbersTest() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 7;
        int expectedResult = 12;

        int actual = calculator.add(a, b);

        Assertions.assertEquals(expectedResult, actual);
    }
}
