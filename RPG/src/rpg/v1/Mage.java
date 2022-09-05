package rpg.v1;

public class Mage extends Character {
    public Mage(String name) {
        super(name, new MagicalAttack(5), new MagicalAttack(30));
    }
}
