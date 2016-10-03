
import java.util.Random;
/**
 * Created by Danielle98 on 9/29/2016.
 */
public class Archer extends Hero {

    private static final int BASE_ATTACK = 1;
    private static final int ARMOR = 5;
    private Random rand = new Random();

    // inclusive random integer
    public int randInt(int min, int max) {
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    public boolean coinToss() {
        return randInt(0, 1) == 1 ? true : false;
    }

    public Archer(String name, int level) {
        super(name, level, level + ARMOR);
    }

    public int print(){

        System.out.println("Pentadruple arrows -> -> -> -> ->");
        return 0;

    }

    public int attack() {
        if(coinToss()) {
            return BASE_ATTACK*5 + print() + getLevel(); //times 5 for special multiple arrows attack
        } else {
            return BASE_ATTACK + getLevel();
        }
    }

    public int takeDamage(int damage) {
        damage -= ARMOR;
        return super.takeDamage(damage);
    }
}
