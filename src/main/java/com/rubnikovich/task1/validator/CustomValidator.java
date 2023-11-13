package com.rubnikovich.task1.validator;

public interface CustomValidator {

    boolean numberIntoStringValidate(String line);

    boolean correctNumberValidate(String line);

    boolean valueIdValidate(int id);

    boolean arrayIntValidate(int[] array);

    boolean availabilityIdOfWarehouse(int id);

}
