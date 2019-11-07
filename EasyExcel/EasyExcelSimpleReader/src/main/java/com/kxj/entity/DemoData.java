package com.kxj.entity;

/**
 * @ClassName DemoData
 * @Description TODO
 * @Author kongxiangjin
 * @Date 2019/11/7 10:26
 * @Version 1.0
 **/
public class DemoData {
    private String stringTitle;
    private String dataTitle;
    private String numberTitle;

    public DemoData() {
    }

    public DemoData(String stringTitle, String dataTitle, String numberTitle) {
        this.stringTitle = stringTitle;
        this.dataTitle = dataTitle;
        this.numberTitle = numberTitle;
    }

    public String getStringTitle() {
        return stringTitle;
    }

    public void setStringTitle(String stringTitle) {
        this.stringTitle = stringTitle;
    }

    public String getDataTitle() {
        return dataTitle;
    }

    public void setDataTitle(String dataTitle) {
        this.dataTitle = dataTitle;
    }

    public String getNumberTitle() {
        return numberTitle;
    }

    public void setNumberTitle(String numberTitle) {
        this.numberTitle = numberTitle;
    }

    @Override
    public String toString() {
        return "DemoData{" +
                "stringTitle='" + stringTitle + '\'' +
                ", dataTitle='" + dataTitle + '\'' +
                ", numberTitle='" + numberTitle + '\'' +
                '}';
    }
}
