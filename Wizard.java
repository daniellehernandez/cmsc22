import java.util.Random;

public class Wizard extends Hero {
    private static  final int ARMOR = 10;
    private Random BASE_ATTACK = new Random();
    private int Attack;

    public Wizard(String name, int level) {
        super(name, level, level + ARMOR);
    }

    public int randInt(int min, int max) {
        int randomNum = BASE_ATTACK.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public int setattack(){
        int spell = randInt(1, 5);
        if (spell == 1){
            Attack = 5;
            System.out.println("Alarte Ascendare!");
            return Attack;
        } else if(spell == 2){
            Attack = 30;
            System.out.println("Crucio!");
            return Attack;
        } else if(spell == 3){
            Attack = 10;
            System.out.println("Expelliarmus!");
            return Attack;
        } else if(spell == 4){
            Attack = 20;
            System.out.println("Expecto Patronum!");
            return Attack;
        } else if (spell == 5){
            Attack = 50;
            System.out.println("Avada Kedavra");
            return Attack;
        }
        return Attack;
    }


    public int attack() {
        return Attack + setattack() +getLevel();
    }


    public int takeDamage(int damage) {
        // reduce damage because of armor!!! oh yeah!
        damage -= ARMOR;
        // set new hp
        return super.takeDamage(damage);
    }
}
