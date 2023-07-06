package am.sen.springcourse.Test1;

import org.springframework.stereotype.Component;

@Component
public interface Music {
    String[] getMusicList();
    String getSong();
}
