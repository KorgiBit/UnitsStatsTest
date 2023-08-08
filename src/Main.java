import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero("Коркес");
        Hero hero1 = new Hero("Луизианна");

        HeroStats heroStats = new HeroStats(hero, 1, 1, 0.8f, new ArrayList<>(Arrays.asList(true, false, true)));
        HeroStats heroStats1 = new HeroStats(hero1, 1, 1,0.4f, new ArrayList<>(Arrays.asList(true, false, true)));

        ArrayList<HeroStats> heroStatsArrayList = new ArrayList<>();
        heroStatsArrayList.add(heroStats);
        heroStatsArrayList.add(heroStats1);

        Printer.PrintMostSucceedHero(heroStatsArrayList);

    }
}