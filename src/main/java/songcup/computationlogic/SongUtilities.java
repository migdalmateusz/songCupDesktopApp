package songcup.computationlogic;

import songcup.buildlogic.SongCupBuildLogic;
import songcup.problemdomain.Song;
import songcup.problemdomain.SongStorage;

import java.util.HashMap;
import java.util.Map;

public class SongUtilities {

    public static Song getSongOne() {
        if (SongCupBuildLogic.getRound() == 0) {
            return SongStorage.getSongMap().get(1);
        } else if (SongCupBuildLogic.getRound() == 1) {
            return SongStorage.getSongMap().get(3);
        } else {
            return SongStorage.getSongMap().get(1);
        }
    }

    public static Song getSongTwo() {
        if (SongCupBuildLogic.getRound() == 0) {
            return SongStorage.getSongMap().get(2);
        } else if (SongCupBuildLogic.getRound() == 1) {
            return SongStorage.getSongMap().get(4);
        } else {
            return SongStorage.getSongMap().get(2);
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
}
