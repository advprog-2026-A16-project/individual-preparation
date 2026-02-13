package com.example.individualprep.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class VectorUtilityTest {

    private VectorUtility vectorUtility;

    @BeforeEach
    void setUp() {
        vectorUtility = new VectorUtility();
    }

    @Test
    void testMultiplyVectorByScalar() {
        double[] vector = {1.0, 2.0, 3.0};
        int scalar = 3;
        double[] expected = {3.0, 6.0, 9.0};
        double[] result = vectorUtility.multiply(vector, scalar);
        assertArrayEquals(expected, result);
    }

    @Test
    void testMultiplyVectorByZero() {
        double[] vector = {10.0, 20.0, 30.0};
        int scalar = 0;
        double[] expected = {0.0, 0.0, 0.0};
        double[] result = vectorUtility.multiply(vector, scalar);
        assertArrayEquals(expected, result);
    }

    @Test
    void testMultiplyVectorByNegativeScalar() {
        double[] vector = {2.0, -4.0, 6.0};
        int scalar = -2;
        double[] expected = {-4.0, 8.0, -12.0};
        double[] result = vectorUtility.multiply(vector, scalar);
        assertArrayEquals(expected, result);
    }
}
