package com.rubnikovich.task1.service;

public class Sum {

    public int sumValuesArray(int[] arr) {
        int sum = 0;
        for (int s : arr) {
            sum += s;
        }
        return sum;
    }

}
