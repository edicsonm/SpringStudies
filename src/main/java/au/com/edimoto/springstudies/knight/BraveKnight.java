package au.com.edimoto.springstudies.knight;

/**
 * Created by edicson on 27/11/16.
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
