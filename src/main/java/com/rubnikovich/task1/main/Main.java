package com.rubnikovich.task1.main;

import com.rubnikovich.task1.creator.ArrayFromListFactory;
import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.reader.ReadCustomFile;
import com.rubnikovich.task1.service.arithmetic.ServiceArithmetic;
import com.rubnikovich.task1.service.arithmetic.impl.ServiceArithmeticImpl;
import com.rubnikovich.task1.service.sortreplace.ServiceSortReplace;
import com.rubnikovich.task1.service.sortreplace.impl.ServiceSortReplaceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) throws CustomException {
        ReadCustomFile read = new ReadCustomFile();
        List<String> list = read.readFile("arrFile.txt");
        ArrayFromListFactory arrayFromFile = new ArrayFromListFactory();
        CustomArray customArray = arrayFromFile.takeArray(list);
        CustomArray customArrayFix = arrayFromFile.takeFixedArray(list);

        ServiceSortReplace sort = ServiceSortReplaceImpl.getInstance();
        ServiceArithmetic arithmetic = ServiceArithmeticImpl.getInstance();

        System.out.println("array: " + customArray);
        System.out.println("fixed array: " + customArrayFix);

//        System.out.println("average: " + arithmetic.averageValuesArray(customArray));
//        System.out.println("count negative value: " + arithmetic.countNegativeNumber(customArray));
//        System.out.println("count positive value: " + arithmetic.countPositiveNumber(customArray));
//        System.out.println("min value: " + arithmetic.minValueArray(customArray));
//        System.out.println("max value: " + arithmetic.maxValueArray(customArray));
//        System.out.println("sum value: " + arithmetic.sumValuesArray(customArray));
//        System.out.println("sort three: " + sort.anotherSortArray(customArray));
//        System.out.println("replace: " + sort.replaceValueArray(customArray,0,0));

    }
}
