package strategy_game.v2_strategy;

public interface Unit {
    String describe(int indent);

    default String describe() {
        return describe(0);
    }

    default void attackNearest() {
        System.out.printf("%s attacks nearest target.%n", describe());
    }

    void move(int deltaX, int deltaY);
}
