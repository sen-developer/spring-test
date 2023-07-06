package am.sen.springcourse.Test1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusicFromList(Genre.CLASSICAL);
        context.close();
    }
}
