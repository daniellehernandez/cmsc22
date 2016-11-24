package designpatterns;

import junit.framework.TestCase;

/**
 * Created by Danielle98 on 11/24/2016.
 */
public class CharacterTest extends TestCase{

    public static void main(String[] args) {
        Character q1 = new queen();
        System.out.println("Queen:");
        q1.setWeapon(new knifeBehavior());
        q1.fight();
        q1.setWeapon(new bowAndarrowBehavior());
        q1.fight();

        Character k1 = new king();
        System.out.println("\nKing:");
        k1.setWeapon(new axeBehavior());
        k1.fight();
        k1.setWeapon(new swordBehavior());
        k1.fight();

        Character s1 = new student();
        System.out.println("\nStudent:");
        s1.setWeapon(new mindWeapon());
        s1.fight();
    }
}