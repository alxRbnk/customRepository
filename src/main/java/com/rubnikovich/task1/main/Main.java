package com.rubnikovich.task1.main;

import com.rubnikovich.task1.creator.TakeArrayFromList;
import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.reader.ReadCustomFile;
import com.rubnikovich.task1.service.arithmetic.ServiceArithmetic;
import com.rubnikovich.task1.service.arithmetic.impl.ServiceArithmeticImpl;
import com.rubnikovich.task1.service.sortreplace.ServiceSortReplace;
import com.rubnikovich.task1.service.sortreplace.impl.ServiceSortReplaceImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CustomException {

        ReadCustomFile read = new ReadCustomFile();
        List<String> list = read.readFile("src/main/resources/arrFile.txt");
        TakeArrayFromList arrayFromFile = new TakeArrayFromList();
        CustomArray customArray = arrayFromFile.takeArray(list);
        int[] array = customArray.getArr();

        ServiceSortReplace sort = ServiceSortReplaceImpl.getInstance();
        ServiceArithmetic arithmetic = ServiceArithmeticImpl.getInstance();

        System.out.println("исходный массив: " + Arrays.toString(array));

        System.out.println("Сортировка 1: " + Arrays.toString(sort.firstSortArray(array)));
        System.out.println("Сортировка 2: " + Arrays.toString(sort.wildSortArray(array)));
        System.out.println("Сортировка 3: " + Arrays.toString(sort.anotherSortArray(array)));
        System.out.println("Замена элемента: " + Arrays.toString(sort.replaceValueArray(array, 0, 0)));

        System.out.println("Среднее значение: " + arithmetic.averageValuesArray(array));
        System.out.println("Кол-во отрицательных значений: " + arithmetic.countNegativeNumber(array));
        System.out.println("Кол-во отрицательных значений: " + arithmetic.countPositiveNumber(array));
        System.out.println("Минимальное значение: " + arithmetic.minValueArray(array));
        System.out.println("Максимальное значение: " + arithmetic.maxValueArray(array));
        System.out.println("Сумма значений: " + arithmetic.sumValuesArray(array));

        System.out.println("исходный массив: " + Arrays.toString(array));

    }
}
