package com.rubnikovich.task1.service;

import java.util.Arrays;

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

    public int[] wildSort(int[] array) {
        int[] temp = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            temp[i] = min;
            array[index] = Integer.MAX_VALUE;
        }
        return temp;
    }

    public int[] anotherSort(int[] array) {

        return array;
    }


}
