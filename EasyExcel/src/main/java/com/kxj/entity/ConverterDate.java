package com.kxj.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.kxj.converter.CustomStringStringConverter;

/**
 * @ClassName ConverterDate
 * @Author kongxiangjin
 * @Date 2019/11/7 16:25
 * @Version 1.0
 *
 * @Description
 **/
public class ConverterDate {

    /**
     * 我自定义 转换器，不管数据库传过来什么 。我给他加上“自定义：”
     */
    @ExcelProperty(index = 0)
    private String id;

    /**
     * 这里用string 去接日期才能格式化。我想接收年月日格式
     */
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    @ExcelProperty("出生日期")
    private String birthday;

    @ExcelProperty("用户名")
    private String username;

    @ExcelProperty(converter = CustomStringStringConverter.class, index = 3)
    private String gender;

    public ConverterDate() {
    }

    public ConverterDate(String id, String birthday, String username, String gender) {
        this.id = id;
        this.birthday = birthday;
        this.username = username;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ConverterDate{" +
                "id='" + id + '\'' +
                ", birthday='" + birthday + '\'' +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
