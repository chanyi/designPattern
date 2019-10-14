package com.simba.adapter.controller;

import com.simba.adapter.model.MediaPlayerImpl;

public class AdapterContoller {

  public static void main(String[] args) {
    System.out.println("main");
    MediaPlayerImpl mediaPlayer = new MediaPlayerImpl();
    mediaPlayer.play("mp3","ad");
    mediaPlayer.play("mp4","ad");
    mediaPlayer.play("vlc","ad");
    mediaPlayer.play("mp5","ad");
  }

}
