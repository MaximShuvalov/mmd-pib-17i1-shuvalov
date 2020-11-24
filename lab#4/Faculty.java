import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String _name;
    private List<Direction> _directions = new ArrayList<Direction>();

    public Faculty(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    public void addDirection(Direction direction) {
        if (direction.equals(null))
            return;
        _directions.add(direction);
    }

    public Direction getDirection(String name) {
        return _directions.stream().filter((direction) -> direction.getName() == name).findFirst().orElseGet(() -> null);
    }

    public void deletedirection(String name) {
        Direction direction = getDirection(name);
        _directions.remove(direction);
    }

    public List<Direction> getDirections() {
        return _directions;
    }

    @Override
    public String toString() {
        return "Факультет " + _name;
    }
}
