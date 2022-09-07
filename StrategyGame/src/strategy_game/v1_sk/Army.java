package strategy_game.v1_sk;

import java.util.List;

@SuppressWarnings("unused")
public class Army implements Unit {
    public Army(List<Unit> units) {

    }

    @Override
    public String describe() {
        return "Army";
    }

    @Override
    public void move(int deltaX, int deltaY) {

    }
}
