package strategy_game.v2_strategy;

import java.util.List;

public class Army implements Unit {
    List<Unit> units;

    public Army(List<Unit> units) {
        this.units = units;
    }

    @Override
    public String describe(int indent) {
        StringBuilder builder =
                new StringBuilder(String.format("%sArmy with %d units:%n", " ".repeat(indent), units.size()));
        for (Unit u : units) {
            builder.append(u.describe(indent + 2)).append("\n");
        }
        return builder.toString().stripTrailing();
    }

    @Override
    public void move(int deltaX, int deltaY) {
        for (Unit u : units) {
            u.move(deltaX, deltaY);
        }
    }

    @Override
    public void attackNearest() {
        for (Unit u : units) {
            u.attackNearest();
        }
    }
}
