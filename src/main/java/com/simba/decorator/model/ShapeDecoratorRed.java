package com.simba.decorator.model;

public class ShapeDecoratorRed extends ShapeDecorator {

  public ShapeDecoratorRed(Shape shape) {
    super(shape);
  }

  @Override
  public void draw() {
    shape.draw();
    setRedBorder(shape);
  }

  private void setRedBorder(Shape shape){
    System.out.println("red border");
  }
}
