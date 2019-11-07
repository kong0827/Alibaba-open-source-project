package com.kxj.converter;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

/**
 * @ClassName CustomStringStringConverter
 * @Description TODO 自定义转换器
 * @Author kongxiangjin
 * @Date 2019/11/7 16:10
 * @Version 1.0
 **/
public class CustomStringStringConverter implements Converter {
    public Class supportJavaTypeKey() {
        return String.class;
    }

    // 判断单元格类型
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING;
    }

    /**
     * 这里读的时候会调用
     * @param cellData
     * @param excelContentProperty
     * @param globalConfiguration
     * @return
     * @throws Exception
     */
    public Object convertToJavaData(CellData cellData, ExcelContentProperty excelContentProperty, GlobalConfiguration globalConfiguration) throws Exception {

        return "自定义"+cellData.getStringValue();
    }

    /**
     * 这里是写的时候会调用 不用管
     * @param o
     * @param excelContentProperty
     * @param globalConfiguration
     * @return
     * @throws Exception
     */
    public CellData convertToExcelData(Object o, ExcelContentProperty excelContentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        return new CellData(o.toString());
    }
}
