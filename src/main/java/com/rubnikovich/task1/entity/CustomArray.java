package com.rubnikovich.task1.entity;

import java.util.Arrays;

public class CustomArray {
    private int[] arr;

    public CustomArray(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(Arrays.toString(arr));
        return sb.toString();
    }
}
