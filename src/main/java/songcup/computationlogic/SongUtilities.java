package songcup.computationlogic;

import songcup.buildlogic.SongCupBuildLogic;
import songcup.problemdomain.Song;
import songcup.problemdomain.SongStorage;

import java.util.HashMap;
import java.util.Map;

public class SongUtilities {

    private static Map<Integer, Integer> mapForButtonOne = createMapForButtonOne();
    private static Map<Integer, Integer> mapForButtonTwo = createMapForButtonTwo();

    public static Map<Integer, Integer> getMapForButtonOne() {
        return mapForButtonOne;
    }

    public static Map<Integer, Integer> getMapForButtonTwo() {
        return mapForButtonTwo;
    }

    public static Song getSongOne() {
        return SongStorage.getSongMap().get(getMapForButtonOne().get(SongCupBuildLogic.getMatch()));
    }

    public static Song getSongTwo() {
        return SongStorage.getSongMap().get(getMapForButtonTwo().get(SongCupBuildLogic.getMatch()));
    }

    public static void setPointOne() {
        if (SongCupBuildLogic.getMatch() == 1) {
            SongStorage.getSongMap().get(1).setPoint(1);
        } else if (SongCupBuildLogic.getMatch() == 2) {
            SongStorage.getSongMap().get(3).setPoint(1);
        } else if (SongCupBuildLogic.getMatch() == 3) {
            SongStorage.getSongMap().get(5).setPoint(1);
        } else if (SongCupBuildLogic.getMatch() == 4) {
            SongStorage.getSongMap().get(7).setPoint(1);
        } else if (SongCupBuildLogic.getMatch() == 5) {
            SongStorage.getSongMap().get(1).setPoint(2);
        } else if (SongCupBuildLogic.getMatch() == 6) {
            SongStorage.getSongMap().get(3).setPoint(2);
        } else {
            SongStorage.getSongMap().get(1).setPoint(3);
        }
    }

    public static void setPointTwo() {
        if (SongCupBuildLogic.getMatch() == 1) {
            SongStorage.getSongMap().get(2).setPoint(1);
        } else if (SongCupBuildLogic.getMatch() == 2) {
            SongStorage.getSongMap().get(4).setPoint(1);
        } else if (SongCupBuildLogic.getMatch() == 3) {
            SongStorage.getSongMap().get(6).setPoint(1);
        } else if (SongCupBuildLogic.getMatch() == 4) {
            SongStorage.getSongMap().get(8).setPoint(1);
        } else if (SongCupBuildLogic.getMatch() == 5) {
            SongStorage.getSongMap().get(2).setPoint(2);
        } else if (SongCupBuildLogic.getMatch() == 6) {
            SongStorage.getSongMap().get(4).setPoint(2);
        } else {
            SongStorage.getSongMap().get(2).setPoint(3);
        }
    }


    public static Map<Integer, Song> createNewMap() {
        Map<Integer, Song> newSongMap = new HashMap<>();
        int id = 0;
        for (Map.Entry<Integer, Song> entry : SongStorage.getSongMap().entrySet()) {
            if (entry.getValue().getPoint() > 0) {
                id++;
                newSongMap.put(id, entry.getValue());
            }
        }
        return newSongMap;
    }

    public static Map<Integer, Song> createFinalMap() {
        Map<Integer, Song> newSongMap = new HashMap<>();
        int id = 0;
        for (Map.Entry<Integer, Song> entry : SongStorage.getSongMap().entrySet()) {
            if (entry.getValue().getPoint() > 1) {
                id++;
                newSongMap.put(id, entry.getValue());
            }
        }
        return newSongMap;
    }

    public static Map<Integer, Integer> createMapForButtonOne() {
        Map<Integer, Integer> mapForButtonOne = new HashMap<>();
        int value = 1;
        int iterator = 1;
        for (int i = 0; i < 8; i++) {
            if (iterator == 5 || iterator == 7 || iterator == 8 ) {
                value = 1;
            }
            mapForButtonOne.put(i, value);
            value = value + 2;
            iterator++;
        }
        return mapForButtonOne;
    }

    public static Map<Integer, Integer> createMapForButtonTwo() {
        Map<Integer, Integer> mapForButtonTwo = new HashMap<>();
        int value = 2;
        int iterator = 1;
        for (int i = 0; i < 8; i++) {
            if (iterator == 5 || iterator == 7 || iterator == 8 ) {
                value = 2;
            }
            mapForButtonTwo.put(i, value);
            value = value + 2;
            iterator++;
        }
        return mapForButtonTwo;
    }

}
