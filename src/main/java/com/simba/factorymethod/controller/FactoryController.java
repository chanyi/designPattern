package com.simba.factorymethod.controller;

import com.simba.factorymethod.model.factorymethod.ConcreteAbstractFactory1;
import com.simba.factorymethod.model.factorymethod.Product;
import com.simba.factorymethod.model.simplefactory.calculator.Calculator;
import com.simba.factorymethod.model.simplefactory.calculator.Factory;

public class FactoryController {


  public static void main(String[] args){
    ConcreteAbstractFactory1 concreteAbstractFactory1 = new ConcreteAbstractFactory1();
    Product product = concreteAbstractFactory1.newProduct();
    product.show();

    //通过传入的参数选择具体工厂
    Calculator calculator = Factory.getCalculator("-");
    double result = calculator.calculate(1.0,2.0);
    System.out.println("re:"+result);

  }
}
