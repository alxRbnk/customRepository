package com.rubnikovich.task1.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayStatistics {

    private static Logger logger = LogManager.getLogger();
    private int sumVal;
    private int averageVal;
    private int countPositive;
    private int countNegative;
    private int maxVal;
    private int minVal;

    public int getSumVal() {
        return sumVal;
    }

    public void setSumVal(int sumVal) {
        this.sumVal = sumVal;
    }

    public int getAverageVal() {
        return averageVal;
    }

    public void setAverageVal(int averageVal) {
        this.averageVal = averageVal;
    }

    public int getCountPositive() {
        return countPositive;
    }

    public void setCountPositive(int countPositive) {
        this.countPositive = countPositive;
    }

    public int getCountNegative() {
        return countNegative;
    }

    public void setCountNegative(int countNegative) {
        this.countNegative = countNegative;
    }

    public int getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(int maxVal) {
        this.maxVal = maxVal;
    }

    public int getMinVal() {
        return minVal;
    }

    public void setMinVal(int minVal) {
        this.minVal = minVal;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Values {");
        sb.append("sum = ").append(sumVal);
        sb.append(", average = ").append(averageVal);
        sb.append(", countPos = ").append(countPositive);
        sb.append(", countNeg = ").append(countNegative);
        sb.append(", max = ").append(maxVal);
        sb.append(", min = ").append(minVal);
        sb.append('}');
        return sb.toString();
    }
}
