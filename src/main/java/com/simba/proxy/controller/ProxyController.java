package com.simba.proxy.controller;

import com.simba.proxy.model.Image;
import com.simba.proxy.model.ProxyImage;
import com.simba.proxy.model.RealImage;

public class ProxyController {

  public static  void main(String[] args){

    Image image = new ProxyImage("1.jpg");
    image.display();
    image.display();
    Image image1 = new RealImage("2.jpg");
    image1.display();
    image1.display();
  }
}
