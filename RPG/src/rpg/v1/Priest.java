package rpg.v1;

public class Priest extends Character {
    public Priest(String name) {
        super(name);
        basicAttack = new PhysicalAttack(15);
        powerAttack = new MagicalAttack(15);
    }
}
