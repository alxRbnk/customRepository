package com.rubnikovich.task1.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void methodPositive() {
        Sum sum = new Sum();
        int[] array = {1, 2, 3, -4};
        int actual = sum.sumValuesArray(array);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
}