package com.rubnikovich.task1.entity;

import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.observer.ArrayStatisticsObserver;
import com.rubnikovich.task1.observer.impl.ArrayStatisticsObserverImpl;
import com.rubnikovich.task1.util.IdGenerator;
import com.rubnikovich.task1.validator.CustomValidator;
import com.rubnikovich.task1.validator.impl.CustomValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomArray {
    private static Logger logger = LogManager.getLogger();
    private int arrayId;
    private int[] array;
    private ArrayStatisticsObserver observer;
    private CustomValidator validator = CustomValidatorImpl.getInstance();

    public CustomArray(int[] arr) {
        this.array = arr;
        this.arrayId = IdGenerator.generate();
        observer = new ArrayStatisticsObserverImpl();
    }

    public void removeObserver() {
        observer = null;
    }

    public void addObserver() {
        observer = new ArrayStatisticsObserverImpl();
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        if (validator.arrayIntValidate(array)) {
            this.array = array;
            notifyObserver();
        } else {
            logger.info("invalid value of array");
        }
    }

    public int getArrayId() {
        return arrayId;
    }

    public void setArrayId(int id) {
        if (validator.valueIdValidate(id)) {
            this.arrayId = id;
        } else {
            logger.info("invalid id value, please enter number from 100000 to 999999");
        }
    }

    private void notifyObserver() {
        if (observer != null) {
            observer.changeArrayElement(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArray that = (CustomArray) o;

        if (arrayId != that.arrayId) return false;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = arrayId;
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(Arrays.toString(array));
        sb.append(" Id - ").append(arrayId);
        return sb.toString();
    }
}
