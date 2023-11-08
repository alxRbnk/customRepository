package com.rubnikovich.task1.repository.spec;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.service.arithmetic.ServiceArithmetic;
import com.rubnikovich.task1.service.arithmetic.impl.ServiceArithmeticImpl;

public class SumBiggerService implements Specification{
    private int sumValuesArray;

    public SumBiggerService(int sumValuesArray) {
        this.sumValuesArray = sumValuesArray;
    }

    @Override
    public boolean specify(CustomArray customArray) throws CustomException {
        ServiceArithmetic serviceArithmetic = ServiceArithmeticImpl.getInstance();
        return (serviceArithmetic.sumValuesArray(customArray) >= sumValuesArray);
    }
}
