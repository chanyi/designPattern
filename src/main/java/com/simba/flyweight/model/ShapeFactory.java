package com.simba.flyweight.model;

import java.util.HashMap;
import javafx.scene.shape.Circle;

public class ShapeFactory {
  private static final HashMap<String,Shape> hashMap= new HashMap<>();

  public static Shape getCircle(String color){
    Shape circle = (Shape)hashMap.get(color);
    if(circle == null){
      circle = new ShapeCircle(color);
      hashMap.put(color,circle);
      circle.toString();
    }
    return circle;
  }

}
