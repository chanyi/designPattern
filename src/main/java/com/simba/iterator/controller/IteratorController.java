package com.simba.iterator.controller;

import com.simba.iterator.model.Aggregate;
import com.simba.iterator.model.AggregateConcrete;
import com.simba.iterator.model.Iterator;

public class IteratorController {

  public static void main(String[] args) {
    Aggregate aggregate = new AggregateConcrete();
    aggregate.add("1");
    aggregate.add("2");
    aggregate.add("3");
    System.out.println("聚合类的内容：---");
    Iterator iterator = aggregate.getIterator();
    while (iterator.hasNext()){
      Object object = iterator.next();
      System.out.println(object);
    }
    Object object = iterator.first();
    System.out.println("first:"+ object);
  }
}
