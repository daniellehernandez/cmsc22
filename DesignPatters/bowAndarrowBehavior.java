package designpatterns;

/**
 * Created by Danielle98 on 11/24/2016.
 */
public class bowAndarrowBehavior implements weaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Thwaaack...thud");
    }
}
