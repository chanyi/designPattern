package com.simba.visitor.model;

public interface Element {
  void accept(Visitor visitor);
}
