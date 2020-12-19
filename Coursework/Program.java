import java.util.ArrayList;

public class Program {

    private static ArrayList<Day> days1 = new ArrayList<>();
    private static ArrayList<Day> days2 = new ArrayList<>();
    private static ArrayList<Day> days3 = new ArrayList<>();
    private static ArrayList<Day> days4 = new ArrayList<>();
    private static ArrayList<Day> days5 = new ArrayList<>();

    private static ArrayList<Animal> animals1 = new ArrayList<>();
    private static ArrayList<Animal> animals2 = new ArrayList<>();
    private static ArrayList<Animal> animals3 = new ArrayList<>();

    private static ArrayList<Aviary> aviarys = new ArrayList<>();

    private static Nursery nursery;

    public static void main(String[] args) {
        CreateData();
        nursery = new Nursery("Питомник №1", aviarys);

        PrintTheMostVoraciousAviarys(nursery);
        PrintTheMostVoraciousAnimal(nursery);
    }

    private static void CreateData() {

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

        days5.add(new Day("12.12.2020", 10));
        days5.add(new Day("13.12.2020", 10));
        days5.add(new Day("14.12.2020", 10));
        days5.add(new Day("15.12.2020", 8));
        days5.add(new Day("16.12.2020", 2));

        animals1.add(new Animal("Шарик", TypesAnimal.Dog, days1));
        animals1.add(new Animal("Тайсон", TypesAnimal.Dog, days2));
        animals1.add(new Animal("Степа", TypesAnimal.Dog, days3));
        animals1.add(new Animal("Пират", TypesAnimal.Dog, days4));

        animals2.add(new Animal("Bird1", TypesAnimal.Bird, days2));
        animals2.add(new Animal("Птица2", TypesAnimal.Bird, days5));
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

    private static void PrintTheMostVoraciousAviarys(Nursery nursery) {
        int i, j, step, tmp;
        int n = nursery.Aviarys.size();
        Aviary[] avArray = nursery.Aviarys.toArray(new Aviary[n]);

        for (step = n / 2; step > 0; step /= 2) {
            for (i = step; i < n; i++) {
                tmp = avArray[i].Animals.stream()
                        .mapToInt(a -> a.Days.stream().mapToInt(b -> b.CountPackFood).sum()).sum();

                for (j = i; j >= step; j -= step) {

                    int tmp2 = avArray[j-step].Animals.stream()
                            .mapToInt(a -> a.Days.stream().mapToInt(b -> b.CountPackFood).sum()).sum();

                    if (tmp < tmp2)
                        avArray[j] = avArray[j - step];
                    else
                        break;
                }
                avArray[j] = avArray[i];
            }
        }

        for (Aviary item : nursery.Aviarys) {
            System.out.println("Номер вальера " + item.Number);
            System.out.println("------------------------------------------------");
            for (Animal animal : item.Animals) {
                System.out.println(animal.Name + " съел " + animal.Days.stream().mapToInt(a -> a.CountPackFood).sum()
                        + " пачек корма");
            }
            System.out.println("------------------------------------------------");
        }

        System.out.println("Самое прожорливый вальер " + avArray[nursery.Aviarys.size() - 1].Number);
        System.out.println("------------------------------------------------");
    }

    private static void PrintTheMostVoraciousAnimal(Nursery nursery) {
        int i, j, step, tmp;
        
        ArrayList<Animal> animals = new ArrayList<>();

        for (Aviary item : nursery.Aviarys)
            animals.addAll(item.Animals);
         var anArray = animals.toArray(new Animal[animals.size()]);
         int n = anArray.length;

        for (step = n / 2; step > 0; step /= 2) {
            for (i = step; i < n; i++) {
                tmp = anArray[i].Days.stream().mapToInt(b -> b.CountPackFood).sum();

                for (j = i; j >= step; j -= step) {

                    int tmp2 = anArray[j-step].Days.stream().mapToInt(b -> b.CountPackFood).sum();

                    if (tmp < tmp2)
                    anArray[j] = anArray[j - step];
                    else
                        break;
                }
                anArray[j] = anArray[i];
            }
        }

        System.out.println("Самое прожорливое животное " + anArray[animals.size() - 1].Name);
        System.out.println("------------------------------------------------");
    }
}
