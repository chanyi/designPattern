package com.simba.visitor.model;

public class ElementA implements Element {

  @Override
  public void accept(Visitor visitor) {
    visitor.visitor(this);
  }
  public String operationA(){
    return "具体元素A的操作";
  }
}
