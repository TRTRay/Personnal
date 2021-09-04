

# Spring MVC



参考：

[Spring MVC【入门】就这一篇！ - 简书 (jianshu.com)](https://www.jianshu.com/p/91a2d0a1e45a)

[Web开发模式【Mode I 和Mode II的介绍、应用案例】 (qq.com)](https://mp.weixin.qq.com/s?__biz=MzI4Njg5MDA5NA==&mid=2247483775&idx=1&sn=c9d7ead744c6e0c3ab2fe55c09bbe61f&chksm=ebd7407edca0c9688f3870d895b760836101271b912899821fb35c5704fe215da2fc5daff2f9#rd)





## 什么是MVC？

MVC是从早期的Java Web开发模型演变来的

### Model 1

![image-20210902193635800](C:\Users\admin\AppData\Roaming\Typora\typora-user-images\image-20210902193635800.png)

显示层，控制层以及数据层都交给JSP或Java Bean来处理，由此导致

- JSP 和 Java Bean 之间严重耦合，Java 代码和 HTML 代码也耦合在了一起
- 要求开发者不仅要掌握 Java ，还要有高超的前端水平
- 前端和后端相互依赖，前端需要等待后端完成，后端也依赖前端完成，才能进行有效的测试
- 代码难以复用

### Model 2

![image-20210902193816876](C:\Users\admin\AppData\Roaming\Typora\typora-user-images\image-20210902193816876.png)

Servlet + JSP + JavaBean取代了上面的模式，也就形成了早期的**MVC模式**

- M (Model) 模型层

  ​	模型就是数据，模型层有数据访问和事务处理的功能

- V (View) 视图层

  ​	网页，JSP，通过接受Servlet传递的内容调用Java Bean来展示模型

- C (Controller) 控制器层

  ​	负责所有用户的请求参数，根据请求类型调用Java Bean，并将处理结果交给视图层显示

### Spring MVC

为解决持久层中一直未处理好的数据库事务的编程，又为了迎合 NoSQL 的强势崛起

![image-20210902194245616](C:\Users\admin\AppData\Roaming\Typora\typora-user-images\image-20210902194245616.png)

传统的模型层又被拆分成了**业务层(Service)**和**数据访问层(DAO, Data Access Object)**

- DAO (Data Access Object) 数据访问层

  ​	使用DAO, Hibernate, JDBC等技术实现对数据的增删改查

- Service 业务层

  ​	将原子性的DAO层操作组成完整的业务逻辑

  

ps：DAO其实应该是数据访问对象；数据访问层又被称为持久层

