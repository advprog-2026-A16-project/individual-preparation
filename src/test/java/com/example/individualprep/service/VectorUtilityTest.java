package com.example.individualprep.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


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

    @Test
    void testAddTwoVectors() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};
        double[] expected = {5.0, 7.0, 9.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result);
    }

    @Test
    void testAddWithZeroVector() {
        double[] v1 = {1.0, -2.0, 3.0};
        double[] v2 = {0.0, 0.0, 0.0};
        double[] expected = {1.0, -2.0, 3.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result);
    }

    @Test
    void testAddWithNegativeValues() {
        double[] v1 = {-1.0, 2.0, -3.0};
        double[] v2 = {4.0, -5.0, 6.0};
        double[] expected = {3.0, -3.0, 3.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result);
    }

    @Test
    void testAddVectorsWithDifferentLength() {
        double[] v1 = {1.0, 2.0};
        double[] v2 = {1.0, 2.0, 3.0};

        assertThrows(IllegalArgumentException.class,
                () -> vectorUtility.add(v1, v2));
    }

    @Test
    void testAddWithNullVector() {
        double[] v1 = null;
        double[] v2 = {1.0, 2.0, 3.0};

        assertThrows(IllegalArgumentException.class,
                () -> vectorUtility.add(v1, v2));
    }

    @Test
    void testNormPositiveValues() {
        double[] vector = {3.0, 4.0};
        double result = vectorUtility.norm(vector);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    void testNorm_NegativeValues() {
        double[] vector = {-3.0, -4.0};
        double result = vectorUtility.norm(vector);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    void testNorm_SingleValue() {
        double[] vector = {6.0};
        double result = vectorUtility.norm(vector);
        assertEquals(6.0, result, 0.0001);
    }

    @Test
    void testNorm_ZeroVector() {
        double[] vector = {0.0, 0.0, 0.0};
        double result = vectorUtility.norm(vector);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    void testNorm_NullVector_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.norm(null);
        });
    }

    @Test
    void testNorm_EmptyVector_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.norm(new double[]{});
        });
    }
}
