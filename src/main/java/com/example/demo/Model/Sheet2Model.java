package com.example.demo.Model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class Sheet2Model extends BaseRowModel implements Cloneable{
    private final String head_1 = "人民币贷款浮动利率期限、结构表（周报版）";
    private final String head_2 = "";
    private final String head_3_1 = "填报单位：";
    private final String head_3_2 = "填表时间:2019-XX-XX";
    private final String head_3_10 = "单位：亿元，%";
    private final String head_4_1 = "项    目";
    private final String head_5_1 = "项    目";


    @ExcelProperty(value = {head_1, head_2, head_3_1,}, index = 0)
    private String proTimeType;

    @ExcelProperty(index = 1)
    private String proRangeTyoe;

    @ExcelProperty(index = 2)
    private String total;

    @ExcelProperty(index = 3)
    private String lpr;

    @ExcelProperty(index = 4)
    private String stdRate;

    @ExcelProperty(index = 5)
    private String other;

    @ExcelProperty(index = 6)
    private String averange;

    @ExcelProperty(index = 7)
    private String maxRateTotal;

    @ExcelProperty(index = 8)
    private String maxRateRate;

    @ExcelProperty(index = 9)
    private String minRateTotal;

    @ExcelProperty(index = 10)
    private String minRateRate;

    public String getProTimeType() {
        return proTimeType;
    }

    public void setProTimeType(String proTimeType) {
        this.proTimeType = proTimeType;
    }

    public String getProRangeTyoe() {
        return proRangeTyoe;
    }

    public void setProRangeTyoe(String proRangeTyoe) {
        this.proRangeTyoe = proRangeTyoe;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getLpr() {
        return lpr;
    }

    public void setLpr(String lpr) {
        this.lpr = lpr;
    }

    public String getStdRate() {
        return stdRate;
    }

    public void setStdRate(String stdRate) {
        this.stdRate = stdRate;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getAverange() {
        return averange;
    }

    public void setAverange(String averange) {
        this.averange = averange;
    }

    public String getMaxRateTotal() {
        return maxRateTotal;
    }

    public void setMaxRateTotal(String maxRateTotal) {
        this.maxRateTotal = maxRateTotal;
    }

    public String getMaxRateRate() {
        return maxRateRate;
    }

    public void setMaxRateRate(String maxRateRate) {
        this.maxRateRate = maxRateRate;
    }

    public String getMinRateTotal() {
        return minRateTotal;
    }

    public void setMinRateTotal(String minRateTotal) {
        this.minRateTotal = minRateTotal;
    }

    public String getMinRateRate() {
        return minRateRate;
    }

    public void setMinRateRate(String minRateRate) {
        this.minRateRate = minRateRate;
    }

    @Override
    public String toString() {
        return "Sheet2Model{" +
                "proTimeType='" + proTimeType + '\'' +
                ", proRangeTyoe='" + proRangeTyoe + '\'' +
                ", total=" + total +
                ", lpr=" + lpr +
                ", stdRate=" + stdRate +
                ", other=" + other +
                ", averange=" + averange +
                ", maxRateTotal=" + maxRateTotal +
                ", maxRateRate=" + maxRateRate +
                ", minRateTotal=" + minRateTotal +
                ", minRateRate=" + minRateRate +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
