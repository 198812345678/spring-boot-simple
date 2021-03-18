package com.will.example.spring.statemachine;

import java.util.Map;

public interface OrderService {

  Order creat();

  Order pay(int id);

  Order deliver(int id);

  Order receive(int id);

  Map<Integer, Order> getOrders();
}
