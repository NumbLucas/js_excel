package com.example.demo.Model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class RMBLoanRateRange extends BaseRowModel {
    @ExcelProperty(index = 0)
    private String ProName;

    @ExcelProperty(index = 0)
    private String ProRange;

    @ExcelProperty(index = 0)
    private String LargeCompanyTotal;

    @ExcelProperty(index = 0)
    private String LargeCompanyTotalRate;

    @ExcelProperty(index = 0)
    private String MidCompanyTotal;

    @ExcelProperty(index = 0)
    private String MidCompanyTotalRate;

    @ExcelProperty(index = 0)
    private String SmallCompanyTotal;

    @ExcelProperty(index = 0)
    private String SmallCompanyTotalRate;

    @ExcelProperty(index = 0)
    private String MacroCompanyTotal;

    @ExcelProperty(index = 0)
    private String MacroCompanyTotalRate;

    @ExcelProperty(index = 0)
    private String CompanyTotal;

    @ExcelProperty(index = 0)
    private String CompanyTotalRate;

}
