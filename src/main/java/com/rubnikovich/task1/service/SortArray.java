package com.rubnikovich.task1.service;

public class SortArray {

    public int[] firstSortArr(int[] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public int[] wildSortArr(int[] array) {
        int[] ar = new int[array.length];
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int min = Integer.MAX_VALUE;
            temp[i] = Integer.MIN_VALUE;
            for (int j = 0; j < array.length; j++) {
                if (temp[j] == array[j]) {
                    continue;
                }
                if (array[j] < min) {
                    min = array[j];
                    temp[j] = min;
                }
            }
            ar[i] = min;
        }
        return ar;
    }

}
