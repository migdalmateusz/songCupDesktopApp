package songcup.problemdomain;

import java.util.HashMap;
import java.util.Map;

public class SongStorage {
    private static Map<Integer, Song> songMap;


    public static Map<Integer, Song> createMap() {
        Map<Integer, Song> mapSong = new HashMap<>();
        Song heroes = new Song("Heroes", 0);
        Song rebel = new Song("Rebel Rebel", 0);
        Song starman = new Song("Starman", 0);
        Song oddity = new Song("Space Oddity", 0);
        Song changes = new Song("Changes", 0);
        Song ladyStardust = new Song("Lady stardust", 0);
        Song warszawa = new Song("Warszaw", 0);
        Song ashesToAshes = new Song("Ashes to Ashes", 0);
        mapSong.put(1, heroes);
        mapSong.put(2, rebel);
        mapSong.put(3, starman);
        mapSong.put(4, oddity);
        mapSong.put(5, changes);
        mapSong.put(6, ladyStardust);
        mapSong.put(7, warszawa);
        mapSong.put(8, ashesToAshes);

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

    public static int getNumberOfRounds(Map<Integer, Song> map) {
        int size = map.size();
        int numberOfRounds = 0;
        while (size > 2) {
            numberOfRounds++;
            size = size/2;
        }
        return numberOfRounds;
    }
}
