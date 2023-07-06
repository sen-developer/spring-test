package am.sen.springcourse.Test1;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    String[] musicArr = {"classical - some classic music 1","classical - some classic music 2","classical - some classic music 3"};
    public String getSong() {
        return "classical - some classic music";
    }
    public String[] getMusicList(){
        return this.musicArr;
    }
}
