package com.rubnikovich.task1.repository.spec.impl;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.repository.spec.Specification;
import com.rubnikovich.task1.service.arithmetic.ServiceArithmetic;
import com.rubnikovich.task1.service.arithmetic.impl.ServiceArithmeticImpl;

public class AverageRangeSpecification implements Specification {
    private int minValue;
    private int maxValue;

    public AverageRangeSpecification(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        ServiceArithmetic serviceArithmetic = ServiceArithmeticImpl.getInstance();
        int average = serviceArithmetic.averageValuesArray(customArray);
        return (average <= maxValue && average >= minValue);
    }
}
