package rpg.v1;

public abstract class Character {
    private final String name;
    private Attack basicAttack;
    private Attack powerAttack;

    public Character(String name, Attack basicAttack, Attack powerAttack) {
        this.name = name;
        this.basicAttack = basicAttack;
        this.powerAttack = powerAttack;
    }

    public String getName() {
        return name;
    }

    public void setBasicAttack(Attack basicAttack) {
        this.basicAttack = basicAttack;
    }

    public void setPowerAttack(Attack powerAttack) {
        this.powerAttack = powerAttack;
    }

    public void performBasicAttack(Character target) {
        // Using the basic interface:
        System.out.println(getName() + " attacks " + target.getName() + " " + basicAttack.getDamageType() + "ly (" +
                basicAttack.getDamage() + "HP)");
    }

    public void performPowerAttack(Character target) {
        // Using the "delegation" interface:
        powerAttack.describeAttack(this, target);

    }
}
