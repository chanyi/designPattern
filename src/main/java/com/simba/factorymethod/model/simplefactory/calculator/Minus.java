package com.simba.factorymethod.model.simplefactory.calculator;

public class Minus implements Calculator {

  @Override
  public double calculate(Double num1, Double num2) {
    return num1-num2;
  }
}
