package com.rubnikovich.task1.repository.spec;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.service.arithmetic.ServiceArithmetic;
import com.rubnikovich.task1.service.arithmetic.impl.ServiceArithmeticImpl;

public class MaxSpecification implements Specification{
    private int max;

    public MaxSpecification(int max) {
        this.max = max;
    }

    @Override
    public boolean specify(CustomArray customArray) throws CustomException {
        ServiceArithmetic serviceArithmetic = ServiceArithmeticImpl.getInstance();
        return serviceArithmetic.maxValueArray(customArray) > max;
    }
}
