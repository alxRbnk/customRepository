package com.rubnikovich.task1.service.arithmetic;

import com.rubnikovich.task1.entity.ArrayStatistics;
import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;

public interface ServiceArithmetic {

    int sumValuesArray(CustomArray customArray);

    int averageValuesArray(CustomArray customArray);

    int countPositiveNumber(CustomArray customArray);

    int countNegativeNumber(CustomArray customArray);

    int maxValueArray(CustomArray customArray);

    int minValueArray(CustomArray customArray);

    ArrayStatistics createAllStatistics(CustomArray customArray);

}
