package com.rubnikovich.task1.util;

public class IdGenerator {

    private static int id = 100000;

    private IdGenerator() {
    }

    public static int generate() {
        return ++id;
    }

}
