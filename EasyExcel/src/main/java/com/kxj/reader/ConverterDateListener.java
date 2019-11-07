package com.kxj.reader;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.kxj.entity.ConverterDate;
import com.kxj.entity.IndexOrNameUser;

/**
 * @ClassName ConverterDateListener
 * @Description TODO
 * @Author kongxiangjin
 * @Date 2019/11/7 16:29
 * @Version 1.0
 **/
public class ConverterDateListener  extends AnalysisEventListener<ConverterDate> {

    public void invoke(ConverterDate converterDate, AnalysisContext analysisContext) {
        System.out.println(JSON.toJSONString(converterDate));
    }

    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println("解析结束.........");
    }
}
