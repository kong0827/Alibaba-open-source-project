package com.kxj.reader;


import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.kxj.entity.DemoData;


/**
 * @ClassName com.kxj.reader.SimpleReader
 * @Description TODO
 * @Author kongxiangjin
 * @Date 2019/11/6 18:13
 * @Version 1.0
 **/
public class SimpleReader {

    public static void main(String[] args) {
        /**
         * 简单读操作 写法一
         */
        // 文件所在路径
        String filePath = SimpleReader.class.getClassLoader().getResource("demo.xlsx").getPath();
        // 获取文件的读操作对象
        ExcelReaderBuilder readerBuilder = EasyExcel.read(filePath, DemoData.class, new DemoDataListener());
        // 读取
        readerBuilder.sheet().doRead();

        /**
         * 简单读操作 写法二
         */
        ExcelReader excelReader = EasyExcel.read(filePath, DemoData.class, new DemoDataListener()).build();
        ReadSheet readSheet = EasyExcel.readSheet(0).build();
        excelReader.read(readSheet);
        // 这里千万别忘记关闭，读的时候会创建临时文件，到时磁盘会崩的
        excelReader.finish();
    }


}
