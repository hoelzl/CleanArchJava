package rpg.v1;

public class PhysicalAttack extends Attack {
    public PhysicalAttack(int damage) {
        super(damage);
    }

    @Override
    public String getDamageType() {
        return "physical";
    }
}
