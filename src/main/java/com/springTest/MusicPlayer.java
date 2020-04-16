package com.springTest;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
//
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public MusicPlayer() {
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public void playMusic() {
        for (Music list: musicList) {
            System.out.println("Playing: " + list.getSong());
        }

    }
}