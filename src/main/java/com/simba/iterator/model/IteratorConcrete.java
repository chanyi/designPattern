package com.simba.iterator.model;

import java.util.ArrayList;
import java.util.List;

public class IteratorConcrete implements Iterator {

  private List<Object> list = new ArrayList<>();

  private int index = -1;

  public IteratorConcrete(List<Object> list) {
    this.list = list;
  }

  @Override
  public Object first() {
    index = 0;
    Object object = list.get(index);
    return object;
  }

  @Override
  public Object next() {
    Object object = null;
    if(this.hasNext()){
      object = list.get(++index);
    }
    return object;
  }

  @Override
  public Boolean hasNext() {
    if(index<list.size()-1){
      return true;
    }else{
      return false;
    }
  }
}
