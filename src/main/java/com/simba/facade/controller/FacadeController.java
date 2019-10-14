package com.simba.facade.controller;

import com.simba.decorator.model.Shape;
import com.simba.facade.model.ShapeFacade;

public class FacadeController {

  public static void main(String[] args) {
    ShapeFacade shapeFacade = new ShapeFacade();
    shapeFacade.drawCircle();
    shapeFacade.drawRectangle();
    shapeFacade.drawSquare();
  }
}
