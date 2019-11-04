package com.simba.visitor.model;

public class VisitorA implements Visitor{
  public  void visitor(ElementA elementA){
    System.out.println("访问者A访问元素A：：："+elementA.operationA());
  }
  public void visitor(ElementB elementB){
    System.out.println("访问者A访问元素B：：："+elementB.operationB());
  }
}
