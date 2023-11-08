package com.rubnikovich.task1.entity;

import com.rubnikovich.task1.util.IdGenerator;

import java.util.Arrays;
import java.util.Objects;

public class CustomArray {

    private int arrayId;
    private int[] array;

    public CustomArray(int[] arr) {
        this.array = arr;
        this.arrayId = IdGenerator.generate();
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getArrayId() {
        return arrayId;
    }

    public void setArrayId(int arrayId) {
        this.arrayId = arrayId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return arrayId == that.arrayId && Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(arrayId);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(Arrays.toString(array));
        sb.append(" Id - ").append(arrayId);
        return sb.toString();
    }
}
