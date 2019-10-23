package com.simba.templatemethod.model;

public class Football extends Game{

  @Override
  public void initializa() {
    System.out.println("football init");
  }

  @Override
  public void startPlay() {
    System.out.println("football start");
  }

  @Override
  public void endPlay() {
    System.out.println("football end");
  }
}
