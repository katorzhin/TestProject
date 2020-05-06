package com.springTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer firstMusicPlayer =context.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer secondMusicPlayer =context.getBean("musicPlayer",MusicPlayer.class);

        boolean comparison = firstMusicPlayer==secondMusicPlayer;

        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
        System.out.println(comparison);

        firstMusicPlayer.setVolume(11);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

//        System.out.println(firstMusicPlayer.getName());
//        System.out.println(firstMusicPlayer.getVolume());

        context.close();
    }
}
