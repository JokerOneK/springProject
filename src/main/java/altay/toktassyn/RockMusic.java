package altay.toktassyn;


import org.springframework.stereotype.Component;

@Component("musicBean")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind Crie Mary";
    }
}
