package com.rubnikovich.task1.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountPositiveNegativeTest {

    @Test
    void methodPositivePos() {
        CountPositiveNegative countPositiveNegative = new CountPositiveNegative();
        int[] array = {1, -2, -3, 4, 5};
        int actual = countPositiveNegative.countPositive(array);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void methodPositiveNeg() {
        CountPositiveNegative countPositiveNegative = new CountPositiveNegative();
        int[] array = {1, 2, -3, 4, 5, -5, -3};
        int actual = countPositiveNegative.countNegative(array);
        int expected = 3;
        Assertions.assertEquals(expected, actual);

    }
}