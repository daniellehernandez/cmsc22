
/**
 * Created by Danielle98 on 9/29/2016.
 */
import java.util.*;

/**
 * Created by nmenego on 9/29/16.
 */

public class RPG {

    private Random rand = new Random();
    private static boolean indicator = false;

    public RPG() {
        this.rand = new Random();
    }

    // generate a random monster name..
    public String getRandomMonsterName() {
        String[] adjectives = {"Green", "Slimy", "Bloody", "Smelly"};
        String[] monsters = {"Ogre", "Elf", "Giant", "Teacher"};
        List<String> adjs = Arrays.asList(adjectives);
        List<String> mons = Arrays.asList(monsters);

        return adjs.get(randInt(0, adjs.size() - 1)) + " " + mons.get(randInt(0, mons.size() - 1));
    }

    // inclusive random integer
    public int randInt(int min, int max) {
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    // coin toss
    public boolean coinToss() {
        return randInt(0, 1) == 1 ? true : false;
    }

    public boolean dodge() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess:");
        int myGuess = scan.nextInt();
        return randInt(0, 1) == myGuess ? true : false;

    }

    // pause the game for awhile for dramatic effect!
    public void sleep(int x) {
        try {
            Thread.sleep(x);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    // duel two characters, one as attacker, one as defender
    // returns true if someone is killed
    public boolean duel(RPGCharacter attacker, RPGCharacter defender) {
        int damage = attacker.attack();
        System.out.println("-> " + attacker.getName() + " attacks " + defender.getName());
        sleep(2000);

        if (indicator == true) { //instanceof
            if (coinToss()) {
                System.out.println(attacker.getName() + "'s" + " ATTACK HAS BEEN REPELLED BY " + defender.getName());
                int damageRepelled = attacker.takeDamage(damage);
                if (damageRepelled <= 0) {
                    System.out.printf("-> %s killed %s!\n", defender.getName(), attacker.getName());
                    return true;
                }
                return false;
            }

            if (dodge()) {
                System.out.println("YOU DODGED IT");
                return false;
            } else {
                int remHp = defender.takeDamage(damage);
                if (remHp <= 0) {
                    System.out.printf("-> %s killed %s!\n", attacker.getName(), defender.getName());
                    return true;
                }
              return false;
            }

        } else {
            System.out.println("arghhhhhh!!!!");
            int remHp = defender.takeDamage(damage);
            if (remHp <= 0) {
                System.out.printf("-> %s killed %s!\n", attacker.getName(), defender.getName());
                return true;
            }
           return false;
        }
    }



    // game...
    public static void main(String[] args) {

        RPG rpg = new RPG();
        RPGCharacter hero = null;
        Scanner scan = new Scanner(System.in);
        // TODO take parameters as input via STDIN
        RPGCharacter monster = new Monster(rpg.getRandomMonsterName(), rpg.randInt(1, 100), rpg.randInt(0, 200));

        System.out.println("====== GAME START =====");
        System.out.println("Please Choose a Hero");
        System.out.println("1. Swordsman");
        System.out.println("2. Wizard");
        System.out.println("3. Archer");
        System.out.println("4. Vampire");
        System.out.println("5. Faerie");
        int i = scan.nextInt();

        for(int clear = 0; clear < 100; clear++)
        {
            System.out.println() ;
        }

        System.out.println("Name:");
        String j = scan.next();

        switch(i){
            case 1:
                hero = new Swordsman(j,30);
                break;
            case 2:
                hero = new Wizard(j,30);
                break;
            case 3:
                hero = new Archer(j,30);
                break;
            case 4:
                hero = new Vampire(j,30);
                break;
            case 5:
                hero = new Faerie(j,30);
                break;
        }

        // fight! for version 1, hero will always attack first.
        int count = 0;
        while (true) {
            System.out.println("[ROUND " + ++count+"]");
            // hero's turn
            boolean heroVsMonster = rpg.duel(hero, monster);
            if (heroVsMonster)break;
            indicator = true;
            // monster's turn
            boolean monsterVsHero = rpg.duel(monster, hero);
            if (monsterVsHero)break;
            indicator = false;

            System.out.printf("%s\n%s\n", hero, monster);
        }

        System.out.printf("%s\n%s\n", hero, monster);
    }

}

