package rpg.v1;

public class MagicalAttack extends Attack {
    public MagicalAttack(int damage) {
        super(damage);
    }

    @Override
    public String getDamageType() {
        return "magical";
    }
}
