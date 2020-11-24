import java.util.List;
import java.util.ArrayList;

public class StudyGroup {
    private List<Student> _students = new ArrayList<Student>();
    private String _name;

    public StudyGroup(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    public void addStudents(Student student) {
        if (student.equals(null))
            return;
        _students.add(student);
    }

    public Student getStudent(String nameStudent) {
        return _students.stream().filter((student) -> student.getName() == nameStudent).findFirst()
                .orElseGet(() -> null);
    }

    public List<Student> getStudents() {
        return _students;
    }

    public void deleteStudent(String name) {
        Student student = getStudent(name);
        _students.remove(student);
    }

    public void deleteStudent(Student student) {
        _students.remove(student);
    }

    @Override
    public String toString() {
        return "Группа " + _name + " с количеством студентов " + _students.size();
    }
}