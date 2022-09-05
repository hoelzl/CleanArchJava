package rpg.v1;

public abstract class Character {
    private String name;
    protected Attack basicAttack;
    protected Attack powerAttack;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void performBasicAttack(Character target) {
        System.out.println(getName() + " attacks " + target.getName() + " " + basicAttack.getDamageType() + "ly (" + basicAttack.getDamage() + "HP)");
    }

    public void performPowerAttack(Character target) {
        System.out.println(getName() + " attacks " + target.getName() + " " + powerAttack.getDamageType() + "ly (" + powerAttack.getDamage() + "HP)");

    }
}
