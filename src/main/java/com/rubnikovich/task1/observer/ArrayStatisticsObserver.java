package com.rubnikovich.task1.observer;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;

public interface ArrayStatisticsObserver {

    void changeArrayElement(CustomArray customArray);

}
