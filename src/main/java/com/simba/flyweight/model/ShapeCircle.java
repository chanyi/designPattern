package com.simba.flyweight.model;

import javafx.scene.shape.Circle;

public class ShapeCircle implements Shape {
  private String color;
  private int x;
  private int y;
  private int radius;

  public ShapeCircle (String color){
    this.color =color;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  public String toString() {
    return "ShapeCircle{" +
        "color='" + color + '\'' +
        ", x=" + x +
        ", y=" + y +
        ", radius=" + radius +
        '}';
  }

  @Override
  public void draw() {
    toString();
  }
}
