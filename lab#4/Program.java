public class Program {
    public static void main(String[] args) {
        Achievement a1 = new Achievement(Achievements.BestProgrammerOfGroup);
        a1.SetNote("Занял 1-е место в олимпиаде по программированию");

        System.out.println(a1.toString());
    }
}
