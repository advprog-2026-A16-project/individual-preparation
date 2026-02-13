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
    void testZeroBaseNegativeExponentShouldThrowException() {
        assertThrows(IllegalArgumentException.class,
                () -> arithmeticUtility.exponent(0.0, -1));
    }

    @Test
    void testExponentZeroPower() {
        double result = arithmeticUtility.exponent(7.0, 0);
        assertEquals(1.0, result);
    }

    @Test
    void testExponentWithOne() {
        double result = arithmeticUtility.exponent(5.0, 1);
        assertEquals(5.0, result);
    }

    @Test
    void testExponentPositive() {
        double result = arithmeticUtility.exponent(2.0, 3);
        assertEquals(8.0, result);
    }

    @Test
    void testNegativeExponent() {
        double result = arithmeticUtility.exponent(2.0, -2);
        assertEquals(0.25, result);
    }

    @Test
    void testAddPositiveNumbers() { assertEquals(8.0, arithmeticUtility.add(5,3)); }

    @Test
    void testAddNegativeNumbers() { assertEquals(-8.0, arithmeticUtility.add(-5,-3));}

    @Test
    void testAddPositiveAndNegative() { assertEquals(2.0, arithmeticUtility.add(5,-3)); }

    @Test
    void testAddWithZero() { assertEquals(5.0, arithmeticUtility.add(5,0));}
}
