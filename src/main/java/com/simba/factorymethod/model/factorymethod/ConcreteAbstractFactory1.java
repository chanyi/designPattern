package com.simba.factorymethod.model.factorymethod;

public class ConcreteAbstractFactory1 implements AbstractFactory{

  @Override
  public Product newProduct() {
    System.out.println("具体工厂类ConcreteAbstractFactory1-->生成具体产品ConcreteProdcut1");
    return new ConcreteProduct1();
  }
}
