
/**
 * Write a description of class SpecialFighter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;

public class SpecialFighter extends Fighter {
    private Random rng;
    private int maxShield;

    public SpecialFighter(String name, int healthPoints, int attackDamage, int maxShield) {
        super(name, healthPoints, attackDamage);
        this.maxShield = maxShield;
        this.rng = new Random();
    }

    public int getMaxShield() {
        return maxShield;
    }

    @Override
    public void takeDamage(int amount) {
        int n = rng.nextInt(maxShield + 1);
        int finalDamage = amount - n;

        if (finalDamage < 0) {
            finalDamage = 0;
        }

        System.out.println(getName() + "'s shield blocked " + n + " damage!");
        super.takeDamage(finalDamage);
    }
}
