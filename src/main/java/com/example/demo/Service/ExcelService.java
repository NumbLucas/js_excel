package com.example.demo.Service;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.analysis.ExcelAnalyser;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.example.demo.Model.ExcelInfo;
import com.example.demo.Model.Sheet2Model;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.apache.tomcat.util.file.ConfigFileLoader.getInputStream;

@Service
public class ExcelService {

    @Autowired
    CreateHeader createHeader;

    private ArrayList<List<Object>> template = new ArrayList<>();

    public String handleFiles(MultipartFile[] files) throws IOException {
        String rst = "success";

        ArrayList<File> fileArr = copyFiles(files);
        sum(mergeFiles(fileArr));
        //writeExcel();
        writeExcel();

        template.clear();
        return rst;
    }

    ArrayList<File> copyFiles(MultipartFile[] files) throws IOException {
        String filePath = "C:\\Users\\Administrator\\Desktop\\"+"result\\";
        File tmpFile = new File(filePath);
        ArrayList<File> fileArr = new ArrayList<>();


        if(!tmpFile.exists()){
            tmpFile.mkdir();
        }

        for (MultipartFile file:files) {
            File fileCopy = new File(filePath+file.getOriginalFilename());
            file.transferTo(fileCopy);
            fileArr.add(fileCopy);
        }
        File sumFile = new File(filePath+"sum.xlsx");
        if(fileArr!=null)
            FileUtils.copyFile(fileArr.get(0), sumFile);



        return fileArr;
    }

    public ArrayList<ArrayList<ArrayList<Object>>> mergeFiles(ArrayList<File> fileArr) throws IOException {

        ArrayList<ArrayList<ArrayList<Object>>> rst = new ArrayList<ArrayList<ArrayList<Object>>>();
        int templateIndex= 0;




        for (int i = 0; i < fileArr.size(); i++) {
            InputStream inputStream = getInputStream(fileArr.get(i).getAbsolutePath());


            createHeader.createHeader(fileArr.get(i).getAbsolutePath());

            try {

                // 解析每行结果在listener中处理
                ExcelListener listener = new ExcelListener();
                ExcelReader excelReader = new ExcelReader(inputStream, ExcelTypeEnum.XLS, null, listener);



                List<Sheet> sheets = excelReader.getSheets();
                System.out.println();
                ArrayList<ArrayList<Object>> obj = new ArrayList<ArrayList<Object>>();

                for (int k = 0; k < sheets.size(); k++) {
                    Sheet sheet = sheets.get(k);

                    if (sheet.getSheetNo() == 2) {
                        Sheet customSheet = new Sheet(sheet.getSheetNo(), 6, Sheet2Model.class);
                        customSheet.setStartRow(5);

                        excelReader.read(customSheet);
                    } else
                        excelReader.read(sheet);

                    System.out.println(listener.getDatas());
                    List<Object> temp = new ArrayList<>();
                    temp.addAll(listener.getDatas());
                    obj.add((ArrayList<Object>) temp);

                    if (templateIndex == 0) {
                        List<Object> temp_1 = new ArrayList<>();

                        for (int j = 0; j < listener.getDatas().size(); j++) {
                            Object m = listener.getDatas().get(j);

                            temp_1.add(listener.getDatas().get(j));
                        }

                        template.add(temp_1);
                    }



                    System.out.println(listener.getDatas().get(0).getClass().getName());
                    listener.clearDatas();
                }
                templateIndex++;
                rst.add(obj);
                inputStream.close();

            } catch (Exception e) {
                System.out.println(e);
            } finally {
                try {
                    inputStream.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return rst;
    }


    public void writeExcelWithModel(OutputStream outputStream, List<? extends BaseRowModel> data,
                                           Class<? extends BaseRowModel> clazz, ExcelTypeEnum excelTypeEnum)  {
        //这里指定需要表头，因为model通常包含表头信息
        ExcelWriter writer = new ExcelWriter(outputStream, excelTypeEnum,true);
        //写第一个sheet, sheet1  数据全是List<String> 无模型映射关系
        Sheet sheet1 = new Sheet(1, 0, clazz);
        writer.write(data, sheet1);
        writer.finish();
    }

    private void writeExcel() throws FileNotFoundException {

        long beginTime = System.currentTimeMillis();
        OutputStream out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\"+"result\\"+"template.xlsx");
        for(int i = 0;i < template.size();i++)
            System.out.println(template.get(i));
            //writeExcelWithModel(out, template.get(i), Sheet2Model.class, ExcelTypeEnum.XLSX);


        long endTime = System.currentTimeMillis();
        System.out.println(String.format("总共耗时 %s 毫秒", (endTime - beginTime)));
    }

    private void writeExcel2() throws FileNotFoundException {

        long beginTime = System.currentTimeMillis();
        OutputStream out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\"+"result\\"+"result2.xlsx");
        for(int i = 0;i < template.size();i++)
            //writeExcelWithModel(out, template.get(i), Sheet2Model.class, ExcelTypeEnum.XLSX);
            ;

        long endTime = System.currentTimeMillis();
        System.out.println(String.format("总共耗时 %s 毫秒", (endTime - beginTime)));

    }

    public void sum(ArrayList<ArrayList<ArrayList<Object>>> input) {
        for (int i = 0; i < input.size(); i++) {

            ArrayList<ArrayList<Object>> file = input.get(i);
            for (int j = 0; j < file.size(); j++) {
                ArrayList<Object> sheet = file.get(j);

                for (int k = 0; k < sheet.size(); k++) {
                    int q = k;
                }
            }
        }
    }
}
