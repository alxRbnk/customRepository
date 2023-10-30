package com.rubnikovich.task1.service.arithmetic;

import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.service.arithmetic.impl.ServiceArithmeticImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiceArithmeticTest {

    private static final int[] ARRAY = {1, -2, -3, 4, 5, 4, 0};
    private static final int[] ARRAY_ONE = {1, -2, -1, -4, 5, 4, 0};
    private static final int[] ARRAY_TWO = {0, -2, -3, 1, 15, 4, 0};
    private static final int[] ARRAY_THREE = {5, -2, -3, 1, 5, 4, 6};
    ServiceArithmetic array;

    @BeforeEach
    public void createServiceArithmetic() {
        array = ServiceArithmeticImpl.getInstance();
    }

    @ParameterizedTest
    @MethodSource("argsFactory")
    void sumValuesArrayOne(int[] input, int expected) throws CustomException {
        assertEquals(expected, array.sumValuesArray(input));
    }

    private static Stream<Arguments> argsFactory() {
        return Stream.of(
                Arguments.of(ARRAY, 9),
                Arguments.of(ARRAY_ONE, 3),
                Arguments.of(ARRAY_TWO, 15),
                Arguments.of(ARRAY_THREE, 16)
        );
    }

    @Test
    void averageValuesArray() throws CustomException {
        int actual = array.averageValuesArray(ARRAY);
        int expected = 1;
        assertEquals(expected, actual);

    }

    @Test
    void countPositiveNumber() throws CustomException {
        int actual = array.countPositiveNumber(ARRAY);
        int expected = 4;
        assertEquals(expected, actual);

    }

    @Test
    void countNegativeNumber() throws CustomException {
        int actual = array.countNegativeNumber(ARRAY);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void maxValueArray() throws CustomException {
        int actual = array.maxValueArray(ARRAY);
        int expected = 5;
        assertEquals(expected, actual);

    }

    @Test
    void minValueArray() throws CustomException {
        int actual = array.minValueArray(ARRAY);
        int expected = -3;
        assertEquals(expected, actual);
    }
}