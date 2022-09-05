package rpg.v1;

public class Mage extends Character {
    public Mage(String name) {
        super(name);
        basicAttack = new MagicalAttack(5);
        powerAttack = new MagicalAttack(30);
    }
}
