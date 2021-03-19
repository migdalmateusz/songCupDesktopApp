package songcup.computationlogic;

public class Scores {

    private static int heroesScore = 0;
    private static int rebelScore = 0;

    public static void addHeroesScore() {
        heroesScore = heroesScore + 1;
    }
    public static void addRebelScore() {
        rebelScore = rebelScore + 1;
    }

    public static String winnerChose() {
        String winner;
        if (heroesScore > rebelScore) {
            winner = "HEROES";
        } else {
            winner = "REBEL REBEL";
        }
        return winner;
    }
}
