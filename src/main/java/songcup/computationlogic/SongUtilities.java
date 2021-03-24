package songcup.computationlogic;

import songcup.buildlogic.SongCupBuildLogic;
import songcup.problemdomain.Song;
import songcup.problemdomain.SongStorage;

import java.util.HashMap;
import java.util.Map;

public class SongUtilities {

    private static final Map<Integer, Integer> mapForButtonOne = createMapForButtonOne();
    private static final Map<Integer, Integer> mapForButtonTwo = createMapForButtonTwo();

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
        SongStorage.getSongMap().get(getMapForButtonOne().get(SongCupBuildLogic.getMatch()-1))
                .setPoint(SongStorage.getSongMap().get(getMapForButtonOne().get(SongCupBuildLogic.getMatch()-1)).getPoint()+1);
    }

    public static void setPointTwo() {
        SongStorage.getSongMap().get(getMapForButtonTwo().get(SongCupBuildLogic.getMatch()-1))
                .setPoint(SongStorage.getSongMap().get(getMapForButtonTwo().get(SongCupBuildLogic.getMatch()-1)).getPoint()+1);
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

    public static Map<Integer, Song> createNewMap2() {
        Map<Integer, Song> newSongMap2 = new HashMap<>();
        int id = 0;
        for (Map.Entry<Integer, Song> entry : SongStorage.getSongMap().entrySet()) {
            if (entry.getValue().getPoint() > 1) {
                id++;
                newSongMap2.put(id, entry.getValue());
            }
        }
        return newSongMap2;
    }

    public static Map<Integer, Song> createFinalMap() {
        Map<Integer, Song> newSongMap = new HashMap<>();
        int id = 0;
        for (Map.Entry<Integer, Song> entry : SongStorage.getSongMap().entrySet()) {
            if (entry.getValue().getPoint() > 2) {
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
