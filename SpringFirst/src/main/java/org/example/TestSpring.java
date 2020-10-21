package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class);
       //  Music music = context.getBean("musicBean", Music.class);
       // MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(comparison);
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

//        System.out.println("================Homework=================");
//        MusicPlayer musicPlayerList = context.getBean("musicPlayerList", MusicPlayer.class);
//        musicPlayerList.playList();

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic music1 = context.getBean("classicalMusic", ClassicalMusic.class);
//        ClassicalMusic music2 = context.getBean("classicalMusic", ClassicalMusic.class);
//        boolean comparison = music1 == music2;
//        System.out.println(comparison);

        context.close();
    }
}
