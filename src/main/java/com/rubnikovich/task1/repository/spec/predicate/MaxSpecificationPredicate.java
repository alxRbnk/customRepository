package com.rubnikovich.task1.repository.spec.predicate;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.repository.spec.SpecificationPredicate;
import com.rubnikovich.task1.service.arithmetic.ServiceArithmetic;
import com.rubnikovich.task1.service.arithmetic.impl.ServiceArithmeticImpl;

public class MaxSpecificationPredicate implements SpecificationPredicate {
    private int max;

    public MaxSpecificationPredicate(int max) {
        this.max = max;
    }

    @Override
    public boolean test(CustomArray customArray) {
        ServiceArithmetic service = ServiceArithmeticImpl.getInstance();
        return service.maxValueArray(customArray) > max;
    }
}
