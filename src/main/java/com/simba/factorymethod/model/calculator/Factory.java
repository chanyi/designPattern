package com.simba.factorymethod.model.calculator;


public class Factory {
  public static Calculator getCalculator(String oper){
    if("+".equals(oper)){
      return new Plus();
    }else if("-".equals(oper)){
      return  new Minus();
    }else{
      return null;
    }
  }
}
