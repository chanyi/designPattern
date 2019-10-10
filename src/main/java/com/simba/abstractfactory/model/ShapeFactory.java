package com.simba.abstractfactory.model;

public class ShapeFactory implements AbstractFactory{

  //具体的工厂类只实现对应的抽象方法即可，无关的抽象方法可以不管
  @Override
  public Shape newShape(String shape) {
    if("rectangle".equals(shape)){
      return new ShapeRectangle();
    }else if("circle".equals(shape)){
      return new ShapeCircle();
    }else{
      return null;
    }
  }

  @Override
  public Color newColor(String color) {
    return null;
  }
}
