package com.simba.adapter.model;

public class VlcPlayer implements AdvanceMediaPlayer {

  @Override
  public void playVlc(String fileName) {
    System.out.println("playVlc play vlc file " +fileName);
  }

  @Override
  public void playMp4(String fileName) {

  }
}
