import java.util.ArrayList;
import java.util.List;

import Interfaces.IHuman;

public class Student implements IHuman {
    private String name;
    private List<Achievement> achievements = new ArrayList<Achievement>();

    public Student(String nameStudent) {
        name = nameStudent;
    }

    @Override
    public String getName() {
        return name;
    }

    public void addAchievement(Achievement achievement) {
        if (achievement != null)
            achievements.add(achievement);
    }

    public void addAchievement(List<Achievement> achievements) {
        if (!achievements.isEmpty())
            this.achievements = achievements;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    @Override
    public String toString() {
        return "Студент, " + name + ", имеет " + achievements.size() + " достижений";
    }

}
