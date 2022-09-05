package rpg.v1;

public class Fighter extends Character {
    public Fighter(String name) {
        super(name, new PhysicalAttack(10), new PhysicalAttack(20));
    }
}
