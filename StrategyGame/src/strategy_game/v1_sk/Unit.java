package strategy_game.v1_sk;

public interface Unit {
    /** Returns a short description of the unit. */
    String describe();

    /** Attacks the nearest target */
    default void attackNearest() {
        System.out.printf("%s attacks nearest target.%n", describe());
    }

    /** Moves the unit relative to its current position. */
    void move(int deltaX, int deltaY);
}
