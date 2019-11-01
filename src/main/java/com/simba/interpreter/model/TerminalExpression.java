package com.simba.interpreter.model;

public class TerminalExpression implements Expression {

  private String data;

  public TerminalExpression(String data) {
    this.data = data;
  }

  @Override
  public boolean interpreter(String context) {
    if(context.contains(data)){
      return true;
    }
    return false;
  }
}
