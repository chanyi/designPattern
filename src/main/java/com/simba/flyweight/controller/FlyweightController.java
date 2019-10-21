package com.simba.flyweight.controller;

import com.simba.flyweight.model.ShapeCircle;
import com.simba.flyweight.model.ShapeFactory;

public class FlyweightController {

  private static final String[] colors={"red","green","blue","red","blue","green"};

  public static void main(String[] args) {
    for(int i=0;i<6;i++){
      ShapeCircle circle = (ShapeCircle) ShapeFactory.getCircle(colors[i]);
      circle.setX(1);
      circle.setY(2);
      circle.setRadius(12);
      circle.draw();
    }
  }

}
