import java.util.ArrayList;

public class Printer {
        // как-то обрабатывает значения и выводит, например
    public static void PrintMostSucceedHero(ArrayList<HeroStats> heroStatsArrayList) {
        // логика определения игрока
        // у тебя тут как-то определяется самый крутой герой, у меня просто первый
        HeroStats mostSucceedHeroStats = heroStatsArrayList.get(0);
        System.out.println("Самый успешный герой: " + mostSucceedHeroStats.getHero().getName() +
                " (винрейт " + mostSucceedHeroStats.getWinRate() + ")");


    }
    // и так по каждому полю необходимому

}
