package com.rubnikovich.task1.service.sortreplace.impl;

import com.rubnikovich.task1.service.sortreplace.ServiceSortReplace;

public class ServiceSortReplaceImpl implements ServiceSortReplace {

    public int[] replaceValueArray(int[] arr, int value, int index) {
        int[] temp = arr.clone();
        if (index > arr.length) {
            System.out.println("----------"); //fixme
        }
        int[] array = temp;
        array[index] = value;
        return array;
    }

    public int[] firstSortArray(int[] array) {
        int[] sortArr = array.clone();
        for (int i = 0; i < sortArr.length; i++) {
            for (int j = 0; j < sortArr.length; j++) {
                if (sortArr[i] < sortArr[j]) {
                    int temp = sortArr[i];
                    sortArr[i] = sortArr[j];
                    sortArr[j] = temp;
                }
            }
        }
        return sortArr;
    }

    public int[] wildSortArray(int[] array) {
        int[] cloneArray = array.clone();
        int[] temp = new int[cloneArray.length];
        int index = 0;
        for (int i = 0; i < cloneArray.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < cloneArray.length; j++) {
                if (cloneArray[j] < min) {
                    min = cloneArray[j];
                    index = j;
                }
            }
            temp[i] = min;
            cloneArray[index] = Integer.MAX_VALUE;
        }
        return temp;
    }

    public int[] anotherSortArray(int[] array) {
        int[] cloneArray = array.clone();
        for (int i = 0; i < cloneArray.length; i++) {
            int temp = i;
            for (int j = i; j < cloneArray.length; j++) {
                if (cloneArray[j] < cloneArray[temp]) {
                    temp = j;
                }
            }
            int tmp = cloneArray[i];
            cloneArray[i] = cloneArray[temp];
            cloneArray[temp] = tmp;
        }
        return cloneArray;
    }

}
