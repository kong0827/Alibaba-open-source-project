package com.kxj.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;

import java.util.Date;

/**
 * @ClassName IndexOrNameUser
 * @Description TODO
 * @Author kongxiangjin
 * @Date 2019/11/7 15:03
 * @Version 1.0
 *
 * @ExcelIgnore  加了这个注解会忽略该字段
 **/
public class IndexOrNameUser {

    // 强制读取第一个 这里不建议 index 和 name 同时用，要么一个对象只用index，要么一个对象只用name去匹配
    @ExcelProperty(index = 0)
    private String id;

    @ExcelProperty(index = 1)
    private String username;

    // 用名字去匹配，这里需要注意，如果名字重复，会导致只有一个字段读取到数据
    @ExcelProperty("出生日期")
    private Date birthday;

    @ExcelProperty("性别")
    @ExcelIgnore
    private String gender;

    public IndexOrNameUser() {
    }

    public IndexOrNameUser(String id, String username, Date birthday, String gender) {
        this.id = id;
        this.username = username;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "IndexOrNameUser{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
