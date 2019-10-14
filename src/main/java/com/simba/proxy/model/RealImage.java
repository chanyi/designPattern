package com.simba.proxy.model;

public class RealImage implements Image {

  private String fileName;

  public RealImage(String fileName){
    this.fileName = fileName;
    loadFromDisk(fileName);
  }

  @Override
  public void display() {
    System.out.println("实现display方法");
  }

  private void loadFromDisk(String fileName){
    System.out.println("loading file"+ fileName);
  }

}
