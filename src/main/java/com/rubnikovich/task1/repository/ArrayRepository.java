package com.rubnikovich.task1.repository;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.repository.spec.Specification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayRepository {
    private static ArrayRepository INSTANCE;
    private List<CustomArray> customArrays;

    private ArrayRepository(List<CustomArray> customArrays){
        this.customArrays = customArrays;
    }

    public static ArrayRepository getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ArrayRepository(new ArrayList<>());
        }
        return INSTANCE;
    }

    public boolean add(CustomArray customArray) {
        return customArrays.add(customArray);
    }

    public boolean remove(CustomArray customArr) {
        return customArrays.remove(customArr);
    }

    public void sort(Comparator<CustomArray> c) {
        customArrays.sort(c);
    }

    public List<CustomArray> query(Specification specification) throws CustomException {
        List<CustomArray> resulst = new ArrayList<>();
        for(CustomArray customArr: customArrays){
            if(specification.specify(customArr)){
                resulst.add(customArr);
            }
        }
        return resulst;
    }

    public List<CustomArray> getCustomArrays() {
        return customArrays;
    }
}
