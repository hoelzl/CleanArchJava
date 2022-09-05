package rpg.v1;

public class Fighter extends Character {
    public Fighter(String name) {
        super(name);
        basicAttack = new PhysicalAttack(10);
        powerAttack = new PhysicalAttack(20);
    }
}
