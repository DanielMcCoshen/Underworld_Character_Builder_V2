package Model;

import sun.awt.image.ImageWatched;

import java.io.Serializable;
import java.security.InvalidParameterException;
import java.util.LinkedList;

/**
 * Created by Daniel McCoshen on 18/01/18.
 */
public class UwCharacter implements Serializable{
    private Class charClass;
    private Race race;
    private LinkedList<Skill> skills;
    private String name;
    private String truename;
    private int blankets;
    private int spentCP;
    private int freeCP;
    private int racialPurchases;

    public UwCharacter(String name, String truename, Class charClass, Race charRace){
        this.charClass = charClass;
        this.race = charRace;
        this.name = name;
        this.truename = truename;
        blankets = 0;
        spentCP = 0;
        freeCP = 150;
        racialPurchases = 0;

        this.skills = new LinkedList<>();

        RacialAbility racialAutomatic = charRace.getAutomatic();
        freeCP -= racialAutomatic.getCost(charClass);
        racialAutomatic.effect(this);
        skills.add(racialAutomatic);
        RacialAbility racialDisadvantage = charRace.getDisadvantage();
        racialDisadvantage.effect(this);
        skills.add(racialDisadvantage);
    }

    public void purchase(Skill s) throws IllegalArgumentException{
        if (!getPurchaseable().contains(s)){
            throw new IllegalArgumentException("attempted to purchase an unavailable skill");
        }
        RacialAbility ability = race.getPurchased();
        racialPurchases++;
        ability.effect(this);
        freeCP -= ability.getCost();
        skills.add(ability);
    }
    public void purchaseRacial(){
        if (racialPurchases >= race.getMaxRacialPurchases()){
            throw new IllegalStateException("already bought max racial purchases");
        }

    }
    public LinkedList<Skill> getPurchaseable(){
        return null;
    }

}
