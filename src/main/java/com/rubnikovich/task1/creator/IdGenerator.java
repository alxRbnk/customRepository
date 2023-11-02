package com.rubnikovich.task1.creator;

public class IdGenerator {

    private static int id = 10000000;

    private IdGenerator() {
    }

    public static int generate() {
        id++;
        return id;
    }

}
