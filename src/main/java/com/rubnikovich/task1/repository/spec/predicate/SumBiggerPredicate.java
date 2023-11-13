package com.rubnikovich.task1.repository.spec.predicate;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.repository.spec.SpecificationPredicate;
import com.rubnikovich.task1.service.arithmetic.ServiceArithmetic;
import com.rubnikovich.task1.service.arithmetic.impl.ServiceArithmeticImpl;

public class SumBiggerPredicate implements SpecificationPredicate {
    ServiceArithmetic service = ServiceArithmeticImpl.getInstance();
    private int number;

    public SumBiggerPredicate(int number) {
        this.number = number;
    }

    @Override
    public boolean test(CustomArray customArray) {
        return service.sumValuesArray(customArray) > number;
    }
}
