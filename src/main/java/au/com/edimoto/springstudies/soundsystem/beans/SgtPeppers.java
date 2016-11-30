package au.com.edimoto.springstudies.soundsystem.beans;

import org.springframework.stereotype.Component;

/**
 * Created by torree on 30/11/2016.
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
