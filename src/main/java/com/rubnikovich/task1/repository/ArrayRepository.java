package com.rubnikovich.task1.repository;

import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.repository.spec.Specification;
import com.rubnikovich.task1.repository.spec.SpecificationPredicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ArrayRepository {
    private static final ArrayRepository instance = new ArrayRepository();
    private static List<CustomArray> customArrays = new ArrayList<>();

    private ArrayRepository(){
    }

    public static ArrayRepository getInstance() {
        return instance;
    }

    public boolean add(CustomArray customArray) {
        return customArrays.add(customArray);
    }

    public boolean remove(CustomArray customArr) {
        return customArrays.remove(customArr);
    }

    public void sort(Comparator<CustomArray> comparator) {
        customArrays.sort(comparator);
    }

    public List<CustomArray> query(Specification specification) {
        List<CustomArray> resulst = new ArrayList<>();
        for(CustomArray customArr: customArrays){
            if(specification.specify(customArr)){
                resulst.add(customArr);
            }
        }
        return resulst;
    }

    public List<CustomArray> queryStream(Specification specification) {
        return customArrays.stream().filter(customArray -> specification.specify(customArray)).toList();
    }

    public List<CustomArray> queryPredicate(Predicate predicate) {
        return customArrays.stream().filter(predicate).toList();
    }

    public List<CustomArray> getRepositoryList() {
        return customArrays;
    }
}
