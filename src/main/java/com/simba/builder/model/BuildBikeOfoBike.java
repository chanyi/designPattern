package com.simba.builder.model;

public class BuildBikeOfoBike implements BuildBike{

  private Bike ofoBike = new Bike();

  @Override
  public void buildFrame() {
    ofoBike.setFrame("ofobike frame");
  }

  @Override
  public void buildSeat() {
    ofoBike.setSeat("ofobike seat");
  }

  @Override
  public void buildTire() {
    ofoBike.setTire("ofobike tire");
  }

  @Override
  public Bike createBike() {
    return this.ofoBike;
  }
}
