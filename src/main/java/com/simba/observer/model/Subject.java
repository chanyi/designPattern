package com.simba.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Subject {
  //目标类
  private List<Observer> observerList = new ArrayList<>();

  private int state;

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
    notifyAllObserver();
  }

  //增加观察者（订阅者）
  public void attach(Observer observer){
    observerList.add(observer);
  }
  //通知所有观察者
  public void notifyAllObserver(){
    this.observerList.forEach(observer -> observer.update());
  }
}
