package strategy_game.v2_strategy;

import java.util.List;

@SuppressWarnings("DuplicatedCode")
public class Main {
    public static void main(String[] args) {
        Unit singleSoldier = new Soldier();
        Unit myArmy = new Army(List.of(new Soldier(), new Soldier(), new Soldier()));
        Unit yourArmy = new Army(List.of(new Soldier(), new Soldier()));
        Unit ourArmy = new Army(List.of(myArmy, yourArmy));

        System.out.println("====================================");
        System.out.println(singleSoldier.describe());
        System.out.println("====================================");
        System.out.println(myArmy.describe());
        System.out.println("====================================");
        System.out.println(yourArmy.describe());
        System.out.println("====================================");
        System.out.println(ourArmy.describe());
        System.out.println("====================================");
        yourArmy.move(100, 100);
        System.out.println(ourArmy.describe());
        System.out.println("====================================");
        ourArmy.attackNearest();
    }
}
