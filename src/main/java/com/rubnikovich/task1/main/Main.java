package com.rubnikovich.task1.main;

import com.rubnikovich.task1.creator.TakeArrayFromFile;
import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.reader.ReadFile;
import com.rubnikovich.task1.service.sortreplace.ServiceSortReplace;
import com.rubnikovich.task1.service.sortreplace.impl.ServiceSortReplaceImpl;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        ReadFile read = new ReadFile();
        List<String> list = read.readFile("src/main/resources/arrFile.txt");
        TakeArrayFromFile arrayFromFile = new TakeArrayFromFile();
        CustomArray customArray = arrayFromFile.takeArray(list);
        System.out.println(Arrays.toString(customArray.getArr()));

        ServiceSortReplaceImpl sortArray = new ServiceSortReplaceImpl();
        System.out.println(Arrays.toString(sortArray.replaceValueArray(customArray.getArr(),0,0)));

        System.out.println(Arrays.toString(customArray.getArr()));

        ServiceSortReplace serviceSortReplace = new ServiceSortReplaceImpl();
        System.out.println("интерфейс");
        System.out.println(Arrays.toString(serviceSortReplace.anotherSortArray(customArray.getArr())));
        System.out.println(Arrays.toString(customArray.getArr()));

    }
}
