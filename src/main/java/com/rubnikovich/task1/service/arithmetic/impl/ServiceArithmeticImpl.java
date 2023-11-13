package com.rubnikovich.task1.service.arithmetic.impl;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.entity.ArrayStatistics;
import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.service.arithmetic.ServiceArithmetic;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceArithmeticImpl implements ServiceArithmetic {

    private static final Logger logger = LogManager.getLogger();
    private static final ServiceArithmeticImpl instance = new ServiceArithmeticImpl();

    private ServiceArithmeticImpl() {
    }

    public static ServiceArithmeticImpl getInstance() {
        return instance;
    }

    public ArrayStatistics createAllStatistics(CustomArray customArray) {
        ArrayStatistics customStatistics = new ArrayStatistics();
        ServiceArithmetic service = ServiceArithmeticImpl.getInstance();
        int sum = service.sumValuesArray(customArray);
        int average = service.averageValuesArray(customArray);
        int countPositive = service.countPositiveNumber(customArray);
        int countNegative = service.countNegativeNumber(customArray);
        int maxVal = service.maxValueArray(customArray);
        int minVal = service.minValueArray(customArray);
        customStatistics.setSumVal(sum);
        customStatistics.setAverageVal(average);
        customStatistics.setCountPositive(countPositive);
        customStatistics.setCountNegative(countNegative);
        customStatistics.setMaxVal(maxVal);
        customStatistics.setMinVal(minVal);
        return customStatistics;
    }

    private void logService(CustomArray customArray) {
        if (customArray == null) {
            logger.error("Array is null");
        }
    }

    public int sumValuesArray(CustomArray customArray) {
        logService(customArray);
        int sum = 0;
        for (int s : customArray.getArray()) {
            sum += s;
        }
        return sum;
    }

    public int averageValuesArray(CustomArray customArray) {
        logService(customArray);
        double number = 0;
        for (int s : customArray.getArray()) {
            number += s;
        }
        return (int) Math.round(number / customArray.getArray().length);
    }

    public int countPositiveNumber(CustomArray customArray) {
        logService(customArray);
        int positive = 0;
        for (int s : customArray.getArray()) {
            if (s > 0) {
                positive++;
            }
        }
        return positive;
    }

    public int countNegativeNumber(CustomArray customArray) {
        logService(customArray);
        int negative = 0;
        for (int s : customArray.getArray()) {
            if (s < 0) {
                negative++;
            }
        }
        return negative;
    }

    public int maxValueArray(CustomArray customArray) {
        logService(customArray);
        int max = Integer.MIN_VALUE;
        for (int s : customArray.getArray()) {
            if (s > max) {
                max = s;
            }
        }
        return max;
    }

    public int minValueArray(CustomArray customArray) {
        logService(customArray);
        int min = Integer.MAX_VALUE;
        for (int s : customArray.getArray()) {
            if (s < min) {
                min = s;
            }
        }
        return min;
    }

}
