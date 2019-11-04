package com.simba.observer.controller;

import com.simba.observer.model.ObserverBinary;
import com.simba.observer.model.ObserverHexa;
import com.simba.observer.model.ObserverOctal;
import com.simba.observer.model.Subject;

public class ObserverController {

  public static void main(String[] args) {
    Subject subject = new Subject();

    ObserverBinary observerBinary = new ObserverBinary(subject);
    ObserverOctal observerOctal = new ObserverOctal(subject);
    ObserverHexa observerHexa = new ObserverHexa(subject);

    //通知所有观察者
    subject.setState(19);

    subject.setState(15);
  }

}
