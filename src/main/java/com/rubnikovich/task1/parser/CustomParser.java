package com.rubnikovich.task1.parser;

import com.rubnikovich.task1.exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomParser {
    static Logger logger = LogManager.getLogger();

    private CustomParser() {
    }

    public static int[] parseStringArrayToIntArray(String[] arrayString) throws CustomException {
        try {
            return Arrays.stream(arrayString)
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (Exception exception) {
            throw new CustomException("Array is null", exception);
        }
    }

}
