package com.simba.builder.model;

public class Director {
  private BuildBike directorBuildBike ;
  public Director(BuildBike buildBike){
    directorBuildBike = buildBike;
  }
  public Bike directorBuildBike(){
    directorBuildBike.buildFrame();
    directorBuildBike.buildSeat();
    directorBuildBike.buildTire();
    return directorBuildBike.createBike();
  }
}
