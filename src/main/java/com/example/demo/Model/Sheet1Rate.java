package com.example.demo.Model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class Sheet1Rate extends BaseRowModel {
    @ExcelProperty(index = 0)
    private String ProName;

    @ExcelProperty(index = 0)
    private String ProRange;

    @ExcelProperty(index = 0)
    private double LargeCompanyTotal;

    @ExcelProperty(index = 0)
    private double LargeCompanyTotalRate;

    @ExcelProperty(index = 0)
    private double MidCompanyTotal;

    @ExcelProperty(index = 0)
    private double MidCompanyTotalRate;

    @ExcelProperty(index = 0)
    private double SmallCompanyTotal;

    @ExcelProperty(index = 0)
    private double SmallCompanyTotalRate;

    @ExcelProperty(index = 0)
    private double MacroCompanyTotal;

    @ExcelProperty(index = 0)
    private double MacroCompanyTotalRate;

    @ExcelProperty(index = 0)
    private double CompanyTotal;

    @ExcelProperty(index = 0)
    private double CompanyTotalRate;


    public String getProName() {
        return ProName;
    }

    public void setProName(String proName) {
        ProName = proName;
    }

    public String getProRange() {
        return ProRange;
    }

    public void setProRange(String proRange) {
        ProRange = proRange;
    }

    public double getLargeCompanyTotal() {
        return LargeCompanyTotal;
    }

    public void setLargeCompanyTotal(double largeCompanyTotal) {
        LargeCompanyTotal = largeCompanyTotal;
    }

    public double getLargeCompanyTotalRate() {
        return LargeCompanyTotalRate;
    }

    public void setLargeCompanyTotalRate(double largeCompanyTotalRate) {
        LargeCompanyTotalRate = largeCompanyTotalRate;
    }

    public double getMidCompanyTotal() {
        return MidCompanyTotal;
    }

    public void setMidCompanyTotal(double midCompanyTotal) {
        MidCompanyTotal = midCompanyTotal;
    }

    public double getMidCompanyTotalRate() {
        return MidCompanyTotalRate;
    }

    public void setMidCompanyTotalRate(double midCompanyTotalRate) {
        MidCompanyTotalRate = midCompanyTotalRate;
    }

    public double getSmallCompanyTotal() {
        return SmallCompanyTotal;
    }

    public void setSmallCompanyTotal(double smallCompanyTotal) {
        SmallCompanyTotal = smallCompanyTotal;
    }

    public double getSmallCompanyTotalRate() {
        return SmallCompanyTotalRate;
    }

    public void setSmallCompanyTotalRate(double smallCompanyTotalRate) {
        SmallCompanyTotalRate = smallCompanyTotalRate;
    }

    public double getMacroCompanyTotal() {
        return MacroCompanyTotal;
    }

    public void setMacroCompanyTotal(double macroCompanyTotal) {
        MacroCompanyTotal = macroCompanyTotal;
    }

    public double getMacroCompanyTotalRate() {
        return MacroCompanyTotalRate;
    }

    public void setMacroCompanyTotalRate(double macroCompanyTotalRate) {
        MacroCompanyTotalRate = macroCompanyTotalRate;
    }

    public double getCompanyTotal() {
        return CompanyTotal;
    }

    public void setCompanyTotal(double companyTotal) {
        CompanyTotal = companyTotal;
    }

    public double getCompanyTotalRate() {
        return CompanyTotalRate;
    }

    public void setCompanyTotalRate(double companyTotalRate) {
        CompanyTotalRate = companyTotalRate;
    }

    @Override
    public String toString() {
        return "Sheet1Rate{" +
                "ProName='" + ProName + '\'' +
                ", ProRange='" + ProRange + '\'' +
                ", LargeCompanyTotal=" + LargeCompanyTotal +
                ", LargeCompanyTotalRate=" + LargeCompanyTotalRate +
                ", MidCompanyTotal=" + MidCompanyTotal +
                ", MidCompanyTotalRate=" + MidCompanyTotalRate +
                ", SmallCompanyTotal=" + SmallCompanyTotal +
                ", SmallCompanyTotalRate=" + SmallCompanyTotalRate +
                ", MacroCompanyTotal=" + MacroCompanyTotal +
                ", MacroCompanyTotalRate=" + MacroCompanyTotalRate +
                ", CompanyTotal=" + CompanyTotal +
                ", CompanyTotalRate=" + CompanyTotalRate +
                '}';
    }
}
