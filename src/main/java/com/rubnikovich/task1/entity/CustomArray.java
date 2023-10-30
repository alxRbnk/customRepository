package com.rubnikovich.task1.entity;

import java.util.Arrays;

public class CustomArray {

    private int[] arr;
    private int index;

    public CustomArray(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(Arrays.toString(arr));
        return sb.toString();
    }
}
