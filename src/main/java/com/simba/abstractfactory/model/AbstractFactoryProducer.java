package com.simba.abstractfactory.model;

public class AbstractFactoryProducer {

  //具体工厂生成器，通过传入的参数获取对应的具体工厂
  public static AbstractFactory getFactory(String factory){
    if("shape".equals(factory)){
      return new ShapeFactory();
    }else if("color".equals(factory)){
      return new ColorFactory();
    }else{
      return null;
    }
  }
}
