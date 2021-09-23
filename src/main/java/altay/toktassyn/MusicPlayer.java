package altay.toktassyn;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

enum enumMusic{
    ROCK,
    CLASSICAL
}

@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;

    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(enumMusic mus) {
        if(mus == enumMusic.ROCK){
            return ("Playing: " + music1.getSong());
        }

        if(mus == enumMusic.CLASSICAL){
            return ("Playing: " + music2.getSong());
        }

        return("Playing: " + music1.getSong() + ", " + music2.getSong());

    }
}
