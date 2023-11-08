package com.rubnikovich.task1.comparator;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.service.arithmetic.ServiceArithmetic;
import com.rubnikovich.task1.service.arithmetic.impl.ServiceArithmeticImpl;

import java.util.Comparator;

public class AverageArrayComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2){
        ServiceArithmetic serviceArithmetic = ServiceArithmeticImpl.getInstance();
        try {
            return serviceArithmetic.averageValuesArray(o1) - serviceArithmetic.averageValuesArray(o2);
        } catch (CustomException exception) {
            throw new RuntimeException();
        }
    }
}
