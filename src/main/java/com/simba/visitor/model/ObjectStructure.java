package com.simba.visitor.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObjectStructure {

  private List<Element> list = new ArrayList<>();

  public void accept(Visitor visitor){
    Iterator<Element> iterator = list.iterator();
    while (iterator.hasNext()){
      ((Element) iterator.next()).accept(visitor);
    }
  }

  public void add (Element element){
    list.add(element);
  }
  public void remove(Element element){
    list.remove(element);
  }

}
