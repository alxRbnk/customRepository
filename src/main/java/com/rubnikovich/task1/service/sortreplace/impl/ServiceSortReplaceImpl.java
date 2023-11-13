package com.rubnikovich.task1.service.sortreplace.impl;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.observer.ArrayStatisticsObserver;
import com.rubnikovich.task1.observer.impl.ArrayStatisticsObserverImpl;
import com.rubnikovich.task1.service.sortreplace.ServiceSortReplace;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceSortReplaceImpl implements ServiceSortReplace {

    public static Logger logger = LogManager.getLogger();
    private static ServiceSortReplaceImpl INSTANCE;

    private ServiceSortReplaceImpl() {
    }

    public static ServiceSortReplaceImpl getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ServiceSortReplaceImpl();
        }
        return INSTANCE;
    }

    private void logService(CustomArray customArray) {
        if (customArray == null) {
            logger.error("Array is null");
        }
    }

    public CustomArray replaceValueArray(CustomArray customArray, int value, int index) {
        if (customArray == null) {
            logger.error("Array is null");
            return customArray;
        } else if (index >= customArray.getArray().length) {
            logger.error("index bigger than array length");
            return customArray;
        } else {
            customArray.getArray()[index] = value;
            ArrayStatisticsObserver observer = new ArrayStatisticsObserverImpl();
            observer.changeArrayElement(customArray);
            return customArray;
        }
    }

    public CustomArray firstSortArray(CustomArray customArray) {
        logService(customArray);

        for (int i = 0; i < customArray.getArray().length; i++) {
            for (int j = 0; j < customArray.getArray().length; j++) {
                if (customArray.getArray()[i] < customArray.getArray()[j]) {
                    int temp = customArray.getArray()[i];
                    customArray.getArray()[i] = customArray.getArray()[j];
                    customArray.getArray()[j] = temp;
                }
            }
        }
        return customArray;
    }

    public CustomArray wildSortArray(CustomArray customArray) {
        logService(customArray);
        int[] cloneArray = customArray.getArray().clone();
        int index = 0;
        for (int i = 0; i < cloneArray.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < cloneArray.length; j++) {
                if (cloneArray[j] < min) {
                    min = cloneArray[j];
                    index = j;
                }
            }
            customArray.getArray()[i] = min;
            cloneArray[index] = Integer.MAX_VALUE;
        }
        return customArray;
    }

    public CustomArray anotherSortArray(CustomArray customArray) {
        logService(customArray);
        for (int i = 0; i < customArray.getArray().length; i++) {
            int temp = i;
            for (int j = i; j < customArray.getArray().length; j++) {
                if (customArray.getArray()[j] < customArray.getArray()[temp]) {
                    temp = j;
                }
            }
            int tmp = customArray.getArray()[i];
            customArray.getArray()[i] = customArray.getArray()[temp];
            customArray.getArray()[temp] = tmp;
        }
        return customArray;
    }
}
