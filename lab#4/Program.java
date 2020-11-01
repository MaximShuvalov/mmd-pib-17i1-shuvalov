import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        String namePiDirection = "Прикладная информатика";
        String namePiGroup = "ПИб-17И1";
        // Сценарий создания факультета и добавление в него направлений
        Faculty isuFaculty = new Faculty("Информационные системы в управлении");
        isuFaculty.addDirection(new Direction(namePiDirection));
        isuFaculty.addDirection(new Direction("Информационная безопасность"));
        isuFaculty.addDirection(new Direction("Автоматизированные системы"));

        System.out.println(String.format("Направления факультета %s:", isuFaculty.getName()));
        for (Direction direction : isuFaculty.getDirections()) {
            System.out.println(direction.toString());
        }

        // Сценарий добавления групп в конкретное направление обучения факультета
        Direction directionPi = isuFaculty.getDirection(namePiDirection);
        directionPi.addGroup(new StudyGroup("ПИб-17И1"));
        directionPi.addGroup(new StudyGroup("ПИб-18И1"));
        directionPi.addGroup(new StudyGroup("ПИб-19И1"));
        directionPi.addGroup(new StudyGroup("ПИб-20И1"));

        System.out.println(String.format("Группы направления %s:", directionPi.getName()));
        for (StudyGroup group : directionPi.getGroups()) {
            System.out.println(group.toString());
        }

        // Сценарий зачисления студентов в группу
        StudyGroup group = directionPi.getGroup(namePiGroup);
        group.addStudents(new Student("Иванов Петр Александрович"));
        group.addStudents(new Student("Петрова Анна Константиновна"));

        System.out.println(String.format("Студенты группы %s:", group.getName()));
        for (Student student : group.getStudents()) {
            System.out.println(student.toString());
        }

        // Сценарий получения достижения студента
        Student student = group.getStudent("Иванов Петр Александрович");
        student.addAchievement(new Achievement(Achievements.BestProgrammerOfGroup,
                "Победил в районой олимпиаде по программированию на языке C#"));

        System.out.println(String.format("Достижения студента %s:", student.getName()));
        for (Achievement achievement : student.getAchievements()) {
            System.out.println(achievement.toString());
        }

        // Сценарий отчисления студента
        group.deleteStudent(student);

        System.out.println(String.format("Студенты группы %s:", group.getName()));
        for (Student s : group.getStudents()) {
            System.out.println(s.toString());
        }

        // Сценарий расформирование учебной группы
        directionPi.deleteGroup(group);

        System.out.println(String.format("Группы направления %s:", directionPi.getName()));
        for (StudyGroup g : directionPi.getGroups()) {
            System.out.println(g.toString());
        }
    }
}
