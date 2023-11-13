package com.rubnikovich.task1.repository.spec.predicate;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.repository.spec.SpecificationPredicate;

public class IdSpecificationPredicate implements SpecificationPredicate {
    private int arrayId;

    public IdSpecificationPredicate(int arrayId) {
        this.arrayId = arrayId;
    }

    @Override
    public boolean test(CustomArray customArray) {
        return customArray.getArrayId() == arrayId;
    }
}
