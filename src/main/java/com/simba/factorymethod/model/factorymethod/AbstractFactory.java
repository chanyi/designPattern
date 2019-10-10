package com.simba.factorymethod.model.factorymethod;

public interface AbstractFactory {
  //有一个抽象工厂，两个具体工厂，分别生产两个产品
  //只生产一个产品
  Product newProduct();
}
