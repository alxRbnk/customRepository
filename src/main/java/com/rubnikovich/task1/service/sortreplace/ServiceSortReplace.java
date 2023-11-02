package com.rubnikovich.task1.service.sortreplace;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;

public interface ServiceSortReplace {

    public CustomArray replaceValueArray(CustomArray customArray, int value, int index) throws CustomException;

    public CustomArray firstSortArray(CustomArray customArray) throws CustomException;

    public CustomArray wildSortArray(CustomArray customArray) throws CustomException;

    public CustomArray anotherSortArray(CustomArray customArray) throws CustomException;

}