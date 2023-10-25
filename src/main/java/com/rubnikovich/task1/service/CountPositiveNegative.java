package com.rubnikovich.task1.service;

public class CountPositiveNegative {

    public int countPositive(int[] arr) {
        int positive = 0;
        for (int s : arr) {
            if (s > 0) {
                positive++;
            }
        }
        return positive;
    }

    public int countNegative(int[] arr) {
        int negative = 0;
        for (int s : arr) {
            if (s < 0) {
                negative++;
            }
        }
        return negative;
    }

}
