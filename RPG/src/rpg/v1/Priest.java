package rpg.v1;

public class Priest extends Character {
    public Priest(String name) {
        super(name, new PhysicalAttack(15), new MagicalAttack(15));
    }
}
