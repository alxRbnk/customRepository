package com.rubnikovich.task1.validator.impl;

import com.rubnikovich.task1.entity.ArrayStatistics;
import com.rubnikovich.task1.entity.Warehouse;
import com.rubnikovich.task1.validator.CustomValidator;

import java.util.Map;

public class CustomValidatorImpl implements CustomValidator {

    private static final String CORRECT_NUMBER_REGEX = "(\\s*-?\\d+\\s*)+";
    private static final String NUMBER_INTO_STRING_REGEX = ".*\\d+.*";
    private static final int MAX_VALUE_ID = 999999;
    private static final int MIN_VALUE_ID = 100000;
    private static final CustomValidatorImpl instance = new CustomValidatorImpl();

    private CustomValidatorImpl() {
    }

    public static CustomValidatorImpl getInstance() {
        return instance;
    }

    @Override
    public boolean numberIntoStringValidate(String line) {
        return line.matches(NUMBER_INTO_STRING_REGEX);
    }

    @Override
    public boolean correctNumberValidate(String line) {
        return line.matches(CORRECT_NUMBER_REGEX);
    }

    @Override
    public boolean valueIdValidate(int id) {
        return (id <= MAX_VALUE_ID && id >= MIN_VALUE_ID);
    }

    @Override
    public boolean arrayIntValidate(int[] array) {
        return (array.length != 0 && array != null);
    }

    @Override
    public boolean availabilityIdOfWarehouse(int id) {
        Warehouse warehouse = Warehouse.getInstance();
        Map<Integer, ArrayStatistics> map = warehouse.getWarehouseMap();
        return map.containsKey(id);
    }

}
