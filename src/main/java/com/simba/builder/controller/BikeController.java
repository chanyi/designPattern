package com.simba.builder.controller;

import com.simba.builder.model.Bike;
import com.simba.builder.model.BuildBikeMobike;
import com.simba.builder.model.BuildBikeOfoBike;
import com.simba.builder.model.Director;

public class BikeController {

  public static void main(String[] args){
    BuildBikeMobike buildBikeMobike = new BuildBikeMobike();
    BuildBikeOfoBike buildBikeOfoBike = new BuildBikeOfoBike();
    Director director = new Director(buildBikeMobike);
    Bike bike = director.directorBuildBike();

    Director director1 = new Director(buildBikeOfoBike);
    Bike bike1 = director1.directorBuildBike();

    System.out.println("bike："+bike);
    System.out.println("bike1："+bike1);
  }
}
