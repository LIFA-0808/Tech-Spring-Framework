package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    private List<Music> musicList;


    private String name;
    private int volume;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getVolume() { return volume; }
    public void setVolume(int volume) { this.volume = volume; }

    public List<Music> getMusicList() { return musicList; }
    public void setMusicList(List<Music> musicList) { this.musicList = musicList; }

    // IoC
    @Autowired
    public MusicPlayer (ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }
//    // Пустой конструктор для внедрения зависимости через setter
//    public MusicPlayer () {}
//
//    public void setMusic (Music music) {
//        this.music = music;
//    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong() + ", " + rockMusic.getSong();
    }
    public void playList() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
