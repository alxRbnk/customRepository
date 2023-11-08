package com.rubnikovich.task1.comparator;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.service.arithmetic.ServiceArithmetic;
import com.rubnikovich.task1.service.arithmetic.impl.ServiceArithmeticImpl;

import java.util.Comparator;

public class CountPositiveComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        ServiceArithmetic serviceArithmetic = ServiceArithmeticImpl.getInstance();
        try {
            return serviceArithmetic.countPositiveNumber(o1) - serviceArithmetic.countPositiveNumber(o2);
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }
    }
}
