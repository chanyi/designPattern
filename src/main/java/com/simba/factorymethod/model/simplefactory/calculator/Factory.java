package com.simba.factorymethod.model.simplefactory.calculator;


public class Factory {
  public static Calculator getCalculator(String oper){
    //简单工厂模式直接在工厂类中生成对应的类实例
    if("+".equals(oper)){
      return new Plus();
    }else if("-".equals(oper)){
      return  new Minus();
    }else{
      return null;
    }
  }
}
