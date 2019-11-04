package com.simba.observer.model;

public class ObserverHexa extends Observer {

  public ObserverHexa(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("16进制观察者模型更新：binary string:");
    System.out.println(Integer.toHexString(subject.getState()));
  }
}
