package com.simba.factorymethod.controller;

import com.simba.factorymethod.model.ConcreteAbstractFactory1;
import com.simba.factorymethod.model.ConcreteProduct1;
import com.simba.factorymethod.model.Product;
import com.simba.factorymethod.model.calculator.Calculator;
import com.simba.factorymethod.model.calculator.Factory;

public class FactoryController {


  public static void main(String[] args){
    ConcreteAbstractFactory1 concreteAbstractFactory1 = new ConcreteAbstractFactory1();
    Product product = concreteAbstractFactory1.newProduct();
    product.show();

    //计算器
    Calculator calculator = Factory.getCalculator("-");
    double result = calculator.calculate(1.0,2.0);
    System.out.println("re:"+result);

  }
}
