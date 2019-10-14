package com.simba.bridge.controller;

import com.simba.bridge.model.Color;
import com.simba.bridge.model.ColorRed;
import com.simba.bridge.model.Pen;
import com.simba.bridge.model.SmallPen;

public class BridgeController {

  public static void main(String[] args) {
    Color color = new ColorRed();
    Pen pen = new SmallPen();
    pen.setColor(color);
    pen.draw("aa");
  }
}
