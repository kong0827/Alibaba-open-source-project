package com.kxj.reader;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.kxj.entity.IndexOrNameUser;
import com.kxj.entity.User;
import com.kxj.utils.FilePath;
import org.junit.Test;

/**
 * @ClassName simpleReader
 * @Author kongxiangjin
 * @Date 2019/11/7 14:13
 * @Version 1.0
 * @desc Excel的简单读操作
 **/
public class simpleReader {

    /**
     * 简单读操作 第一种写法
     * 由于默认异步读取excel，所以需要创建excel一行一行的回调监听器，参照{@link UserListener}
     */
    @Test
    public void testReader_Demo1() {
        // 获取文件路径
        String filePath = FilePath.getFilePath("user.xlsx");
        // 读取执行器
        ExcelReaderBuilder readerBuilder = EasyExcel.read(filePath, User.class, new UserListener());
        // 读取
        readerBuilder.sheet().doRead();

    }

    /**
     * 简单的读操作 第二种方法
     */
    @Test
    public void testReader_Demo2() {
        // 获取文件路径
        String filePath = FilePath.getFilePath("user.xlsx");
        ExcelReader excelReader = EasyExcel.read(filePath, User.class, new UserListener()).build();
        ReadSheet readSheet = EasyExcel.readSheet(0).build();
        excelReader.read(readSheet);
        // 这里千万别忘记关闭，读的时候会创建临时文件，到时磁盘会崩的
        excelReader.finish();
    }


    /**
     * 指定列的下标或者列名
     *
     * <p>1. 创建excel对应的实体对象,并使用{@link ExcelProperty}注解. 参照{@link IndexOrNameUser}
     * <p>2. 由于默认异步读取excel，所以需要创建excel一行一行的回调监听器，参照{@link IndexOrNameUserListener}
     * <p>3. 直接读即可
     */
    @Test
    public void testReaderDemo3() {
        String filepath = FilePath.getFilePath("user.xlsx");
        ExcelReaderBuilder read = EasyExcel.read(filepath, IndexOrNameUser.class, new IndexOrNameUserListener());
        read.sheet().doRead();

    }

}
