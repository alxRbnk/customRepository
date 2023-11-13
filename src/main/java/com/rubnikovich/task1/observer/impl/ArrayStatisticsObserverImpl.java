package com.rubnikovich.task1.observer.impl;

import com.rubnikovich.task1.entity.ArrayStatistics;
import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.entity.Warehouse;
import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.observer.ArrayStatisticsObserver;
import com.rubnikovich.task1.service.arithmetic.ServiceArithmetic;
import com.rubnikovich.task1.service.arithmetic.impl.ServiceArithmeticImpl;

public class ArrayStatisticsObserverImpl implements ArrayStatisticsObserver {

    @Override
    public void changeArrayElement(CustomArray customArray) {
        ServiceArithmetic service = ServiceArithmeticImpl.getInstance();
        ArrayStatistics statistics = service.createAllStatistics(customArray);
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.put(customArray.getArrayId(), statistics);
    }

}
