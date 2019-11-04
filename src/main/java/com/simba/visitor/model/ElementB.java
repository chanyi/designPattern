package com.simba.visitor.model;

public class ElementB implements Element {

  @Override
  public void accept(Visitor visitor) {
    visitor.visitor(this);
  }
  public String operationB(){
    return "具体元素B的操作";
  }
}
