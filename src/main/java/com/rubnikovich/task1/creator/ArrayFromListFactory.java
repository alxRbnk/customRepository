package com.rubnikovich.task1.creator;

import com.rubnikovich.task1.entity.CustomArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayFromListFactory {

    private static final String CORRECT_NUMBER = "(\\s*-?\\d+\\s*)+";
    private static final String NUMBER_INTO_STRING = ".*\\d+.*";
    private static final String SPACE_DELIMITER = "\\s+";
    private static final String EXTRACT_NUMBER = "-?[0-9]+";

    public CustomArray takeArray(List<String> list) {
        List<String> correctList;
        if (list != null && !list.isEmpty()) {
            correctList = takeCorrectList(list);
        } else {
            correctList = RandomArrayFactory.create();
        }
        String arrayString = correctList.get(randomIndex(correctList));
        String arrayWithoutSpace = arrayString.strip();
        String[] arrayTemp = arrayWithoutSpace.split(SPACE_DELIMITER);
        int[] arrayNumbers = new int[arrayTemp.length];
        for (int i = 0; i < arrayTemp.length; i++) {
            arrayNumbers[i] = Integer.parseInt(arrayTemp[i]);
        }
        return new CustomArray(arrayNumbers, IdGenerator.generate());
    }

    public CustomArray takeFixedArray(List<String> list) {
        List<String> uncorrectList;
        if (list != null && !list.isEmpty()) {
            uncorrectList = takeUncorrectList(list);
        } else {
            uncorrectList = RandomArrayFactory.create();
        }
        String arrayString = uncorrectList.get(randomIndex(uncorrectList));
        String arrayStringFix = fixListString(arrayString);
        String arrayWithoutSpace = arrayStringFix.strip();
        String[] arrayTemp = arrayWithoutSpace.split(SPACE_DELIMITER);
        int[] arrayNumbers = new int[arrayTemp.length];
        for (int i = 0; i < arrayTemp.length; i++) {
            arrayNumbers[i] = Integer.parseInt(arrayTemp[i]);
        }
        return new CustomArray(arrayNumbers, IdGenerator.generate());
    }

    private List<String> takeCorrectList(List<String> list) {
        List<String> correctList = new ArrayList<>();
        for (String line : list) {
            if (line.matches(CORRECT_NUMBER)) {
                correctList.add(line);
            }
        }
        return correctList;
    }

    private List<String> takeUncorrectList(List<String> list) {
        List<String> uncorrectList = new ArrayList<>();
        for (String line : list) {
            if (!line.matches(CORRECT_NUMBER) && line.matches(NUMBER_INTO_STRING)) {
                uncorrectList.add(line);
            }
        }
        return uncorrectList;
    }

    private int randomIndex(List<String> list) {
        Random random = new Random();
        return random.nextInt(0, list.size());
    }

    private String fixListString(String arrayString) {
        Pattern pattern = Pattern.compile(EXTRACT_NUMBER);
        Matcher matcher = pattern.matcher(arrayString);
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()) {
            stringBuilder.append(matcher.group() + " ");
        }
        return stringBuilder.toString();
    }

}
