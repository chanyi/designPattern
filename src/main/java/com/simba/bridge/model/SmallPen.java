package com.simba.bridge.model;

public class SmallPen extends Pen {

  @Override
  public void draw(String name) {
    String penType = "small";
    this.color.bepaint(penType,name);
  }
}
