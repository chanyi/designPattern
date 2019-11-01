package com.simba.state.model;

public class ScoreContext {

  private AbstractState abstractState;
  public ScoreContext(){
    abstractState = new StateLow(this);
  }

  public AbstractState getAbstractState() {
    return abstractState;
  }

  public void setAbstractState(AbstractState abstractState) {
    this.abstractState = abstractState;
  }

  public void add(int score){
    abstractState.addScore(score);
  }
}
