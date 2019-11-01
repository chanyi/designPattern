package com.simba.strategy.model;

public class OperationMultiply implements Strategy {

  @Override
  public int doOperation(int x, int y) {
    return x*y;
  }
}
