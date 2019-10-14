package com.simba.bridge.model;

public class ColorRed implements Color{

  @Override
  public void bepaint(String penType, String name) {
    System.out.println("Red "+name);
  }
}
