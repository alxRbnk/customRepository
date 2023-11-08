package com.rubnikovich.task1.comparator;

import com.rubnikovich.task1.entity.CustomArray;

import java.util.Comparator;

public class IdArrayComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        return o1.getArrayId() - o2.getArrayId();
    }
}
