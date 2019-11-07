package com.kxj.utils;

import java.io.File;
import java.net.URL;

/**
 * @ClassName FilePath
 * @Description TODO
 * @Author kongxiangjin
 * @Date 2019/11/7 14:11
 * @Version 1.0
 **/

/**
 * getClass().getResource(fileName) ：表示只会在当前调用类所在的同一路径下查找该fileName文件；
 *.getClass().getClassLoader().getResource(fileName)：表示只会在根目录下（/）查找该文件；
 * fileName如果是前面加“/”，如"/fileName"，则表示绝对路径，取/目录下的该文件；
 * 如果是前面没有加“/”，如"fileName"，则表示相对路径，取与调用类同一路径下的该文件。
 * 如果路径中包含包名 ，getClass().getResource("com/xxx/1.xml");
 * 包名的层级使用"/"隔开（正斜杠），而非“.”（半角句号）
 */
public class FilePath {
    public static String getFilePath(String filename) {
        URL url = FilePath.class.getClassLoader().getResource(filename);
        return url != null ? url.getPath() : null;
    }

}
