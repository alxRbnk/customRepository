package com.rubnikovich.task1.service.sortreplace;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;

public interface ServiceSortReplace {

    CustomArray replaceValueArray(CustomArray customArray, int value, int index);

    CustomArray firstSortArray(CustomArray customArray);

    CustomArray wildSortArray(CustomArray customArray);

    CustomArray anotherSortArray(CustomArray customArray);

}