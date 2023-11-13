package com.rubnikovich.task1.repository.spec;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;

public interface Specification {
    boolean specify(CustomArray customArray);
}
