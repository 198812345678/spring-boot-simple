#### 2.1 我们的理念是：让别人为你服务
* 好莱坞原则“Don’t call us, we will call you.”
* 也就是让IoC Service Provider来为你服务
* 非IOC的例子 @see com.will.example.spring.jiemi.FXNewsProvider.FXNewsProvider()

#### 2.2 手语，呼喊，还是心有灵犀
##### 2.2.1 构造方法注入
* 当依赖对象比较多的时候，构造方法的参数列表会比较长
* 通过反射构造对象的时候，对相同类型的参数的处理会比较困难
* 对于非必须的依赖处理，可能需要引入多个构造方法，
* @see com.will.example.spring.jiemi.FXNewsProvider.FXNewsProvider
##### 2.2.2 setter方法注入
* 对象无法在构造完成后马上进入就绪状态
* 这就好比你可以到酒吧坐下后再决定要点什么啤酒，可以要百威，也可以要大雪，随意性比较强。如果你不急着喝，这种方式当然是最适合你的
* @see com.will.example.spring.jiemi.FXNewsProvider.setNewsListener @see com.will.example.spring.jiemi.FXNewsProvider.setNewsPersister
##### 2.2.3 接口注入
* 不甚提倡的一种方式, 强制被注入对象实现不必要的接口，带有侵入性
* @see com.will.example.spring.jiemi.FXNewsProvider.injectNewsListener

#### 2.3 IoC 的附加值
* 换一个依赖的实现，不用重新定义一个类，对比 @see com.will.example.spring.jiemi.FXNewsProvider.FXNewsProvider() @see com.will.example.spring.jiemi.ch2.MarketWin24Case.test1
* 测试时候mock有外部依赖的逻辑 @see com.will.example.spring.jiemi.ch2.FXNewsProviderTest.test