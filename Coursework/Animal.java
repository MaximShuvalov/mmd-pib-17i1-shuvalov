import java.util.ArrayList;

public class Animal {
    public TypesAnimal Type;

    public String Name;

    public ArrayList<Day> Days;

    public Animal(String name, TypesAnimal type, ArrayList<Day> days){
        Type = type;
        Name = name;
        Days = days;
    }
}
