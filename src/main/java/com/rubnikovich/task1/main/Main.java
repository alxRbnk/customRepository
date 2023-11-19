package com.rubnikovich.task1.main;

import com.rubnikovich.task1.creator.ArrayFromListFactory;
import com.rubnikovich.task1.entity.CustomArray;
import com.rubnikovich.task1.entity.Warehouse;
import com.rubnikovich.task1.exception.CustomException;
import com.rubnikovich.task1.reader.ReadCustomFile;
import com.rubnikovich.task1.repository.ArrayRepository;
import com.rubnikovich.task1.repository.spec.SpecificationPredicate;
import com.rubnikovich.task1.repository.spec.impl.AverageRangeSpecification;
import com.rubnikovich.task1.repository.spec.impl.MaxSpecification;
import com.rubnikovich.task1.repository.spec.predicate.IdSpecificationPredicate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Main {
    public static void main(String[] args) throws CustomException {
        Logger logger = LogManager.getLogger();
        ReadCustomFile read = new ReadCustomFile();
        List<String> list = read.readFile("src/date/arrFile.txt");
        ArrayFromListFactory arrayFromListFactory = new ArrayFromListFactory();
        List<CustomArray> customArrays = arrayFromListFactory.takeArrays(list);
        ArrayRepository arrayRepository = arrayFromListFactory.takeRepository(customArrays);

        Warehouse warehouse = arrayFromListFactory.repositoryToWarehouse(arrayRepository);
        logger.info(warehouse.getWarehouseMap());

        MaxSpecification maxSpecification = new MaxSpecification(40);
        logger.info(arrayRepository.query(maxSpecification));

        AverageRangeSpecification averageRangeSpecification = new AverageRangeSpecification(10, 30);
        logger.info(arrayRepository.queryStream(averageRangeSpecification));

        SpecificationPredicate predicate = new IdSpecificationPredicate(100001);
        logger.info(arrayRepository.queryPredicate(predicate));

        System.out.println(customArrays.hashCode());

    }
}

