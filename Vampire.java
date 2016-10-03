
import java.util.Random;


public class Vampire extends Hero {

    Random rand = new Random();

    // because of FANGS and STRENGTH
    private static final int BASE_ATTACK = 10;
    // because of endurance
    private static final int ARMOR = 5;

    public int randInt(int min, int max) {
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public boolean compulsion(){
        int compelled;
        compelled = randInt(1,5);

        if (compelled >= 1 && compelled <= 4){
            return false;
        }
        else{
            return true;
        }
    }

    public Vampire(String name, int level) {
        // a swordsman will have +ARMOR for HP because of ARMOR
        super(name, level + ARMOR, level);
    }

    public int attack() {
        if (compulsion()){
            System.out.println("Enemy is compelled to stay put for one turn. Attack is doubled.");
            return (BASE_ATTACK + getLevel()) * 2;
        }
        else{
            return BASE_ATTACK + getLevel();
        }
    }

    public int takeDamage(int damage) {
        // reduce damage because of armor and natural vampire healing
        damage -= (randInt(1,50) + ARMOR);
        // set new hp
        return super.takeDamage(damage);
    }
}