package com.simba.adapter.model;

public class MediaAdapter implements MediaPlayer {

  private AdvanceMediaPlayer advanceMediaPlayer;

  public MediaAdapter(String type){
    if("vlc".equals(type)){
      advanceMediaPlayer = new VlcPlayer();
    }else if("mp4".equals(type)){
      advanceMediaPlayer = new Mp4Player();
    }
  }

  @Override
  public void play(String type, String fileName) {
    if("vlc".equals(type)){
      advanceMediaPlayer.playVlc(fileName);
    }else if("mp4".equals(type)){
      advanceMediaPlayer.playMp4(fileName);
    }
  }
}
