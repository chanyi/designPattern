package com.simba.strategy.model;

public class OperationSubstract implements Strategy {

  @Override
  public int doOperation(int x, int y) {
    return x-y;
  }
}
