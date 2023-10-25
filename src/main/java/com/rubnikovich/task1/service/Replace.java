package com.rubnikovich.task1.service;

public class Replace {

    public int[] replaceValue(int[] arr, int value, int index){
        if(index > arr.length){
            System.out.println("----------"); //fixme
        }
        int[] array = arr;
        array[index] = value;
        return array;
    }
}
