package com.simba.flyweight.model;

import java.util.HashMap;
import javafx.scene.shape.Circle;

public class ShapeFactory {
  private static final HashMap<String,Shape> hashMap= new HashMap<>();

  //共享一个对象，修改他的属性即可，不用重新生成
  public static Shape getCircle(String color){
    Shape circle = (Shape)hashMap.get(color);
    if(circle == null){
      System.out.println("新的颜色");
      circle = new ShapeCircle(color);
      //按照颜色的类型存储形状对象，如果下次有相同的颜色，则可以直接用形状对象
      hashMap.put(color,circle);
      System.out.println(circle.toString());
    }
    return circle;
  }

}
