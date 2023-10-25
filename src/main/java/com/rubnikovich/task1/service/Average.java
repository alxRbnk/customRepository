package com.rubnikovich.task1.service;

public class Average {

    public int averageNumber(int[] arr) {
        double number = 0;
        for (int s : arr) {
            number += s;
        }
        return (int) Math.round(number / arr.length);
    }
}
