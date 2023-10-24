package ru.alishev.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.alishev.springcourse.config.SpringConfig;
import ru.alishev.springcourse.genres.ClassicalMusic;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic music = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic music2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(music == music2);

        context.close();
    }
}
