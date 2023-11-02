package com.rubnikovich.task1.service.arithmetic;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;

public interface ServiceArithmetic {

    public int sumValuesArray(CustomArray customArray) throws CustomException;

    public int averageValuesArray(CustomArray customArray) throws CustomException;

    public int countPositiveNumber(CustomArray customArray) throws CustomException;

    public int countNegativeNumber(CustomArray customArray) throws CustomException;

    public int maxValueArray(CustomArray customArray) throws CustomException;

    public int minValueArray(CustomArray customArray) throws CustomException;

    public String getInfo();            //fixme

    public void setInfo(String info);   //fixme

}
