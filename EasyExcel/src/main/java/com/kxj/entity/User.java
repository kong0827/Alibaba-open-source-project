package com.kxj.entity;

import java.util.Date;

/**
 * @ClassName User
 * @Description TODO
 * @Author kongxiangjin
 * @Date 2019/11/7 14:20
 * @Version 1.0
 **/
public class User {
    private String id;
    private String username;
    private Date birthday;
    private String gender;

    public User() {
    }

    public User(String id, String username, Date birthday, String gender) {
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
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
