package com.simba.state.model;

public class StateHigh extends AbstractState {

  public StateHigh(AbstractState abstractState) {
    this.stateName = "中等";
    this.score = abstractState.score;
    this.scoreContext = abstractState.scoreContext;
  }

  @Override
  public void checkStatus() {
    if (score < 60) {
      scoreContext.setAbstractState(new StateLow(this));
    } else if(score < 90) {
      scoreContext.setAbstractState(new StateMiddle(this));
    }
  }
}
