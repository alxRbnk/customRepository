package com.rubnikovich.task1.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMinTest {

    @Test
    void methodPositiveMaxValue() {
        MaxMin maxMin = new MaxMin();
        int[] array = {1, -2, -3, 4, 5};
        int actual = maxMin.maxValue(array);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void methodPositiveMinValue() {
        MaxMin maxMin = new MaxMin();
        int[] array = {1, -2, -3, 4, 5};
        int actual = maxMin.minValue(array);
        int expected = -3;
        Assertions.assertEquals(expected, actual);
    }
}