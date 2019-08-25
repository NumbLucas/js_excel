package com.example.demo.Model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class ExcelInfo extends BaseRowModel {
    @ExcelProperty(index = 0)
    private String key;
    @ExcelProperty(index = 1)
    private double value;

    @Override
    public String toString() {
        return "ExcelInfo{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }


}
