package com.simba.adapter.model;

public class Mp4Player implements AdvanceMediaPlayer {

  @Override
  public void playVlc(String fileName) {

  }

  @Override
  public void playMp4(String fileName) {
    System.out.println("Mp4player play mp4 "+fileName);
  }
}
