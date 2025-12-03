
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {

        Fighter attacker = new SpecialFighter("Alice", 100, 15, 10);
        
        Fighter defender = new Fighter("Bob", 100, 20);

        while (attacker.getHealthPoints() > 0 && defender.getHealthPoints() > 0) {

            int damage = attacker.dealDamage();
            defender.takeDamage(damage);

            Fighter temp = attacker;
            attacker = defender;
            defender = temp;
        }

        System.out.println("The fight ended!");

        if (attacker.getHealthPoints() > 0) {
            System.out.println("Winner: " + attacker.getName());
        } else {
            System.out.println("Winner: " + defender.getName());
        }
    }
}
