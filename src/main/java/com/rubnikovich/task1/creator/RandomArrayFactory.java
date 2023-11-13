package com.rubnikovich.task1.creator;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.util.IdGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomArrayFactory {
    private static final int MIN_VALUE = -100;
    private static final int MAX_VALUE = 100;
    private static final int MIN_INDEX = 3;
    private static final int MAX_INDEX = 9;

    private RandomArrayFactory() {
    }

    public static CustomArray create() {
        Random random = new Random();
        List<Integer> array = new ArrayList<>();
        int length = random.nextInt(MIN_INDEX, MAX_INDEX);
        for (int i = 0; i < length; i++) {
            array.add(random.nextInt(MIN_VALUE, MAX_VALUE));
        }
        int[] arrayInt = array.stream()
                .mapToInt(s -> s)
                .toArray();
        CustomArray customArray = new CustomArray(arrayInt);
        return customArray;
    }

}
