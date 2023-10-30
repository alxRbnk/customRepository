package com.rubnikovich.task1.service.arithmetic;

import com.rubnikovich.task1.exception.CustomException;

public interface ServiceArithmetic {

    public int sumValuesArray(int[] arr) throws CustomException;

    public int averageValuesArray(int[] arr) throws CustomException;

    public int countPositiveNumber(int[] arr) throws CustomException;

    public int countNegativeNumber(int[] arr) throws CustomException;

    public int maxValueArray(int[] arr) throws CustomException;

    public int minValueArray(int[] arr) throws CustomException;

    public String getInfo();            //fixme

    public void setInfo(String info);   //fixme

}
