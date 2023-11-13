package com.rubnikovich.task1.parser;

import com.rubnikovich.task1.exception.CustomException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public interface CustomParser {

     int[] parseStringArrayToIntArray(String[] arrayString) throws CustomException;

}
