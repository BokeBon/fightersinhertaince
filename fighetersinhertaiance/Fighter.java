
/**
 * Write a description of class Fighter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fighter {
    private String name;
    private int healthPoints;
    private int attackDamage;

    public Fighter(String name, int healthPoints, int attackDamage) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.attackDamage = attackDamage;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int dealDamage() {
        return attackDamage;
    }

    public void takeDamage(int amount) {
        healthPoints -= amount;
        System.out.println(name + " took " + amount + " damage. Health now: " + healthPoints);
    }
}
