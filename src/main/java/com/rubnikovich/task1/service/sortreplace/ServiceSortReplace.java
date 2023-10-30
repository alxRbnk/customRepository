package com.rubnikovich.task1.service.sortreplace;

import com.rubnikovich.task1.exception.CustomException;

public interface ServiceSortReplace {

    public int[] replaceValueArray(int[] arr, int value, int index) throws CustomException;

    public int[] firstSortArray(int[] array) throws CustomException;

    public int[] wildSortArray(int[] array) throws CustomException;

    public int[] anotherSortArray(int[] array) throws CustomException;

}