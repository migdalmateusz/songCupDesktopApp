package songcup.computationlogic;

import songcup.problemdomain.Song;

import java.util.Map;

public class SongStorage {

    private static Map<Song, Integer> songMap;

    public Map<Song, Integer> getSongMap() {
        return songMap;
    }
}
