package com.rubnikovich.task1.entity;

import java.util.Arrays;
import java.util.Objects;

public class CustomArray {

    private int[] arr;
    private int Id;

    public CustomArray(int[] arr, int index) {
        this.arr = arr;
        this.Id = index;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return Id == that.Id && Arrays.equals(arr, that.arr);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(Id);
        result = 31 * result + Arrays.hashCode(arr);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(Arrays.toString(arr));
        sb.append(" Id - ").append(Id);

        return sb.toString();
    }
}
