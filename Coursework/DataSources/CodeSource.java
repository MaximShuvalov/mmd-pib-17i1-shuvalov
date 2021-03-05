package DataSources;

import java.util.ArrayList;
import ObjectModel.*;

public class CodeSource implements DataSource {
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

    public Nursery getNursery() {
        createData();
        nursery = new Nursery("Питомник 1", aviarys);
        return nursery;
    }

    private void createData() {

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

        animals1.add(new Animal("Sharik", TypesAnimal.Dog, days1));
        animals1.add(new Animal("Tyson", TypesAnimal.Dog, days2));
        animals1.add(new Animal("Stephan", TypesAnimal.Dog, days3));
        animals1.add(new Animal("Pirate", TypesAnimal.Dog, days4));

        animals2.add(new Animal("Bird1", TypesAnimal.Bird, days2));
        animals2.add(new Animal("Bird2", TypesAnimal.Bird, days5));
        animals2.add(new Animal("Bird3", TypesAnimal.Bird, days3));
        animals2.add(new Animal("Bird4", TypesAnimal.Bird, days4));

        animals3.add(new Animal("Cat1", TypesAnimal.Cat, days2));
        animals3.add(new Animal("Cat2", TypesAnimal.Cat, days2));
        animals3.add(new Animal("Cat3", TypesAnimal.Cat, days2));
        animals3.add(new Animal("Cat4", TypesAnimal.Cat, days2));

        aviarys.add(new Aviary(animals1, 1));
        aviarys.add(new Aviary(animals2, 2));
        aviarys.add(new Aviary(animals3, 3));

    }
}
