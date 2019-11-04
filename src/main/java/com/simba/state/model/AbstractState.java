package com.simba.state.model;

public abstract class AbstractState {

  protected ScoreContext scoreContext;
  //状态名
  protected   String stateName;
  //分数（状态值）
  protected int score;
  //检查当前状态
  public abstract void checkStatus();

  public void addScore(int x){
    score+=x;
    System.out.println("加上"+x+"分,现在的分数为"+this.score);
    checkStatus();
    System.out.println("当前的状态："+stateName);
  }

}
