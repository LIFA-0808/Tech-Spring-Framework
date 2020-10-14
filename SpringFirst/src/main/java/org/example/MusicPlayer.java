package org.example;

import java.util.List;

public class MusicPlayer {
    private Music music;
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
    public MusicPlayer (Music music) {
        this.music = music;
    }
    // Пустой конструктор для внедрения зависимости через setter
    public MusicPlayer () {}

    public void setMusic (Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
    public void playList() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
