package com.simba.abstractfactory.model;

public class ColorFactory implements AbstractFactory{

  //具体的工厂类只实现对应的抽象方法即可，无关的抽象方法可以不管
  @Override
  public Shape newShape(String shape) {
    return null;
  }

  @Override
  public Color newColor(String color) {

    if("red".equals(color)){
      return new ColorRed();
    }else if("green".equals(color)){
      return new ColorGreen();
    }else{
      return null;
    }
  }
}
