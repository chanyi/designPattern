package com.simba.interpreter.model;

public class AndExpression implements Expression {

  private Expression expression1= null;
  private Expression expression2= null;

  public AndExpression(Expression expression1, Expression expression2) {
    this.expression1 = expression1;
    this.expression2 = expression2;
  }

  @Override
  public boolean interpreter(String context) {
    return expression1.interpreter(context) && expression2.interpreter(context);
  }
}
