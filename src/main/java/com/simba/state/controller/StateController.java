package com.simba.state.controller;

import com.simba.state.model.ScoreContext;

public class StateController {

  public static void main(String[] args) {
    ScoreContext scoreContext = new ScoreContext();
    scoreContext.add(10);
    scoreContext.add(30);
    scoreContext.add(30);
    scoreContext.add(30);
    scoreContext.add(30);

  }

}
