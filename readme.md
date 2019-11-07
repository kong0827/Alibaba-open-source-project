## 阿里巴巴开源项目简单入门案例

**阿里巴巴提供了众多的开源项目，例如：前端有ant design,egg.js,Mock.js等，java有 Druid，fastjson,Dubbo, Arthas等等一系列开源项目，极大地提高了我们的开发效率，也提升了我们的技术水平和眼界，自己将平时瞎捣鼓的一些阿里巴巴开源项目的小案例贴出来，经供参考**

#### 1、EasyExcel

- [github地址：]( https://github.com/alibaba/easyexcel ) https://github.com/alibaba/easyexcel 

-  [官网文档：](https://alibaba-easyexcel.github.io/)https://alibaba-easyexcel.github.io/

- **简介**：EasyExcel是 快速、简单避免OOM的java处理Excel工具 。

  - Java解析、生成Excel比较有名的框架有Apache poi、jxl。但他们都存在一个严重的问题就是非常的耗内存，poi有一套SAX模式的API可以一定程度的解决一些内存溢出的问题，但POI还是有一些缺陷，比如07版Excel解压缩以及解压后存储都是在内存中完成的，内存消耗依然很大。easyexcel重写了poi对07版Excel的解析，能够原本一个3M的excel用POI sax依然需要100M左右内存降低到几M，并且再大的excel不会出现内存溢出，03版依赖POI的sax模式。在上层做了模型转换的封装，让使用者更加简单方便 

- **入门案例** 

  - 1、简单的读操作 

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

