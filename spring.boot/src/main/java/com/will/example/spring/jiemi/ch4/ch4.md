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
* <depends-on>: 当classA并不直接依赖class，但是依赖classB某些操作的结果时使用 @see com.will.example.spring.jiemi.ch4.Ch4Test.test6
* <autowire>: @see com.will.example.spring.boot.spring.boot.bean.Foo20

#### 4.3.4 继承?我也会!
* abstract=true的bean可以没有对应的class定义，所以容器中不会真实存在这个bean
* 使用场景是多个bean都要注入相同的其它bean，属性名要等于abstract bean中的property name
* @see com.will.example.spring.jiemi.ch4.Ch4Test.test7

#### 4.3.5 bean 的 scope
* singleton: 存活期限，直到容器销毁；数量，同一个容器只有一个实例
* prototype: 每次从容器里获取都是一个新的实例，所以，存活期，程序使用情况而定；数量，多个，每次获取都是新的一个；
