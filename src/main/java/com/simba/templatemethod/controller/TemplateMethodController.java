package com.simba.templatemethod.controller;

import com.simba.templatemethod.model.Cricket;
import com.simba.templatemethod.model.Game;
import com.simba.templatemethod.model.Football;

public class TemplateMethodController {

  public static void main(String[] args) {
    Game football = new Football();
    football.play();
    Game cricket = new Cricket();
    cricket.play();
  }
}
