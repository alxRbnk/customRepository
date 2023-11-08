package com.rubnikovich.task1.service.arithmetic;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;

public interface ServiceArithmetic {

    int sumValuesArray(CustomArray customArray) throws CustomException;

    int averageValuesArray(CustomArray customArray) throws CustomException;

    int countPositiveNumber(CustomArray customArray) throws CustomException;

    int countNegativeNumber(CustomArray customArray) throws CustomException;

    int maxValueArray(CustomArray customArray) throws CustomException;

    int minValueArray(CustomArray customArray) throws CustomException;

    String getInfo();            //fixme

    void setInfo(String info);   //fixme

}
