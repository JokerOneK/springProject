package altay.toktassyn;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{
    Random random = new Random();

    ArrayList<String> song = new ArrayList<>();


    @Override
    public String getSong() {
        song.add("First classical melody");
        song.add("Second classical melody");
        song.add("Third classical melody");

        return song.get(random.nextInt(3));
    }
}
