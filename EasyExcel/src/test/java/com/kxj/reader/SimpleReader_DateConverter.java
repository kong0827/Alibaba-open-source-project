package com.kxj.reader;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.kxj.entity.ConverterDate;
import com.kxj.entity.IndexOrNameUser;
import com.kxj.utils.FilePath;
import org.junit.Test;

/**
 * @ClassName SimpleReader_DateConverter
 * @Author kongxiangjin
 * @Date 2019/11/7 16:21
 * @Version 1.0
 *
 * @Description 处理日期转换问题
 **/
public class SimpleReader_DateConverter {

    @Test
    public void test() {
        String filepath = FilePath.getFilePath("user.xlsx");
        ExcelReaderBuilder read = EasyExcel.read(filepath, ConverterDate.class, new ConverterDateListener());
        read.sheet().doRead();
    }
}
