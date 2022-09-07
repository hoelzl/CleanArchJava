package strategy_game.v2_strategy;

import java.util.Random;

public class Soldier implements Unit {
    Position position;
    static Random rand = new Random();

    public Soldier(int x, int y) {
        this.position = new Position(x, y);
    }

    public Soldier() {
        this(rand.nextInt(100), rand.nextInt(100));
    }

    @Override
    public String describe(int indent) {
        return String.format("%sSoldier at position %d, %d", " ".repeat(indent), position.x(), position.y());
    }

    @Override
    public void move(int deltaX, int deltaY) {
        position = new Position(position.x() + deltaX, position.y() + deltaY);
    }
}
