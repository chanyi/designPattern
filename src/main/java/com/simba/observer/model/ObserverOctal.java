package com.simba.observer.model;

public class ObserverOctal extends Observer {

  public ObserverOctal(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }
  @Override
  public void update() {
    System.out.println("8进制观察者模型更新：binary string:");
    System.out.println(Integer.toOctalString(subject.getState()));
  }
}
