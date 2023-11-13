package com.rubnikovich.task1.entity;

import com.rubnikovich.task1.validator.CustomValidator;
import com.rubnikovich.task1.validator.impl.CustomValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private static final Logger logger = LogManager.getLogger();
    private static final Warehouse instance = new Warehouse();
    private CustomValidator validator = CustomValidatorImpl.getInstance();
    private Map<Integer, ArrayStatistics> warehouseMap = new HashMap<>();

    private Warehouse() {
    }

    public static Warehouse getInstance() {
        return instance;
    }

    public void get(int id) {
        if (validator.availabilityIdOfWarehouse(id)) {
            warehouseMap.get(id);
        } else {
            logger.info("statistics with this key does not exist");
        }
    }

    public void put(Integer id, ArrayStatistics arrayStatistics) {
        if (validator.valueIdValidate(id) && !validator.availabilityIdOfWarehouse(id)) {
            warehouseMap.put(id, arrayStatistics);
        } else {
            logger.info("invalid id or already exists");
        }
    }

    public void remove(int id) {
        if (validator.availabilityIdOfWarehouse(id)) {
            warehouseMap.remove(id);
        } else {
            logger.info("statistics with this key does not exist");
        }
    }

    public ArrayStatistics replace(int id, ArrayStatistics arrayStatistics) {
        if (validator.valueIdValidate(id) && validator.availabilityIdOfWarehouse(id)) {
            return warehouseMap.replace(id, arrayStatistics);
        } else {
            logger.info("don't replacement, invalid id or there is no statistics with this key");
            return arrayStatistics;
        }
    }

    public Map<Integer, ArrayStatistics> getWarehouseMap() {
        return warehouseMap;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Warehouse{");
        sb.append("map=").append(warehouseMap);
        sb.append('}');
        return sb.toString();
    }
}
