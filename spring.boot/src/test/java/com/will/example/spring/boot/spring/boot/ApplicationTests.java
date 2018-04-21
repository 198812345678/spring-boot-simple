package com.will.example.spring.boot.spring.boot;

import com.will.example.spring.boot.spring.boot.bean.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Resource
	private Foo foo;

	@Resource
	private Foo2 foo2;

	@Resource
	private Foo3 foo3;

	@Resource
	private Foo4 foo4;

	@Resource
	private Foo5 foo5;

//	@Resource
//	private Foo6 foo6;
//
//	@Resource
//	private Foo7 foo7;

	@Resource
	private Foo8 foo8;

	@Resource
	private Foo10 foo10;

	@Resource
	private Foo11 foo11;

	@Resource
	private Foo12 foo12;

	@Test
	public void contextLoads() {
	}

	@Test
	public void test_Dependencies_Constructor_argument_resolution() {
		System.out.println(foo.toString());
		System.out.println(foo2.toString());
		System.out.println(foo3.toString());
		System.out.println(foo4.toString());
		System.out.println(foo5.toString());
//		System.out.println(foo6.toString());
//		System.out.println(foo7.toString());
		System.out.println(foo8.toString());
		System.out.println(foo10.toString());
		System.out.println(foo11.toString());
		System.out.println(foo12.toString());
	}

}
