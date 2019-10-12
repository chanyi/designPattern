package com.simba.builder.model;

public interface BuildBike {
  void buildFrame();
  void buildSeat();
  void buildTire();
  Bike createBike();
}
