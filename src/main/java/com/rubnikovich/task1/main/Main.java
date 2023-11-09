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

        logger.info("repository - " + arrayRepository.getCustomArrays());

        CustomArray removeCustomArray = arrayRepository.getCustomArrays().get(0);
        arrayRepository.remove(removeCustomArray);

        CustomArray addCustomArray = new CustomArray(new int[]{5, 6});
        arrayRepository.add(addCustomArray);

        logger.info("repository - " + arrayRepository.getCustomArrays());

    }
}
