package songcup.buildlogic;

import javafx.stage.Stage;
import songcup.computationlogic.SongUtilities;
import songcup.problemdomain.SongStorage;
import songcup.userinterface.CheckedScene;
import songcup.userinterface.FinalScene;

public class SongCupBuildLogic {

    private static int match = 0;
    private static int allRounds = 0;

    public static int getMatch() {
        return match;
    }

    public static void setAllRounds(int allRounds) {
        SongCupBuildLogic.allRounds = allRounds;
    }

    public static void increaseMatch() {
        match++;
    }


    public static void countAndCheck(Stage stage) {
        if (match < 4) {
            new CheckedScene(stage);
            increaseMatch();
        } else if (match < 6) {
            SongStorage.setSongMap(SongUtilities.createNewMap());
            new CheckedScene(stage);
            increaseMatch();
        } else if (match == 6) {
            SongStorage.setSongMap(SongUtilities.createNewMap2());
            new CheckedScene(stage);
            increaseMatch();
        } else {
            SongStorage.setSongMap(SongUtilities.createFinalMap());
            new FinalScene(stage);
        }
    }
}

