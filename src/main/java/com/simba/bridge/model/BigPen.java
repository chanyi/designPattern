package com.simba.bridge.model;

public class BigPen extends Pen {

  @Override
  public void draw(String name) {
    String penType = "big";
    this.color.bepaint(penType,name);
  }
}
