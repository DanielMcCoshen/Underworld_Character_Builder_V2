package Model;

import sun.awt.image.ImageWatched;

import java.io.Serializable;
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

        Skill racialAutomatic = charRace.getAutomatic();
        freeCP -= racialAutomatic.getCost(charClass);
        racialAutomatic.effect(this);
        skills.add(racialAutomatic);
        Skill racialDisadvantage = charRace.getDisadvantage();
        racialDisadvantage.effect(this);
        skills.add(racialDisadvantage);

        skills.add(racialAutomatic);
    }

    public void purchase(Skill s){

    }
    public void purchaseRacial(){

    }
    public LinkedList<Skill> getPurchaseable(){
        return null;
    }

}
