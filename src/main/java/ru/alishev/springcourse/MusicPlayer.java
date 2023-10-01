package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music,
                       @Qualifier("rockMusic") Music music2) {
        this.music = music;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing: " + music.getSong() + ", " + music2.getSong();
    }
}
