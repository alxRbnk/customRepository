package com.rubnikovich.task1.creator;

import java.util.Random;

public class CreatorArray {

    private CreatorArray(){
    }

    public static int[] create(int length){
        Random random = new Random();
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = random.nextInt(-100,100);
        }
        return arr;
    }

}
