package Model;

/**
 * Created by Daniel McCoshen on 22/01/18.
 */
public class RacialAbility extends Skill{
    private int cost;
    public RacialAbility(String name, int cost, String description){
        super(name, new int[]{0,0,0,0,0,0}, description, null);
        this.cost = cost;
    }
}
