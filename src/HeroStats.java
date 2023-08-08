import java.util.ArrayList;

public class HeroStats {


    private Hero hero;
    private int wins;
    private int loses;
    private float winRate;
    private ArrayList<Boolean> results;
    public HeroStats(Hero hero, int wins, int loses, float winRate, ArrayList<Boolean> results) {
        this.hero = hero;
        this.wins = wins;
        this.loses = loses;
        this.winRate = winRate;
        this.results = results;
    }

    public int getWins() {
        return wins;
    }

    public Hero getHero() {
        return hero;
    }

    public float getWinRate() {
        return winRate;
    }
}
