package com.simba.builder.model;

public class BuildBikeMobike implements BuildBike{

  private Bike mobike = new Bike();

  @Override
  public void buildFrame() {
    mobike.setFrame("mobike frame");
  }

  @Override
  public void buildSeat() {
    mobike.setSeat("mobike seat");
  }

  @Override
  public void buildTire() {
    mobike.setTire("mobike tire");
  }

  @Override
  public Bike createBike() {
    return this.mobike;
  }
}
