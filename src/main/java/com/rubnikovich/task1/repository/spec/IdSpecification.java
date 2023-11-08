package com.rubnikovich.task1.repository.spec;

import com.rubnikovich.task1.entity.CustomArray;

public class IdSpecification implements Specification {
    private int arrayId;

    public IdSpecification(int arrayId) {
        this.arrayId = arrayId;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        return (customArray.getArrayId() == arrayId);
    }
}
