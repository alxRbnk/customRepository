package com.rubnikovich.task1.service.arithmetic.impl;

import com.rubnikovich.task1.service.arithmetic.ServiceArithmetic;

public class ServiceArithmeticImpl implements ServiceArithmetic {

    public int sumValuesArray(int[] arr) {
        int sum = 0;
        for (int s : arr) {
            sum += s;
        }
        return sum;
    }

    public int averageValuesArray(int[] arr) {
        double number = 0;
        for (int s : arr) {
            number += s;
        }
        return (int) Math.round(number / arr.length);
    }

    public int countPositiveNumber(int[] arr) {
        int positive = 0;
        for (int s : arr) {
            if (s > 0) {
                positive++;
            }
        }
        return positive;
    }

    public int countNegativeNumber(int[] arr) {
        int negative = 0;
        for (int s : arr) {
            if (s < 0) {
                negative++;
            }
        }
        return negative;
    }

    public int maxValueArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int s : arr) {
            if (s > max) {
                max = s;
            }
        }
        return max;
    }

    public int minValueArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int s : arr) {
            if (s < min) {
                min = s;
            }
        }
        return min;
    }

}
