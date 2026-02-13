package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticUtility {
    
    public double add(double o1, double o2) { return o1 + o2; }

    public double subtract(double o1, double o2) {
        // TODO: Implement me properly!
        return 0.0;
    }

    public double multiply(double o1, double o2) {
        return o1 * o2;
    }

    public double divide(double o1, double o2) {
        // TODO: Implement me properly!
        return 0.0;
    }

    public double exponent(double o1, int n) {
        if (o1 == 0 && n < 0) {
            throw new IllegalArgumentException("0 cannot be raised to a negative power");
        }

        if (n == 0) {
            return 1.0;
        }

        long remainingExponent = n;

        if (remainingExponent < 0) {
            o1 = 1.0 / o1;
            remainingExponent = -remainingExponent;
        }

        double result = 1.0;
        double currentBase = o1;

        while (remainingExponent > 0) {
            if (remainingExponent % 2 == 1) {
                result *= currentBase;
            }
            currentBase *= currentBase;
            remainingExponent /= 2;
        }

        return result;
    }
}
