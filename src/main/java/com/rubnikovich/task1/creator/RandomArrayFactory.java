package com.rubnikovich.task1.creator;

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

    public static List<String> create() {
        Random random = new Random();
        List<String> array = new ArrayList<>();
        int length = random.nextInt(MIN_INDEX, MAX_INDEX);
        for (int i = 0; i < length; i++) {
            array.add(String.valueOf(random.nextInt(MIN_VALUE, MAX_VALUE)));
        }
        return array;
    }

}
