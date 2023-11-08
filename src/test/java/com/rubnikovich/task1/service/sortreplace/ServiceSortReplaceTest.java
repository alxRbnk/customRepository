package com.rubnikovich.task1.service.sortreplace;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.service.sortreplace.impl.ServiceSortReplaceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ServiceSortReplaceTest {

    private ServiceSortReplace service = ServiceSortReplaceImpl.getInstance();

    @Test
    void replaceValueArrayTest() throws CustomException {
        CustomArray customArray = new CustomArray(new int[]{1, -2, -3, 4, 5, 4, 0});
        CustomArray actual = service.replaceValueArray(customArray, 99, 2);
        int[] expected = {1, -2, 99, 4, 5, 4, 0};
        assertArrayEquals(expected, actual.getArray());
    }

    @Test
    void firstSortArrayTest() throws CustomException {
        CustomArray customArray = new CustomArray(new int[]{1, -2, -3, 4, 5, 4, 1});
        CustomArray actual = service.firstSortArray(customArray);
        int[] expected = {-3, -2, 1, 1, 4, 4, 5};
        assertArrayEquals(expected, actual.getArray());
    }

    @Test
    void wildSortArrayTest() throws CustomException {
        CustomArray customArray = new CustomArray(new int[]{1, -2, -3, 4, 6, 4, -1});
        CustomArray actual = service.wildSortArray(customArray);
        int[] expected = {-3, -2, -1, 1, 4, 4, 6};
        assertArrayEquals(expected, actual.getArray());
    }

    @Test
    void anotherSortArrayTest() throws CustomException {
        CustomArray customArray = new CustomArray(new int[]{1, -2, -3, 4, 7, 4, 0});
        CustomArray actual = service.wildSortArray(customArray);
        int[] expected = {-3, -2, 0, 1, 4, 4, 7};
        assertArrayEquals(expected, actual.getArray());
    }

}