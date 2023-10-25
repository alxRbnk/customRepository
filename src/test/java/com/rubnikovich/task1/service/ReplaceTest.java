package com.rubnikovich.task1.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceTest {

    @Test
    void methodPositive() {
        Replace replace = new Replace();
        int[] array = {1, -2, -3, 4, 5};
        int[] actual = replace.replaceValue(array, 99, 2);
        int[] expected = {1, -2, 99, 4, 5};
        Assertions.assertArrayEquals(expected, actual);
    }
}