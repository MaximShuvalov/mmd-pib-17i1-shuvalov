import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Achievement a1 = new Achievement(Achievements.BestProgrammerOfGroup);
        Achievement a2 = new Achievement(Achievements.BestSportsmenOfCourse);
        Achievement a3 = new Achievement(Achievements.WorseProgrammerOfCourse);
        a1.SetNote("Занял 1-е место в олимпиаде по программированию");

        List<Achievement> achievements = new ArrayList<Achievement>();
        achievements.add(a1);
        achievements.add(a2);
        achievements.add(a3);

        Student student = new Student("Петров Иван Александрович");
        student.addAchievement(achievements);

        System.out.println(a1.toString());

        System.out.println(student.toString());

        System.out.println("Достижения студента:");
        for (Achievement achievement : achievements) {
            System.out.println(achievement.toString());
        }
    }
}
