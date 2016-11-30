package au.com.edimoto.springstudies.soundsystem.configuration;


import au.com.edimoto.springstudies.soundsystem.beans.CDPlayer;
import au.com.edimoto.springstudies.soundsystem.beans.CompactDisc;
import au.com.edimoto.springstudies.soundsystem.beans.MediaPlayer;
import au.com.edimoto.springstudies.soundsystem.beans.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by torree on 30/11/2016.
 */
@Configuration
//@ComponentScan(basePackages="au.com.edimoto.springstudies.soundsystem.beans")
public class CDPlayerConfig {
    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }
}
