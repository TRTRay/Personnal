# 一个简易的用户注册demo



## version-1.0.0

参考：

[使用springboot实现一个简易的用户注册功能 - 哔哩哔哩 (bilibili.com)](https://www.bilibili.com/read/cv3781880?spm_id_from=333.999.0.0)



开发流程：

- 创建本地数据库，配置MyBatis并链接本地数据库
- 创建数据库中对应的实体集
- 创建**持久层接口**(mapper)，用xml映射文件配置mapper，在xml文件中添加**方法(接口功能)**
- 在启动类上注明mapper接口的位置，在mapper文件中注明mapper配置文件的位置
- 创建**业务层接口**，**业务层实现类**
- 创建**控制器**处理用户请求

ps：

**持节层接口**：业务层通过持久层接口调用持久层方法对数据进行操作

**方法**：可用来调用的持久层方法，实现了接口的一部分功能

**业务层接口**：业务层接口定义了相应功能的抽象方法

**业务层实现类**：实现业务层接口的相应功能给控制器调用

**控制器**：控制器处理用户请求后调用业务层相应功能回应请求





[Spring]: D:\Personal\Personal\SoftwareProgramming\SpringMVC\SpringMVC.md

查看上面笔记中的SpringMVC逻辑图



> 用Tset中的方法对不同层面的方法进行逐一验证，之后再进行封装

