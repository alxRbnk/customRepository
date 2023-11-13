package com.rubnikovich.task1.repository.spec.predicate;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.repository.spec.SpecificationPredicate;
import com.rubnikovich.task1.service.arithmetic.ServiceArithmetic;
import com.rubnikovich.task1.service.arithmetic.impl.ServiceArithmeticImpl;

public class MinSpecificationPredicate implements SpecificationPredicate {
    private int min;

    public MinSpecificationPredicate(int max) {
        this.min = max;
    }

    @Override
    public boolean test(CustomArray customArray) {
        ServiceArithmetic service = ServiceArithmeticImpl.getInstance();
        return service.minValueArray(customArray) < min;
    }
}
