package com.rubnikovich.task1.parser.imp;

import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.parser.CustomParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomParserImpl implements CustomParser {
    private static Logger logger = LogManager.getLogger();
    private static final CustomParserImpl instance = new CustomParserImpl();

    private CustomParserImpl() {
    }

    public static CustomParserImpl getInstance(){
        return instance;
    }

    public int[] parseStringArrayToIntArray(String[] arrayString) throws CustomException {
        try {
            return Arrays.stream(arrayString)
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (Exception exception) {
            throw new CustomException("Array is null", exception);
        }
    }

}
