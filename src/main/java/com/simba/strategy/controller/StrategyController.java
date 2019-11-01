package com.simba.strategy.controller;

import com.simba.strategy.model.Context;
import com.simba.strategy.model.OperationAdd;
import com.simba.strategy.model.OperationMultiply;
import com.simba.strategy.model.OperationSubstract;

public class StrategyController {

  public static void main(String[] args) {
    Context context = new Context(new OperationAdd());
    int s = context.executeStrategy(1,2);
    System.out.println(s);
    Context context2 = new Context(new OperationMultiply());
    int s2 = context2.executeStrategy(1,2);
    System.out.println(s2);
    Context context3 = new Context(new OperationSubstract());
    int s3 = context3.executeStrategy(1,2);
    System.out.println(s3);
  }

}
