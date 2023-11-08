package com.rubnikovich.task1.main;

import com.rubnikovich.task1.comparator.*;
import com.rubnikovich.task1.creator.ArrayFromListFactory;
import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.reader.ReadCustomFile;
import com.rubnikovich.task1.repository.ArrayRepository;
import com.rubnikovich.task1.repository.spec.*;
import com.rubnikovich.task1.service.arithmetic.ServiceArithmetic;
import com.rubnikovich.task1.service.arithmetic.impl.ServiceArithmeticImpl;
import com.rubnikovich.task1.service.sortreplace.ServiceSortReplace;
import com.rubnikovich.task1.service.sortreplace.impl.ServiceSortReplaceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Main {
    public static void main(String[] args) throws CustomException {
        Logger logger = LogManager.getLogger();
        ReadCustomFile read = new ReadCustomFile();
        List<String> list = read.readFile("arrFile.txt");
        ArrayFromListFactory arrayFromListFactory = new ArrayFromListFactory();

//        CustomArray customArray = arrayFromListFactory.takeArray(list);
//        CustomArray customArrayFix = arrayFromListFactory.takeFixedArray(list);
//        ServiceSortReplace sort = ServiceSortReplaceImpl.getInstance();
//        ServiceArithmetic arithmetic = ServiceArithmeticImpl.getInstance();
//
//        logger.info("array: " + customArray);
//        logger.info("fixed array: " + customArrayFix);
//
//        logger.info("average: " + arithmetic.averageValuesArray(customArray));
//        logger.info("count negative value: " + arithmetic.countNegativeNumber(customArray));
//        logger.info("count positive value: " + arithmetic.countPositiveNumber(customArray));
//        logger.info("min value: " + arithmetic.minValueArray(customArray));
//        logger.info("max value: " + arithmetic.maxValueArray(customArray));
//        logger.info("sum value: " + arithmetic.sumValuesArray(customArray));
//        logger.info("sort three: " + sort.anotherSortArray(customArray));
//        logger.info("replace: " + sort.replaceValueArray(customArray,0,0));

        List<CustomArray> customArrays = arrayFromListFactory.takeArrays(list);

        ArrayRepository arrayRepository = arrayFromListFactory.takeRepository(customArrays);

        logger.info(arrayRepository.getCustomArrays() + " - repository");

        Specification idSpecification = new IdSpecification(100001);
        logger.info(arrayRepository.query(idSpecification));

        Specification maxSpecification = new MaxSpecification(50);
        logger.info(arrayRepository.query(maxSpecification));

        Specification minSpecification = new MinSpecification(-40);
        logger.info(arrayRepository.query(minSpecification));

        Specification averageRangeSpecification = new AverageRangeSpecification(0, 10);
        logger.info(arrayRepository.query(averageRangeSpecification));

        Specification sumBiggerService = new SumBiggerService(100);
        logger.info(arrayRepository.query(sumBiggerService));

//        arrayRepository.sort(new IdArrayComparator());
//        arrayRepository.sort(new AverageArrayComparator());
//        arrayRepository.sort(new MinArrayComparator());
//        arrayRepository.sort(new CountPositiveComparator());
        arrayRepository.sort(new LenghtArrayComparator());

        logger.info(arrayRepository.getCustomArrays() + " - repository");



    }
}
