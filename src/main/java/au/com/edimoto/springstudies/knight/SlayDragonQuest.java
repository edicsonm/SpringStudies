package au.com.edimoto.springstudies.knight;

import java.io.PrintStream;

/**
 * Created by edicson on 27/11/16.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
