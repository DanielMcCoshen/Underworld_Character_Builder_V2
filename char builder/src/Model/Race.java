package Model;

import java.io.Serializable;

/**
 * Created by Daniel McCoshen on 22/01/18.
 */
public class Race implements Serializable{
    private RacialAbility automatic;
    private RacialAbility purchased;
    private int maxRacialPurchases;
    private RacialAbility disadvantage;

    public RacialAbility getAutomatic(){
        return automatic;
    }
    public RacialAbility getDisadvantage(){
        return disadvantage;
    }

}
