package com.rubnikovich.task1.service.sortreplace;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;

public interface ServiceSortReplace {

    CustomArray replaceValueArray(CustomArray customArray, int value, int index) throws CustomException;

    CustomArray firstSortArray(CustomArray customArray) throws CustomException;

    CustomArray wildSortArray(CustomArray customArray) throws CustomException;

    CustomArray anotherSortArray(CustomArray customArray) throws CustomException;

}