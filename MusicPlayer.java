package am.sen.springcourse.Test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    Music cMusic;
    Music rMusic;
    @Autowired
    MusicPlayer(@Qualifier("classicalMusic") Music cMusic,@Qualifier("rockMusic")Music rMusic){
        this.cMusic = cMusic;
        this.rMusic = rMusic;
    }


    void playMusic(Enum en){
        if(en instanceof Genre){
            System.out.println(en==Genre.ROCK?this.rMusic.getSong():this.cMusic.getSong());
//            System.out.println(cMusic.getSong() + " " + rMusic.getSong());
        }
    }

    void playMusicFromList(Enum en){
        Random random = new Random();
        if(en instanceof Genre){
            if(en==Genre.ROCK){
                final int index = Math.abs(random.nextInt(3));
                System.out.println(rMusic.getMusicList()[index]);
                return;
            }
            if(en==Genre.CLASSICAL){
                final int index = Math.abs(random.nextInt(3));
                System.out.println(rMusic.getMusicList()[index]);
                return;
            }
        }
    }
}
