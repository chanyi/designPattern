package com.simba.abstractfactory.model;

public interface AbstractFactory {
  //抽象工厂里至少生产两个不同的产品
  Shape newShape(String shape);
  Color newColor(String color);
}
