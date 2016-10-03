/**
 * Created by Danielle98 on 9/29/2016.
 */
public class Monster extends RPGCharacter{
    private int attackDamage;

    public Monster(String name, int hp, int attackDamage) {
        super(name, hp);
        this.attackDamage = attackDamage;
    }

    public int attack() {
        return attackDamage;
    }

}