package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    private Music music3;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("popMusic") Music music2, @Qualifier("classicalMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic(Genre genre) {
        switch (genre) {
            case ROCK:
                return "Playing: " + music1.getSong();
            case POP:
                return "Playing: " + music2.getSong();
            case CLASSICAL:
                return "Playing: " + music3.getSong();
        }
        return "Playing: " + music1.getSong() + ", " + music2.getSong() + ", " + music3.getSong();
    }

}
