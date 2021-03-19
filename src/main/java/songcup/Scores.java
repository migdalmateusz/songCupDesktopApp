package songcup;

public class Scores {

    private static int heroesScore = 0;
    private static int rebelScore = 0;

    public static void addHeroesScore() {
        heroesScore = heroesScore + 1;
        System.out.println(heroesScore);
    }
    public static void addRebelScore() {
        rebelScore = rebelScore + 1;
        System.out.println(rebelScore);
    }
}
