package com.rubnikovich.task1.repository.spec;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.service.arithmetic.ServiceArithmetic;
import com.rubnikovich.task1.service.arithmetic.impl.ServiceArithmeticImpl;

public class AverageRangeSpecification implements Specification{
    private int minValue;
    private int maxValue;

    public AverageRangeSpecification(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    @Override
    public boolean specify(CustomArray customArray) throws CustomException {
        ServiceArithmetic serviceArithmetic = ServiceArithmeticImpl.getInstance();
        int averange = serviceArithmetic.averageValuesArray(customArray);
        return (averange <= maxValue && averange >= minValue);
    }
}
