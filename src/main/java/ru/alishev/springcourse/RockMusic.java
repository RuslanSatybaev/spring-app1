package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {
    private final List<String> songs = new ArrayList<>();

    {
        songs.add("Wind cries Mary");
        songs.add("Paint it black");
        songs.add("Can't seem to make you mine");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
