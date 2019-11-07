package com.kxj.reader;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.kxj.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserListener extends AnalysisEventListener<User> {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserListener.class);

    /**
     * 每解析一行都会回调invoke()方法
     * 如果想进行保存到数据库的操作，可以再这里读取的时候将其保存，
     * 可以一条一条保存，也可以多条一起保存，减少多次访问数据库，IO操作
     * @param user
     * @param analysisContext
     */
    public void invoke(User user, AnalysisContext analysisContext) {
        System.out.println(user.toString());
    }

    /**
     * 解析结束时调用
     * @param analysisContext
     */
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println("excel文件解析结束.........");
    }
}