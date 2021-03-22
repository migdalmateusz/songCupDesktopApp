package songcup.problemdomain;

import java.util.HashMap;
import java.util.Map;

public class SongStorage {
    private static Map<Integer, Song> songMap = createMap();


    public static Map<Integer, Song> createMap() {
        Map<Integer, Song> mapSong = new HashMap<>();
        Song heroes = new Song("Heroes", 0);
        Song rebel = new Song("Rebel Rebel", 0);
        Song starman = new Song("Starman", 0);
        Song oddity = new Song("Space Oddity", 0);
        mapSong.put(1, heroes);
        mapSong.put(2, rebel);
        mapSong.put(3, starman);
        mapSong.put(4, oddity);

        return mapSong;
    }

    public static Song getSong(int a) {
        return songMap.get(a);
    }

    public static Map<Integer, Song> getSongMap() {
        return songMap;
    }

    public static void setSongMap(Map<Integer, Song> songMap) {
        SongStorage.songMap = songMap;
    }
}
