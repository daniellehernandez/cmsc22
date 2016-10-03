/**
 * Created by Danielle98 on 9/29/2016.
 */
public abstract class Hero extends RPGCharacter {
    private int level;

    public Hero(String name, int hp, int level) {
        super(name, hp);
        this.level = level;
    }

    // getters and setters
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}