## 阿里巴巴开源项目简单入门案例

**阿里巴巴**提供了众多的开源项目，例如：前端有ant design,egg.js,Mock.js等，java有 Druid，fastjson,Dubbo, Arthas等等一系列开源项目，极大地提高了我们的开发效率，也提升了我们的技术水平和眼界，自己将平时瞎捣鼓的一些阿里巴巴开源项目的小案例贴出来，经供参考

#### 1、EasyExcel

- [github地址：]( https://github.com/alibaba/easyexcel ) https://github.com/alibaba/easyexcel 

-  [官网文档：](https://alibaba-easyexcel.github.io/)https://alibaba-easyexcel.github.io/

- **简介**  

  - EasyExcel是 快速、简单避免OOM的java处理Excel工具 

  - 之前Excel解析一般是使用POI，但POI存在一个严重的问题，就是非常消耗内存。所以阿里人员对它进行了重写从而诞生了`easyexcel`，它解决了过于消耗内存问题，也对它进行了封装让使用者使用更加便利 。**64M内存1分钟内读取75M(46W行25列)的Excel**

- **入门案例** 

  1、简单的读操作 

  - [Code 地址]( https://github.com/kong0827/Alibaba-open-source-project/blob/master/EasyExcel/src/test/java/com/kxj/reader/simpleReader.java)
  
- 实现效果：
    1. 能够读取excel表格，打印在控制台上

  2、指定读取列的下标或列名

  - [Code地址](https://github.com/kong0827/Alibaba-open-source-project/blob/master/EasyExcel/src/test/java/com/kxj/reader/SimpleReader_DateConverter.java)

  - 实现效果：
  
  1. 能够指定读取哪一列
  
  - 存在问题：日期显示不正确
    - 解决办法：自定义日期转换器
  
  - 2、简单的写操作
  - 3、
  
- **项目目录讲解**

  -  [src/main/java/com/entity]( https://github.com/kong0827/Alibaba-open-source-project/tree/master/EasyExcel/src/main/java/com/kxj/entity )：定义与Excel对应的实体类
  - [src/main/java/com/converter](https://github.com/kong0827/Alibaba-open-source-project/tree/master/EasyExcel/src/main/java/com/kxj/converter)：转化器，例如日期转化器
  -  [src/main/java/com/reader](https://github.com/kong0827/Alibaba-open-source-project/tree/master/EasyExcel/src/main/java/com/kxj/reader)：监听器，监听读取Excel的操作
  -  [src/main/java/com/utils](https://github.com/kong0827/Alibaba-open-source-project/tree/master/EasyExcel/src/main/java/com/kxj/utils)：工具类，包含获取路径的工具类

  
