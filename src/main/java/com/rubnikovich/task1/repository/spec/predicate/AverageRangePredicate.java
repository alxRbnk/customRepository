package com.rubnikovich.task1.repository.spec.predicate;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.repository.spec.SpecificationPredicate;
import com.rubnikovich.task1.service.arithmetic.ServiceArithmetic;
import com.rubnikovich.task1.service.arithmetic.impl.ServiceArithmeticImpl;

public class AverageRangePredicate implements SpecificationPredicate {
    private int minValue;
    private int maxValue;

    public AverageRangePredicate(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    @Override
    public boolean test(CustomArray customArray) {
        ServiceArithmetic serviceArithmetic = ServiceArithmeticImpl.getInstance();
        int average = serviceArithmetic.averageValuesArray(customArray);
        return (average <= maxValue && average >= minValue);
    }
}
