package com.rubnikovich.task1.service.sortreplace;

import com.rubnikovich.task1.service.sortreplace.impl.ServiceSortReplaceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ServiceSortReplaceTest {

    private static final int[] ARRAY = {1, -2, -3, 4, 5, 4, 0};
    private static final int[] SORT_ARRAY = {-3, -2, 0, 1, 4, 4, 5};
    private ServiceSortReplace array;

    @BeforeEach
    public void createServiceSortReplace(){
        array = new ServiceSortReplaceImpl();
    }

    @Test
    void replaceValueArray() {
        int[] actual = array.replaceValueArray(ARRAY, 99, 2);
        int[] expected = {1, -2, 99, 4, 5, 4, 0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void firstSortArray() {
        int[] actual = array.firstSortArray(ARRAY);
        int[] expected = SORT_ARRAY;
        assertArrayEquals(expected, actual);
    }

    @Test
    void wildSortArray() {
        int[] actual = array.wildSortArray(ARRAY);
        int[] expected = SORT_ARRAY;
        assertArrayEquals(expected,actual);
    }

    @Test
    void anotherSortArray() {
        int[] actual = array.wildSortArray(ARRAY);
        int[] expected = SORT_ARRAY;
        assertArrayEquals(expected,actual);
    }
}