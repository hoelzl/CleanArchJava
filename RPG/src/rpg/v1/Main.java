package rpg.v1;

public class Main {
    public static void main(String[] args) {
        Character arthur = new Fighter("King Arthur");
        Character merlin = new Mage("Merlin");
        Character camillo = new Priest("Camillo");

        arthur.performBasicAttack(merlin);
        arthur.performPowerAttack(camillo);
        merlin.performBasicAttack(arthur);
        merlin.performPowerAttack(camillo);
        camillo.performBasicAttack(arthur);
        camillo.performPowerAttack(merlin);

        arthur.setBasicAttack(new PhysicalAttack(30));
        arthur.setPowerAttack(new MagicalAttack(40));
        arthur.performBasicAttack(merlin);
        arthur.performPowerAttack(camillo);
    }
}
