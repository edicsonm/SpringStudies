package au.com.edimoto.springstudies.soundsystem;

import static org.junit.Assert.*;

import au.com.edimoto.springstudies.soundsystem.beans.CompactDisc;
import au.com.edimoto.springstudies.soundsystem.beans.MediaPlayer;
import au.com.edimoto.springstudies.soundsystem.configuration.CDPlayerConfig;
import org.junit.Rule;
import org.junit.Test;

import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by torree on 30/11/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log =  new StandardOutputStreamLog();

    @Autowired(required = true)
    private MediaPlayer player;

    @Autowired(required = true)
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void play() {
        player.play();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n",log.getLog());

    }
}
