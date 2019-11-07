package com.kxj.reader;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.kxj.entity.IndexOrNameUser;

/**
 * @ClassName IndexOrNameUserListener
 * @Description TODO
 * @Author kongxiangjin
 * @Date 2019/11/7 15:11
 * @Version 1.0
 **/
public class IndexOrNameUserListener  extends AnalysisEventListener<IndexOrNameUser> {
    public void invoke(IndexOrNameUser indexOrNameUser, AnalysisContext analysisContext) {
        System.out.println(JSON.toJSONString(indexOrNameUser));
    }

    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println("解析结束.........");
    }
}
