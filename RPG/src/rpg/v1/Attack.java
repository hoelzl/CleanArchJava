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

    // Alternative interface using delegation of the attacker.
    void describeAttack(Character attacker, Character defender) {
        System.out.println(
                attacker.getName() + " attacks " + defender.getName() + " " + getDamageType() + "ly (" + getDamage() +
                        "HP)");
    }
}
