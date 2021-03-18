package com.will.example.spring.statemachine;

import lombok.Data;

@Data
public class Order {

  private OrderStatus status;

  private Integer id;
}
