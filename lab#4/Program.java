import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        String namePiDirection = "���������� �����������";
        String namePiGroup = "���-17�1";
        // �������� �������� ���������� � ���������� � ���� �����������
        Faculty isuFaculty = new Faculty("�������������� ������� � ����������");
        isuFaculty.addDirection(new Direction(namePiDirection));
        isuFaculty.addDirection(new Direction("�������������� ������������"));
        isuFaculty.addDirection(new Direction("������������������ �������"));

        System.out.println(String.format("����������� ���������� %s:", isuFaculty.getName()));
        for (Direction direction : isuFaculty.getDirections()) {
            System.out.println(direction.toString());
        }

        // �������� ���������� ����� � ���������� ����������� �������� ����������
        Direction directionPi = isuFaculty.getDirection(namePiDirection);
        directionPi.addGroup(new StudyGroup("���-17�1"));
        directionPi.addGroup(new StudyGroup("���-18�1"));
        directionPi.addGroup(new StudyGroup("���-19�1"));
        directionPi.addGroup(new StudyGroup("���-20�1"));

        System.out.println(String.format("������ ����������� %s:", directionPi.getName()));
        for (StudyGroup group : directionPi.getGroups()) {
            System.out.println(group.toString());
        }

        // �������� ���������� ��������� � ������
        StudyGroup group = directionPi.getGroup(namePiGroup);
        group.addStudents(new Student("������ ���� �������������"));
        group.addStudents(new Student("������� ���� ��������������"));

        System.out.println(String.format("�������� ������ %s:", group.getName()));
        for (Student student : group.getStudents()) {
            System.out.println(student.toString());
        }

        // �������� ��������� ���������� ��������
        Student student = group.getStudent("������ ���� �������������");
        student.addAchievement(new Achievement(Achievements.BestProgrammerOfGroup,
                "������� � ������� ��������� �� ���������������� �� ����� C#"));

        System.out.println(String.format("���������� �������� %s:", student.getName()));
        for (Achievement achievement : student.getAchievements()) {
            System.out.println(achievement.toString());
        }

        // �������� ���������� ��������
        group.deleteStudent(student);

        System.out.println(String.format("�������� ������ %s:", group.getName()));
        for (Student s : group.getStudents()) {
            System.out.println(s.toString());
        }

        // �������� ��������������� ������� ������
        directionPi.deleteGroup(group);

        System.out.println(String.format("������ ����������� %s:", directionPi.getName()));
        for (StudyGroup g : directionPi.getGroups()) {
            System.out.println(g.toString());
        }
    }
}
