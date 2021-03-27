package songcup.problemdomain;

import java.util.HashMap;
import java.util.Map;

import com.wrapper.spotify.model_objects.specification.Track;
import songcup.spotifyapi.GetArtistsTopTracksExample;

public class SongStorage {

    private static Map<Integer, Song> songMap;

    private static Track[] tracks = GetArtistsTopTracksExample.getArtistsTopTracks_Sync();

    public static Map<Integer, Song> createMap() {
        Song[] mySongs = new Song[8];
        for (int i = 0; i < 8; i++) {
            String[] titles = tracks[i].getName().split("-");
            mySongs[i] = new Song(titles[0], 0, "video");
        }
        Map<Integer, Song> mapSong = new HashMap<>();
        for (int i = 1; i < 9; i++) {
            mapSong.put(i, mySongs[i - 1]);
        }
        return mapSong;
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
            size = size / 2;
        }
        return numberOfRounds;
    }

}
