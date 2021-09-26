package altay.toktassyn;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

enum enumMusic{
    ROCK,
    CLASSICAL
}


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> music = new ArrayList<>();

//    private Music music1;
//    private Music music2;

    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

//    public MusicPlayer(@Qualifier("rockMusic") Music music1,
//                       @Qualifier("classicalMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }

    public String playMusic() {
        Random random = new Random();

        return("Playing: " + music.get(random.nextInt(2)));

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
