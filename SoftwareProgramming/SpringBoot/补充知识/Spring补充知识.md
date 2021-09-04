> IOC(Inverse of Control)：控制反转

将原本由用户来进行创建和装配的对象实例交给了Spring容器中的框架；

> Spring容器：

所有的bean实例都由Spring容器管理，Spring容器根据配置文件(xml)和注解将其所依赖的对象引用传递给bean实例，也即是所谓的依赖注入；

> Bean实例

Bean是由Spring容器管理的Java对象的实例；

> Spring容器和IOC容器

一般来说，管更底层的BeanFactory接口叫做IOC容器，ApplicationContext叫做Spring容器，BeanFactory是Application的父接口；

> 单例模式和多例模式

BeanFactory会对容器管理的实例做缓存，单例模式下，外界获取实例请求时会先从容器中检查是否实例已经存在并返回已经存在的Bean实例，多例模式会返回一个新的；在Spring Boot中，又有Full模式和Lite模式的说法，分别对应了单例模式和多例模式；

> @Bean注解

Bean注解意味着告诉方法产生一个Bean对象，并将对象交给Spring容器管理；Bean的创建必须在@Configuration注解下创建；@Bean注解的作用与xml配置文件的作用相同；



关于Spring容器机器使用的参考：

[Spring容器参考]: https://blog.csdn.net/qq_43265564/article/details/112302472
[Spring容器，IOC容器参考]: https://zhuanlan.zhihu.com/p/71776087
[Spring容器更详细的参考]: https://blog.csdn.net/hongbochen1223/article/details/90713537

