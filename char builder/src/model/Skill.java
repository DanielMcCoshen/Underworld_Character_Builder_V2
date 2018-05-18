package model;
import java.io.Serializable;
import java.util.LinkedList;

/**
 * Created by Daniel McCoshen on 17/01/18.
 */
public class Skill implements Serializable{
    String name;
    int[] costs;
    String description;
    LinkedList<Skill> prerequisites;

    public Skill(String name, int[] costs, String description, LinkedList<Skill> prerequisites){
        this.name = name;
        this.costs = costs;
        this.description = description;
        this.prerequisites = prerequisites;
    }

    public int getCost(Class charClass){
        return costs[charClass.getID()];
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public LinkedList<Skill> getPrerequisites(){
        return prerequisites;
    }
    public void effect(UwCharacter pChar){
        return;
    }
}
