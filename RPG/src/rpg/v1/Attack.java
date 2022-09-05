package rpg.v1;

public abstract class Attack {
    private int damage;

    public Attack(int damage) {
        this.damage = damage;
    }

    public abstract String getDamageType();

    int getDamage() {
        return damage;
    }
}
