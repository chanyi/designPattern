package com.simba.abstractfactory.controller;

import com.simba.abstractfactory.model.AbstractFactory;
import com.simba.abstractfactory.model.AbstractFactoryProducer;
import com.simba.abstractfactory.model.Color;
import com.simba.abstractfactory.model.Shape;

public class AbstractFactoryController {

  public static void main(String[] args){
    //先获取一个具体工厂
    AbstractFactory abstractFactory = AbstractFactoryProducer.getFactory("shape");
    //在通过具体工厂生成具体产品
    Shape shape = abstractFactory.newShape("rectangle");
    shape.show();

    AbstractFactory abstractFactory1 = AbstractFactoryProducer.getFactory("color");
    Color color = abstractFactory1.newColor("red");
    color.show();

  }
}
