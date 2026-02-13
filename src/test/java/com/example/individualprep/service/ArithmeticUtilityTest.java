package com.example.individualprep.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
