package songcup.buildlogic;

import javafx.stage.Stage;
import songcup.computationlogic.SongUtilities;
import songcup.problemdomain.SongStorage;
import songcup.userinterface.CheckedScene;
import songcup.userinterface.FinalScene;

public class SongCupBuildLogic {

    private static int round = 0;

    public static void increaseRound() {
        round++;
    }

    public static int getRound() {
        return round;
    }

    public static void countAndCheck(Stage stage) {
        if(round<2) {
            new CheckedScene(stage);
            increaseRound();
        } else if (round==2) {
            SongStorage.setSongMap(SongUtilities.createNewMap());
            new CheckedScene(stage);
            increaseRound();
        } else {
            SongStorage.setSongMap(SongUtilities.createFinalMap());
            new FinalScene(stage);
        }
    }
}
