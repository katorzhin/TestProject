package com.springTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private PopMusic popMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(PopMusic popMusic, RockMusic rockMusic) {
        this.popMusic = popMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicGenre musicGenre) {
        Random random = new Random();
        int randomNumb = random.nextInt(3);
        if (musicGenre == MusicGenre.POP) {
            System.out.println(popMusic.getSong().get(randomNumb));
        } else {
            System.out.println(rockMusic.getSong().get(randomNumb));
        }
    }
}

