# Asuka BETA
[🐦🐦🐦🐦🐦](https://github.com/ByNow/asuka)
*asuka 是基于velocity模板引擎的代码生成器，不限制生成的目标代码语言与代码风格*
## 简要说明
maven多模块构建的springboot整合javaFX项目
半自动化图形界面代码生成器，UI很简陋，想优化但优化不动。
本工具只提供执行模板以及适配数据源的代码，使用者根据项目本身编程语言与编码规范，修改项目示例模板，生成完全符合项目组风格的单表业务代码，目前测试版本仅支持Mysql数据库，后续会尝试适配PostgreSQL，ElasticSearch，暂无计划适配Oracle，(;¬_¬)

![image](https://cdn.u1.huluxia.com/g4/M03/6B/51/rBAAdl7kE_GASE5xAAHePow2n4s651.jpg)
![image](
https://cdn.u1.huluxia.com/g4/M03/6B/52/rBAAdl7kFB6ANbEoAACoGxdqHE4768.jpg)
![image](
https://cdn.u1.huluxia.com/g4/M03/6B/52/rBAAdl7kFC-AfrKQAACapAo--2g284.jpg)
![image](
https://cdn.u1.huluxia.com/g4/M03/6B/58/rBAAdl7kGJ2AMuFBAAAxXOkNo9c072.png)



## 模块介绍
asuka-ui springboot整合javaFX的部分，UI界面代码
asuka-core 代码生成器业务逻辑部分
asuka-api(待开发)

velocity模板引擎在core模块resource目录下，目前仅编辑了一套最简单的适配Java的模板，生成代码后使用的实例可以参考[asuka-example](https://github.com/ByNow/asuka-example)



### 特别注意
* 本工具建议使用Java8以上版本运行，springboot与javaFX整合插件使用了开源作者[Felix Roske](https://github.com/roskenet)的插件项目springboot-javafx-support，低版本Java运行会有问题。

* 模板只是用于参考的，生成的代码中没有封装返回实体，没有生成接口文档，也没有分页插件，这些都需要你在模板中修改添加，适配所在项目组编码风格。
