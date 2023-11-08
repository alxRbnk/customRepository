package com.rubnikovich.task1.repository.spec;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.service.arithmetic.ServiceArithmetic;
import com.rubnikovich.task1.service.arithmetic.impl.ServiceArithmeticImpl;

public class MinSpecification implements Specification{
    private int min;

    public MinSpecification(int min) {
        this.min = min;
    }

    @Override
    public boolean specify(CustomArray customArray) throws CustomException {
        ServiceArithmetic serviceArithmetic = ServiceArithmeticImpl.getInstance();
        return serviceArithmetic.minValueArray(customArray) < min;
    }
}
