package com.example.demo.Service;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import static org.apache.tomcat.util.file.ConfigFileLoader.getInputStream;

@Service
public class CreateHeader {
    public void createHeader(String path) throws IOException {
        ExcelListener listener = new ExcelListener();
        ExcelReader excelReader = new ExcelReader(getInputStream(path), ExcelTypeEnum.XLS, null, listener);

        OutputStream out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\"+"result\\"+"result1.xlsx");
        ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLS);

        for(Sheet sheet:excelReader.getSheets()) {
            String sheetName = sheet.getSheetName();
            int headLines = 5;
            switch (sheetName) {
                case "R02_人民币贷款浮动利率期限结构表":
                    headLines = 5;
                    break;
                default:
                    break;

            }

            Sheet head_sheet = new Sheet(sheet.getSheetNo(), sheet.getHeadLineMun());
            head_sheet.setSheetName(sheetName);
            excelReader.read(head_sheet);
            List<List<String>> l = new ArrayList<>();
            for (int j = 0; j < headLines; j++) {
                l.add((List<String>) listener.getDatas().get(j));
            }

            writer.write0(l, head_sheet);

            listener.clearDatas();

        }
            writer.finish();
            out.close();

    }
}
