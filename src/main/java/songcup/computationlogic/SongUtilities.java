package songcup.computationlogic;

import songcup.problemdomain.Song;

public class SongUtilities {

    public static int score = 0;

    public static int getScore() {
        return score;
    }

    public static void addHeroesScore() {
        score++;
        System.out.println(score);
    }

    public static String getSong(int a) {
        Song[] songList = new Song[4];
        songList[0] = new Song("Heroes");
        songList[1] = new Song("Rebel Rebel");
        songList[2] = new Song("Starman");
        songList[3] = new Song("Space Oddity");
        return songList[a].getTitle();

    }

//    public static void addRebelScore() {
//        songMap.put(new Song("Rebel"), 1);
//    }
//
//    public static void addStarmanScore() {
//        songMap.put(new Song("Starman"), 1);
//    }
//
//    public static void addOddityScore() {
//        songMap.put(new Song("Oddity"), 1);
//    }

}
