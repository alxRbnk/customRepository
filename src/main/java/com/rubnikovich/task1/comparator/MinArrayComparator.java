package com.rubnikovich.task1.comparator;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.service.arithmetic.ServiceArithmetic;
import com.rubnikovich.task1.service.arithmetic.impl.ServiceArithmeticImpl;

import java.util.Comparator;

public class MinArrayComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        ServiceArithmetic serviceArithmetic = ServiceArithmeticImpl.getInstance();
            return serviceArithmetic.minValueArray(o1) - serviceArithmetic.minValueArray(o2);
    }
}
