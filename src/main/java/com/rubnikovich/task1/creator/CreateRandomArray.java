package com.rubnikovich.task1.creator;

import java.util.Random;

public class CreateRandomArray {
    private static final int MIN_VALUE = -100;
    private static final int MAX_VALUE = 100;

    private CreateRandomArray(){
    }

    public static int[] create(int length){
        Random random = new Random();
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = random.nextInt(MIN_VALUE, MAX_VALUE);
        }
        return arr;
    }

}
