# Spring Boot

--After Getting Start



## 代码结构

### 主程序类

```JAVA
//@SpringApplication注解指明是一个主程序类
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(MainApplication.class, args);
    }
}
```

### 配置类

配置方法有很多种：

- 用注解@Configuration
- 用注解@Import引入额外的配置
- 用XML资源文件配置(Spring)



> 用@Configuration注解

配置类Myconfig如下：

```java
@Configuration
public class MyConfig {
    //用@Bean标签注册组件
    @Bean
    public Animal conponent01()
    {
        return new Animal("Dog");
    }

    @Bean
    public People conponent02()
    {
        return new People("zhangsan", 18);
    }
}
```

测试：

```java
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args)
    {
        //IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
		//在配置类中注册的组件
        Animal conponent1 = run.getBean(Animal.class);

        People conponent2 = run.getBean(People.class);

        System.out.println("Animal conponent : " + conponent1.toString());

        System.out.println(("People conponent : " + conponent2.toString()));

    }
}
```

其中run是IOC容器，Animal和People是两个JavaBean对象

- [ ] [补充知识：]: ./补充知识/Spring补充知识.md

@Configuration的proxyBeanMethods参数指示了容器是Full模式还是Lite模式

示例：

```Java
@Configuration(proxyBeanMethods = false)	//Lite模式
```



> 用@Import注解

所有的配置应当放在@Configuration标记的配置类下，但是用@Import注解可以导入其他的配置类；但是@Import导入的组件名是全类名

示例：

```java
@Import(DBHelper.class)
@Configuration
public class MyConfig ...
```

通过@Import注解向容器内注册了DBHelper组件（DBHelper是以来包里随手拿来的一个类）

[@Import注解更详细的用法]: https://www.bilibili.com/video/BV1gW411W7wy?p=8



> 用XML配置文件导入配置

看个示例：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:p="http://www.springframework.org/schema/p"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
	<bean name="userAction" class="com.action.UserAction" scope="prototype">
		<property name="loginBiz" ref="loginBiz"></property>
	</bean>
 
	<bean name="loginBiz" class="com.biz.impl.LoginBizImpl">
		<!-- DI -->
		<property name="userDao" ref="userDao"></property>
		<property name="logDao" ref="logDao"></property>
	</bean>
	<!--
	<bean name="loginBiz" class="com.biz.impl.LoginBizImpl" scope="prototype" autowire="byName">
		 DI 
		<property name="userDao" ref="userDao"></property>
		<property name="logDao" ref="logDao"></property>
		
	</bean>
	-->
 
	<bean name="userDao" class="com.dao.impl.UserDaoImpl"></bean>
 
	<bean name="logDao" class="com.dao.impl.LogDaoImpl"></bean>
</beans>
```

在通过@ImportResource注解导入配置文件即可

```java
@ImportResource(classpath:bean.xml)	//bean.xml放在resource目录下
@Configuration
public class MyConfig ...
```

配置文件大致是这样，了解即可

- [ ] [补充：@ComponentScan,@C]: ./补充知识/配置类相关注解补充.md

  

> 自动配置

注解@EnableAutoConfiguration



@SpringBootApplication等效于@SpringBootConfiguration,@EnableAutoConfiguration和@ComponentScan
