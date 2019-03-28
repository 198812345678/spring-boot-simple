package com.will.example.spring.jiemi.ch2;

import com.will.example.spring.jiemi.FXNewsProvider;
import org.junit.Before;
import org.junit.Test;

public class FXNewsProviderTest {

    private FXNewsProvider fxNewsProvider;

    @Before
    public void before() {
        fxNewsProvider = new FXNewsProvider(new MockNewsListener(), new MockNewsPersister());
    }

    @Test
    public void test() {
        //TODO 调用fxNewsProvider的方法开始测试
    }
}
