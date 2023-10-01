package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private final Music music;
    private final Music music2;

    public MusicPlayer(@Qualifier("classicalMusic") Music music,
                       @Qualifier("rockMusic") Music music2) {
        this.music = music;
        this.music2 = music2;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic(MusicGenre genre) {

    }
}
