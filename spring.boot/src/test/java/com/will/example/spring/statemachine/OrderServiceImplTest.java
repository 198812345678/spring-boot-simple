package com.will.example.spring.statemachine;

import static org.junit.Assert.*;

import com.will.example.spring.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImplTest extends BaseTest {

  @Autowired
  private OrderService orderService;

  @Test
  public void testMultThread(){
    orderService.creat();
    orderService.creat();

//    orderService.pay(1);

//    new Thread(()->{
//      orderService.deliver(1);
//      orderService.receive(1);
//    }).start();

    orderService.pay(2);
    orderService.deliver(2);
    orderService.receive(2);

    System.out.println(orderService.getOrders());
  }

}