package com.simba.state.model;

public class StateLow extends AbstractState {

  public StateLow(ScoreContext scoreContext){
    this.scoreContext =scoreContext;
    this.score=0;
    this.stateName="不及格";
  }

  public StateLow(AbstractState abstractState){
    this.stateName="不及格";
    this.score=abstractState.score;
    this.scoreContext=abstractState.scoreContext;
  }

  @Override
  public void checkStatus() {
    if (score >= 90) {
      scoreContext.setAbstractState(new StateHigh(this));
    } else if(score >60) {
      scoreContext.setAbstractState(new StateMiddle(this));
    }
  }
}
