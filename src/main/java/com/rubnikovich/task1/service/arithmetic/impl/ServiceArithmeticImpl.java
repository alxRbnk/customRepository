package com.rubnikovich.task1.service.arithmetic.impl;

import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.service.arithmetic.ServiceArithmetic;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceArithmeticImpl implements ServiceArithmetic {

    static Logger logger = LogManager.getLogger();
    private static ServiceArithmeticImpl INSTANCE;
    private String info = "for check";                      //fixme

    private ServiceArithmeticImpl() {
    }

    public static ServiceArithmeticImpl getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ServiceArithmeticImpl();
        }
        return INSTANCE;
    }

    private void logService(int[] arr) throws CustomException {
        if (arr == null) {
            logger.error("Array is null");
            throw new CustomException("Array is null");
        }
    }

    public int sumValuesArray(int[] arr) throws CustomException {
        logService(arr);
        int sum = 0;
        for (int s : arr) {
            sum += s;
        }
        return sum;
    }

    public int averageValuesArray(int[] arr) throws CustomException {
        logService(arr);
        double number = 0;
        for (int s : arr) {
            number += s;
        }
        return (int) Math.round(number / arr.length);
    }

    public int countPositiveNumber(int[] arr) throws CustomException {
        logService(arr);
        int positive = 0;
        for (int s : arr) {
            if (s > 0) {
                positive++;
            }
        }
        return positive;
    }

    public int countNegativeNumber(int[] arr) throws CustomException {
        logService(arr);
        int negative = 0;
        for (int s : arr) {
            if (s < 0) {
                negative++;
            }
        }
        return negative;
    }

    public int maxValueArray(int[] arr) throws CustomException {
        logService(arr);
        int max = Integer.MIN_VALUE;
        for (int s : arr) {
            if (s > max) {
                max = s;
            }
        }
        return max;
    }

    public int minValueArray(int[] arr) throws CustomException {
        logService(arr);
        int min = Integer.MAX_VALUE;
        for (int s : arr) {
            if (s < min) {
                min = s;
            }
        }
        return min;
    }

    public String getInfo() {           //fixme
        return info;
    }

    public void setInfo(String info) {  //fixme
        this.info = info;
    }
}
