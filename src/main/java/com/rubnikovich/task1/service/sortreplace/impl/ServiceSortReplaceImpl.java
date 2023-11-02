package com.rubnikovich.task1.service.sortreplace.impl;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;
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

    private void logService(CustomArray customArray) throws CustomException {
        if (customArray == null) {
            logger.error("Array is null");
            throw new CustomException("Array is null");
        }
    }

    public CustomArray replaceValueArray(CustomArray customArray, int value, int index) throws CustomException {
        if (customArray == null) {
            logger.error("Array is null");
            throw new CustomException("Array is null");
        } else if (index >= customArray.getArr().length) {
            logger.error("index bigger than array length");
            throw new CustomException("index bigger than array length");
        } else {
            customArray.getArr()[index] = value;
            return customArray;
        }
    }

    public CustomArray firstSortArray(CustomArray customArray) throws CustomException {
        logService(customArray);

        for (int i = 0; i < customArray.getArr().length; i++) {
            for (int j = 0; j < customArray.getArr().length; j++) {
                if (customArray.getArr()[i] < customArray.getArr()[j]) {
                    int temp = customArray.getArr()[i];
                    customArray.getArr()[i] = customArray.getArr()[j];
                    customArray.getArr()[j] = temp;
                }
            }
        }
        return customArray;
    }

    public CustomArray wildSortArray(CustomArray customArray) throws CustomException {
        logService(customArray);
        int[] cloneArray = customArray.getArr().clone();
        int index = 0;
        for (int i = 0; i < cloneArray.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < cloneArray.length; j++) {
                if (cloneArray[j] < min) {
                    min = cloneArray[j];
                    index = j;
                }
            }
            customArray.getArr()[i] = min;
            cloneArray[index] = Integer.MAX_VALUE;
        }
        return customArray;
    }

    public CustomArray anotherSortArray(CustomArray customArray) throws CustomException {
        logService(customArray);
        for (int i = 0; i < customArray.getArr().length; i++) {
            int temp = i;
            for (int j = i; j < customArray.getArr().length; j++) {
                if (customArray.getArr()[j] < customArray.getArr()[temp]) {
                    temp = j;
                }
            }
            int tmp = customArray.getArr()[i];
            customArray.getArr()[i] = customArray.getArr()[temp];
            customArray.getArr()[temp] = tmp;
        }
        return customArray;
    }

}
