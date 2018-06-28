package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

/**
 * @Author:Lvxingqing
 * @Description:
 * @Date:Create in 17:40 2018/6/27
 * @Modified By:
 */
@RestController
public class SliceUpload {
    private final int BYTES_PER_SLICE = 1<<20;
    @RequestMapping(value="sliceUpload",method= RequestMethod.POST)
    public int upload(@RequestParam("slice")MultipartFile slice,String fileName,int index) {
        int result = 0;
        if(slice.isEmpty()){
            return 0;
        }
        int size = (int) slice.getSize();
        System.out.println(fileName + "-->" + size);

        String path = "d:/test" ;
        File dest = new File(path + "/" + fileName);
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(dest,"rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            byte[] bytes = slice.getBytes(); //保存文件
            randomAccessFile.seek(index*BYTES_PER_SLICE);
            randomAccessFile.write(bytes);
            result = 1;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
