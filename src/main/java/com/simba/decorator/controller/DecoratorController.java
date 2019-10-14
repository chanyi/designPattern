package com.simba.decorator.controller;

import com.simba.decorator.model.Shape;
import com.simba.decorator.model.ShapeCircle;
import com.simba.decorator.model.ShapeDecorator;
import com.simba.decorator.model.ShapeDecoratorRed;

public class DecoratorController {

  public static void main(String[] args) {
    Shape shape = new ShapeCircle();
    ShapeDecorator shapeDecorator = new ShapeDecoratorRed(shape);
    shapeDecorator.draw();

  }
}
