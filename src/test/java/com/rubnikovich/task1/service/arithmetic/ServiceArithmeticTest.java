package com.rubnikovich.task1.service.arithmetic;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.service.arithmetic.impl.ServiceArithmeticImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiceArithmeticTest {

    ServiceArithmetic service = ServiceArithmeticImpl.getInstance();

    @ParameterizedTest
    @MethodSource("argsFactory")
    void sumValuesArrayOne(CustomArray input, int expected) throws CustomException {
        assertEquals(expected, service.sumValuesArray(input));
    }

    private static Stream<Arguments> argsFactory() {
        return Stream.of(
                Arguments.of(new CustomArray(new int[]{1, -2, -3, 4, 5, 4, 0}), 9),
                Arguments.of(new CustomArray(new int[]{1, -2, -1, -4, 5, 4, 0}), 3),
                Arguments.of(new CustomArray(new int[]{0, -2, -3, 1, 15, 4, 0}), 15),
                Arguments.of(new CustomArray(new int[]{5, -2, -3, 1, 5, 4, 6}), 16)
        );
    }

    @Test
    void averageValuesArrayTest() throws CustomException {
        int actual = service.averageValuesArray(new CustomArray(new int[]{1, -2, -3, 4, 5, 4, 0}));
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void countPositiveNumberTest() throws CustomException {
        int actual = service.countPositiveNumber(new CustomArray(new int[]{1, -2, -3, 4, 5, 4, 0}));
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void countNegativeNumberTest() throws CustomException {
        int actual = service.countNegativeNumber(new CustomArray(new int[]{1, -2, -3, 4, 5, 4, 0}));
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void maxValueArrayTest() throws CustomException {
        int actual = service.maxValueArray(new CustomArray(new int[]{1, -2, -3, 4, 5, 4, 0}));
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void minValueArrayTest() throws CustomException {
        int actual = service.minValueArray(new CustomArray(new int[]{1, -2, -3, 4, 5, 4, 0}));
        int expected = -3;
        assertEquals(expected, actual);
    }

}