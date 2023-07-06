package am.sen.springcourse.Test1;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    String[] musicArr = {"Kaleo - way down we go","Muse - Butterflies And Hurricanes","rockmusic - some rock music 3"};
    public String getSong() {
        return "Kaleo - way down we go";
    }
    public String[] getMusicList(){
        return musicArr;
    }
}
