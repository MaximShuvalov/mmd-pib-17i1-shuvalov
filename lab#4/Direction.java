import java.util.ArrayList;
import java.util.List;

public class Direction {
    private String _name;
    private List<StudyGroup> _groups = new ArrayList<StudyGroup>();

    public Direction(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    public void addGroup(StudyGroup group) {
        if (group.equals(null))
            return;
        _groups.add(group);
    }

    public StudyGroup getGroup(String name) {
        return _groups.stream().filter((group) -> group.getName() == name).findFirst().orElseGet(() -> null);
    }

    public void deleteGroup(String name) {
        StudyGroup group = getGroup(name);
        _groups.remove(group);
    }

    public List<StudyGroup> getGroups() {
        return _groups;
    }

    @Override
    public String toString() {
        return "Направление " + _name;
    }
}
