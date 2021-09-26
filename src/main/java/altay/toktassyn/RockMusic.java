package altay.toktassyn;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;


public class RockMusic implements Music{
    Random random = new Random();

    ArrayList<String> song = new ArrayList<>();


    @Override
    public String getSong() {
        song.add("First rock melody");
        song.add("Second rock melody");
        song.add("Third rock melody");

        return song.get(random.nextInt(3));
    }
}
