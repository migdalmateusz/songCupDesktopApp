package songcup.buildlogic;

import javafx.stage.Stage;
import songcup.computationlogic.SongUtilities;
import songcup.userinterface.CheckedScene;
import songcup.userinterface.FinalScene;

public class SongCupBuildLogic {


    public static void runGame(Stage stage) {
        new CheckedScene(stage);
    }

    public static void countAndCheck(Stage stage) {
        if(SongUtilities.getScore()<2) {
            new CheckedScene(stage);
        } else {
            new FinalScene(stage);
        }
    }
}
