package com.simba.factorymethod.model;
import com.simba.factorymethod.model.Product;

public class ConcreteProduct1 implements Product {

  @Override
  public void show() {
    System.out.println("concreteProduct1");
  }
}
