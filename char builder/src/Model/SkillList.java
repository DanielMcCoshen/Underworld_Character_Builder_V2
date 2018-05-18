package Model;

import java.util.LinkedList;

/**
 * Created by daniel on 24/01/18.
 */
public class SkillList {
    private static LinkedList<Skill> ourInstance = new LinkedList<>();

    public static LinkedList<Skill> getInstance() {
        return ourInstance;
    }

    private SkillList() {

    }
}
