package songcup.buildlogic;

import javafx.stage.Stage;
import songcup.computationlogic.SongUtilities;
import songcup.problemdomain.Song;
import songcup.problemdomain.SongStorage;
import songcup.userinterface.CheckedScene;
import songcup.userinterface.FinalScene;

import java.util.Map;

public class SongCupBuildLogic {

    private static int match = 0;
    private static int allRounds = 0;
    private static int round = 0;

    public static int getMatch() {
        return match;
    }

    public static int getAllRounds() {
        return allRounds;
    }

    public static void setAllRounds(int allRounds) {
        SongCupBuildLogic.allRounds = allRounds;
    }

    public static void increaseMatch() {
        match++;
    }

    public static int getRound() {
        return round;
    }

    public static void increaseRound() {
        if (match == Math.pow(2, getAllRounds())) {
            allRounds--;
            round++;
        }
    }

    public static void countAndCheck(Stage stage) {
        if (match < 4) {
            new CheckedScene(stage);
            increaseMatch();
            for (Map.Entry<Integer, Song> entry : SongStorage.getSongMap().entrySet()) {
                System.out.println(entry.getValue().getTitle());
                System.out.println(entry.getValue().getPoint());
            }
        } else if (match < 6) {
            SongStorage.setSongMap(SongUtilities.createNewMap());
            new CheckedScene(stage);
            increaseMatch();
            for (Map.Entry<Integer, Song> entry : SongStorage.getSongMap().entrySet()) {
                System.out.println(entry.getValue().getTitle());
                System.out.println(entry.getValue().getPoint());
            }
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

