package com.rubnikovich.task1.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayTest {

    @Test
    void methodPositiveFirst() {
        SortArray sortArray = new SortArray();
        int[] array = {1, -2, -3, 4, 5, 4, 0};
        int[] actual = sortArray.firstSortArr(array);
        int[] expected = {-3, -2, 0, 1, 4, 4, 5};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void methodPositiveWild() {
        SortArray sortArrayWild = new SortArray();
        int[] arrayWild = {1, -2, -3, 4, 5, 4, 0};
        int[] actual = sortArrayWild.wildSort(arrayWild);
        int[] expected = {-3, -2, 0, 1, 4, 4, 5};
        Assertions.assertArrayEquals(expected,actual);
    }
}