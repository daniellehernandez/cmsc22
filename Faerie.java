import java.util.Random;

/**
 * Created by nmenego on 9/29/16.
 */
public class Faerie extends Hero {

    Random rand = new Random();
    // because of FANGS and STRENGTH
    private static final int BASE_ATTACK = 5;
    // because of endurance
    private static final int SHIELD = 5;

    public int element(){
        int power;
        power = randInt(1,22);
        {
            if (power >= 1 && power <= 5){
                System.out.println("You attacked using Fire!");
                return 10;
            }
            else if (power >= 6 && power <= 10){
                System.out.println("You attacked using Water!");
                return 8;
            }
            else if (power >= 11 && power <=15){
                System.out.println("You attacked using Air!");
                return 12;
            }
            else if (power >= 16 && power <= 20){
                System.out.println("You attacked using the element Earth!");
                return 13;
            }
            else{
                System.out.println("Special Spirit Power!");
                return 50;
            }
        }
    }

    public int randInt(int min, int max) {
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public Faerie(String name, int level) {
        // a swordsman will have +ARMOR for HP because of ARMOR
        super(name, level + SHIELD, level);
    }

    public int attack() {
        return BASE_ATTACK + element() + getLevel();
    }

    public int takeDamage(int damage) {
        // reduce damage because of armor and natural vampire healing
        damage -= SHIELD;
        // set new hp
        return super.takeDamage(damage);
    }
}