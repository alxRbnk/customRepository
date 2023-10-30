package com.rubnikovich.task1.creator;

import com.rubnikovich.task1.entity.CustomArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TakeArrayFromFile {

    private static final String NUMBER = "(-?\\d+\\s?)+";
    private static final String SPACE = "\\s+";

    public CustomArray takeArray(List<String> list){
        List<String> listString = new ArrayList<>();
        for (String line: list) {
            if(line.matches(NUMBER)){
                listString.add(line);
            }
        }
        Random random = new Random();
        int randomArray = random.nextInt(0,listString.size());
        String arrayString = listString.get(randomArray);
        String[] arrayTemp = arrayString.split(SPACE);
        int[] arrayInt = new int[arrayTemp.length];
        for (int i = 0; i < arrayTemp.length; i++) {
            arrayInt[i] = Integer.parseInt(arrayTemp[i]);
        }
        CustomArray customArray = new CustomArray(arrayInt);
        return customArray;
    }
}
