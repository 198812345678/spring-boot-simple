* BeanFactory: 延迟初始化；完成作为IoC Service Provider的所有职责，包括业务对象的注册和对象间依赖关系的绑定。
* ApplicationContext: 基于BeanFactory，非延迟初始化
* 如果BeanFactory只是把注册的对象组装成最终完整的对象，那最初对象的初始化是谁做的？

#### 4.1 拥有BeanFactory之后的生活
* BeanFactory为我们做了@see com.will.example.spring.jiemi.ch3.Ch3Test.test