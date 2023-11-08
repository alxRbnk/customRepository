package com.rubnikovich.task1.creator;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.parser.CustomParser;
import com.rubnikovich.task1.repository.ArrayRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayFromListFactory {
    static Logger logger = LogManager.getLogger();
    private static final String CORRECT_NUMBER_REGEX = "(\\s*-?\\d+\\s*)+";
    private static final String NUMBER_INTO_STRING_REGEX = ".*\\d+.*";
    private static final String SPACE_DELIMITER_REGEX = "\\s+";
    private static final String EXTRACT_NUMBER_REGEX = "-?[0-9]+";

    public ArrayRepository takeRepository(List<CustomArray> list){
        ArrayRepository arrayRepository = new ArrayRepository();
        for (CustomArray s : list) {
            arrayRepository.add(s);
        }
        return arrayRepository;
    }

    public List<CustomArray> takeArrays(List<String> list) throws CustomException {
        List<CustomArray> customArrays = new ArrayList<>();
        if (list == null || list.isEmpty()) {
            logger.info("invalid list");
        }
        List<String> customList = takeList(list);
        for(String line: customList){
            String arrayStringFix = fixline(line);
            String arrayWithoutSpace = arrayStringFix.strip();
            String[] arrayTemp = arrayWithoutSpace.split(SPACE_DELIMITER_REGEX);
            int[] arrayNumbers = CustomParser.parseStringArrayToIntArray(arrayTemp);
            customArrays.add(new CustomArray(arrayNumbers));
        }
        return customArrays;
    }

    public CustomArray takeArray(List<String> list) throws CustomException {
        List<String> correctList = null;
        if (list != null && !list.isEmpty()) {
            correctList = takeCorrectList(list);
        } else {
            logger.info("invalid list");
        }
        String arrayString = correctList.get(0);
        String arrayWithoutSpace = arrayString.strip();
        String[] arrayTemp = arrayWithoutSpace.split(SPACE_DELIMITER_REGEX);
        int[] arrayNumbers = CustomParser.parseStringArrayToIntArray(arrayTemp);
        return new CustomArray(arrayNumbers);
    }

    public CustomArray takeFixedArray(List<String> list) throws CustomException {
        List<String> uncorrectList = null;
        if (list != null && !list.isEmpty()) {
            uncorrectList = takeUncorrectList(list);
        } else {
            logger.info("invalid list");
        }
        String arrayString = uncorrectList.get(randomIndex(uncorrectList));
        String arrayStringFix = fixline(arrayString);
        String arrayWithoutSpace = arrayStringFix.strip();
        String[] arrayTemp = arrayWithoutSpace.split(SPACE_DELIMITER_REGEX);
        int[] arrayNumbers = CustomParser.parseStringArrayToIntArray(arrayTemp);
        return new CustomArray(arrayNumbers);
    }

    private List<String> takeCorrectList(List<String> list) {
        List<String> correctList = new ArrayList<>();
        for (String line : list) {
            if (line.matches(CORRECT_NUMBER_REGEX)) {
                correctList.add(line);
            }
        }
        return correctList;
    }

    private List<String> takeUncorrectList(List<String> list) {
        List<String> uncorrectList = new ArrayList<>();
        for (String line : list) {
            if (!line.matches(CORRECT_NUMBER_REGEX) && line.matches(NUMBER_INTO_STRING_REGEX)) {
                uncorrectList.add(line);
            }
        }
        return uncorrectList;
    }

    private int randomIndex(List<String> list) {
        Random random = new Random();
        return random.nextInt(0, list.size());
    }

    private String fixline(String arrayString) {
        Pattern pattern = Pattern.compile(EXTRACT_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(arrayString);
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()) {
            stringBuilder.append(matcher.group() + " ");
        }
        return stringBuilder.toString();
    }

    private List<String> takeList(List<String> list) {
        List<String> customList = new ArrayList<>();
        for (String line : list) {
            if (line.matches(NUMBER_INTO_STRING_REGEX)) {
                customList.add(line);
            }
        }
        return customList;
    }

}
