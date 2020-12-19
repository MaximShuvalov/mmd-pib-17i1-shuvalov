import java.util.ArrayList;

public class Program {

    private static ArrayList<Day> days1 = new ArrayList<>();
    private static ArrayList<Day> days2 = new ArrayList<>();
    private static ArrayList<Day> days3 = new ArrayList<>();
    private static ArrayList<Day> days4 = new ArrayList<>();

    private static ArrayList<Animal> animals1 = new ArrayList<>();
    private static ArrayList<Animal> animals2 = new ArrayList<>();
    private static ArrayList<Animal> animals3 = new ArrayList<>();

    private static ArrayList<Aviary> aviarys = new ArrayList<>();

    private static Nursery nursery;

    
    public static void main(String[] args) {
       CreateData();
       nursery = new Nursery("Питомник №1", aviarys);
    }

    private static void CreateData(){

        days1.add(new Day("12.12.2020", 3));
       days1.add(new Day("13.12.2020", 2));
       days1.add(new Day("14.12.2020", 2));
       days1.add(new Day("15.12.2020", 3));
       days1.add(new Day("16.12.2020", 3));

       days2.add(new Day("12.12.2020", 1));
       days2.add(new Day("13.12.2020", 1));
       days2.add(new Day("14.12.2020", 1));
       days2.add(new Day("15.12.2020", 3));
       days2.add(new Day("16.12.2020", 1));

       days3.add(new Day("12.12.2020", 6));
       days3.add(new Day("13.12.2020", 4));
       days3.add(new Day("14.12.2020", 5));
       days3.add(new Day("15.12.2020", 2));
       days3.add(new Day("16.12.2020", 3));

       days4.add(new Day("12.12.2020", 6));
       days4.add(new Day("13.12.2020", 6));
       days4.add(new Day("14.12.2020", 2));
       days4.add(new Day("15.12.2020", 1));
       days4.add(new Day("16.12.2020", 5));

       animals1.add(new Animal("Шарик", TypesAnimal.Dog, days1));
       animals1.add(new Animal("Тайсон", TypesAnimal.Dog, days2));
       animals1.add(new Animal("Степа", TypesAnimal.Dog, days3));
       animals1.add(new Animal("Пират", TypesAnimal.Dog, days4));

       animals2.add(new Animal("Птица1", TypesAnimal.Bird, days2));
       animals2.add(new Animal("Птица2", TypesAnimal.Bird, days1));
       animals2.add(new Animal("Птица3", TypesAnimal.Bird, days3));
       animals2.add(new Animal("Птица4", TypesAnimal.Bird, days4));

       animals3.add(new Animal("Кот1", TypesAnimal.Cat, days4));
       animals3.add(new Animal("Кот2", TypesAnimal.Cat, days2));
       animals3.add(new Animal("Кот3", TypesAnimal.Cat, days1));
       animals3.add(new Animal("Кот4", TypesAnimal.Cat, days3));

       aviarys.add(new Aviary(animals1, 1));
       aviarys.add(new Aviary(animals2, 2));
       aviarys.add(new Aviary(animals3, 3));
       
    }

    private static void PrintTheMostVoraciousAviarys(){

    }
}
