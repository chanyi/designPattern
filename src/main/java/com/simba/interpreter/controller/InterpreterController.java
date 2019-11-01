package com.simba.interpreter.controller;

import com.simba.interpreter.model.AndExpression;
import com.simba.interpreter.model.Expression;
import com.simba.interpreter.model.OrExpression;
import com.simba.interpreter.model.TerminalExpression;

public class InterpreterController {

  //定义一个规则：robert john是男性
  public static Expression getMaleExpression(){
    Expression robert = new TerminalExpression("Robert");
    Expression john = new TerminalExpression("John");
    return new OrExpression(robert,john);
  }
  //规则：
  public static Expression getMarriedWomanExpression(){
    Expression julie = new TerminalExpression("Julie");
    Expression married = new TerminalExpression("married");
    return new AndExpression(julie,married);
  }
  public static void main(String[] args) {
    Expression isMale = getMaleExpression();
    Expression isMarriedWoman = getMarriedWomanExpression();
    System.out.println("John is male?");
    System.out.println(isMale.interpreter("John"));
    System.out.println("Julie is married?");
    System.out.println(isMarriedWoman.interpreter("married Julie"));

  }
}
