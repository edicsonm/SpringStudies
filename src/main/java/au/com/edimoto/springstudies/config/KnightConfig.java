package au.com.edimoto.springstudies.config;

import au.com.edimoto.springstudies.BraveKnight;
import au.com.edimoto.springstudies.Knight;
import au.com.edimoto.springstudies.Quest;
import au.com.edimoto.springstudies.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by edicson on 27/11/16.
 */


@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
