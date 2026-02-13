package com.example.individualprep.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArithmeticUtilityTest {

    private ArithmeticUtility arithmeticUtility;

    @BeforeEach
    void setUp() {
        arithmeticUtility = new ArithmeticUtility();
    }

    @Test
    void testMultiplyTwoPositiveNumbers() {
        assertEquals(42.0, arithmeticUtility.multiply(6, 7));
    }

    @Test
    void testMultiplyWithZero() {
        assertEquals(0.0, arithmeticUtility.multiply(100, 0));
    }
    
    @Test
    void testMultiplyWithNegativeNumber() {
        assertEquals(-25.0, arithmeticUtility.multiply(5, -5));
    }

    @Test
    void testDivideTwoPositiveNumbers() {
        assertEquals(5.0, arithmeticUtility.divide(10, 2));
    }

    @Test
    void testDivideWithNegativeNumber() {
        assertEquals(-5.0, arithmeticUtility.divide(-10, 2));
    }

    @Test
    void testDivideZeroByNumber() {
        assertEquals(0.0, arithmeticUtility.divide(0, 5));
    }

    @Test
    void testDivideByZero() {
        ArithmeticException exception = org.junit.jupiter.api.Assertions.assertThrows(
                ArithmeticException.class,
                () -> arithmeticUtility.divide(10, 0)
        );

        assertEquals("Division by zero", exception.getMessage());
    }
}
