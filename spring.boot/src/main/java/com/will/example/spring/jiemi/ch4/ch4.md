* BeanFactory: 延迟初始化；完成作为IoC Service Provider的所有职责，包括业务对象的注册和对象间依赖关系的绑定。
* ApplicationContext: 基于BeanFactory，非延迟初始化
* 如果BeanFactory只是把注册的对象组装成最终完整的对象，那最初对象的初始化是谁做的？

#### 4.1 拥有BeanFactory之后的生活
* BeanFactory为我们做了@see com.will.example.spring.jiemi.ch3.Ch3Test.test

#### 4.2 BeanFactory的对象注册与依赖绑定方式

##### 4.2.1 直接编码方式
* BeanFactory只是定义了如何获取bean的接口，具体bean的注册及依赖关系的管理由BeanDefinitionRegistry负责
* BeanDefinitionRegistry管理bean的注册和依赖关系时，每一个bean实例都有一个BeanDefinition与之对应，BeanDefinition
* @see com.will.example.spring.jiemi.ch4.Ch4Test.test

##### 4.2.2 外部配置文件方式
* 针对不同的配置文件格式，由不同的BeanDefinitionReader完成配置转化到BeanDefinition、BeanDefinition注册到BeanDefinitionRegistry两步工作，然后得到BeanFactory
* @see com.will.example.spring.jiemi.ch4.Ch4Test.test2

#### 4.3 BeanFactory的XML之旅 
* <idref>: 是个String的值，只是bean的名字 @see com.will.example.spring.jiemi.ch4.Ch4Test.test2
* 内部<bean>: @see com.will.example.spring.jiemi.ch4.Ch4Test.test3
* <List>: 可以注入任何Collection类型的依赖， @see com.will.example.spring.jiemi.ch4.Ch4Test.test4 当然Set类型也可以用<set>来注入
* <map>: 也可以注入嵌套的map，<key-ref>是某个bean的id（是要把这个bean作为key），@see com.will.example.spring.jiemi.ch4.Ch4Test.test5
