package com.rubnikovich.task1.service;

public class MaxMin {

    public int maxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int s : arr) {
            if (s > max) {
                max = s;
            }
        }
        return max;
    }

    public int minValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int s : arr) {
            if (s < min) {
                min = s;
            }
        }
        return min;
    }
}
