package altay.toktassyn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml"); // Должен лежать в папке resources


//        Music music = context.getBean("musicBean", Music.class);
//        Music music1 = context.getBean("classicalMusic", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//        musicPlayer1.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }



}
