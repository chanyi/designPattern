package com.simba.bridge.model;

public class ColorGreen implements Color{

  @Override
  public void bepaint(String penType, String name) {
    System.out.println("Green."+name);
  }
}
