package songcup.computationlogic;

public class SongUtilities {

    public static int score = 0;

    public static int getScore() {
        return score;
    }

    public static void addHeroesScore() {
        score++;
        System.out.println(score);
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
