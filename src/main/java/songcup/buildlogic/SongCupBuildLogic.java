package songcup.buildlogic;

import songcup.computationlogic.SongUtilities;
import songcup.problemdomain.SongStorage;

public class SongCupBuildLogic {

    private static int match = 0;

    public static int getMatch() {
        return match;
    }

    public static void increaseMatch() {
        match++;
    }

    public static void countAndCheck() {
        if (match == 4) {
            SongStorage.setSongMap(SongUtilities.createNewMap());
        } else if (match == 6) {
            SongStorage.setSongMap(SongUtilities.createNewMap2());
        }
    }
}

