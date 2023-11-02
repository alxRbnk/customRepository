package com.rubnikovich.task1.service.arithmetic.impl;

import com.rubnikovich.task1.entity.CustomArray;
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

    private void logService(CustomArray customArray) throws CustomException {
        if (customArray == null) {
            logger.error("Array is null");
            throw new CustomException("Array is null");
        }
    }

    public int sumValuesArray(CustomArray customArray) throws CustomException {
        logService(customArray);
        int sum = 0;
        for (int s : customArray.getArr()) {
            sum += s;
        }
        return sum;
    }

    public int averageValuesArray(CustomArray customArray) throws CustomException {
        logService(customArray);
        double number = 0;
        for (int s : customArray.getArr()) {
            number += s;
        }
        return (int) Math.round(number / customArray.getArr().length);
    }

    public int countPositiveNumber(CustomArray customArray) throws CustomException {
        logService(customArray);
        int positive = 0;
        for (int s : customArray.getArr()) {
            if (s > 0) {
                positive++;
            }
        }
        return positive;
    }

    public int countNegativeNumber(CustomArray customArray) throws CustomException {
        logService(customArray);
        int negative = 0;
        for (int s : customArray.getArr()) {
            if (s < 0) {
                negative++;
            }
        }
        return negative;
    }

    public int maxValueArray(CustomArray customArray) throws CustomException {
        logService(customArray);
        int max = Integer.MIN_VALUE;
        for (int s : customArray.getArr()) {
            if (s > max) {
                max = s;
            }
        }
        return max;
    }

    public int minValueArray(CustomArray customArray) throws CustomException {
        logService(customArray);
        int min = Integer.MAX_VALUE;
        for (int s : customArray.getArr()) {
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
