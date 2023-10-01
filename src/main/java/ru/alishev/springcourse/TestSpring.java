package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic music = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic music2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(music == music2);

        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        RockMusic rockMusic2 = context.getBean("rockMusic", RockMusic.class);
        System.out.println(rockMusic == rockMusic2);
        context.close();
    }
}
