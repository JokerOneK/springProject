package altay.toktassyn;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ClassicalMusic implements Music{
    Random random = new Random();

    ArrayList<String> song = new ArrayList<>();

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initializating");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destroy");
    }


    @Override
    public String getSong() {
        song.add("First classical melody");
        song.add("Second classical melody");
        song.add("Third classical melody");

        return song.get(random.nextInt(3));
    }
}
