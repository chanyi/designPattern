package com.simba.facade.model;

public class ShapeFacade {
  private Shape circle;
  private Shape rectangle;
  private Shape square;

  public ShapeFacade (){
    this.circle = new ShapeCircle();
    this.rectangle = new ShapeRectangle();
    this.square = new ShapeSquare();
  }
  public void drawCircle(){
    circle.draw();
  }
  public void drawRectangle(){
    rectangle.draw();
  }
  public void drawSquare(){
    square.draw();
  }

}
