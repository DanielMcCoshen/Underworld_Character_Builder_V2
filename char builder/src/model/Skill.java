package model;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Daniel McCoshen on 17/01/18.
 */
public class Skill implements Serializable{
    String name;
    Map<String, Integer> costs;
    String description;
    List<String> prerequisites;

    public Skill(String name, Map costs, String description, LinkedList<String> prerequisites){
        this.name = name;
        this.costs = costs;
        this.description = description;
        this.prerequisites = prerequisites;
    }

    public int getCost(CharClass charClass){
        return costs.get(charClass.getName());
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public boolean hasPrereq(Skill s){
        return prerequisites.contains(s.getName());
    }
}
