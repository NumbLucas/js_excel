package com.example.demo.Controller;

import com.example.demo.Service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class UploadController {
    @Autowired
    ExcelService excelService;

    @RequestMapping(path = {"/"})
    public String home() {
        return "excel";
    }

    @RequestMapping(path = {"/upload"}, method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile[] uploadFiles,
                         HttpServletRequest request) throws IOException {

        excelService.handleFiles(uploadFiles);

        return "success";
    }
}
