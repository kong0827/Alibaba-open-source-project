package com.kxj.reader;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.kxj.entity.DemoData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoDataListener extends AnalysisEventListener<DemoData> {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoDataListener.class);

    /**
     * 每解析一行都会回调invoke()方法
     * @param demoData
     * @param analysisContext
     */
    @Override
    public void invoke(DemoData demoData, AnalysisContext analysisContext) {
        System.out.println(demoData.toString());
    }

    /**
     * 解析结束时调用
     * @param analysisContext
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}