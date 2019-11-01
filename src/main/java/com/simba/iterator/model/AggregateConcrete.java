package com.simba.iterator.model;

import java.util.ArrayList;
import java.util.List;

public class AggregateConcrete implements Aggregate {

  private List<Object> list = new ArrayList<>();

  @Override
  public void add(Object object) {
    list.add(object);
  }

  @Override
  public void remove(Object object) {
    list.remove(object);
  }

  @Override
  public Iterator getIterator() {
    return new IteratorConcrete(list);
  }
}
