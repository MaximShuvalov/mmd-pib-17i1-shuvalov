public class Program {
    public static void main(String[] args) {
        Achievement a1 = new Achievement(Achievements.BestProgrammerOfGroup);

        System.out.println("Название ачивки - " + a1.GetName());

        System.out.println(a1);
    }
}
