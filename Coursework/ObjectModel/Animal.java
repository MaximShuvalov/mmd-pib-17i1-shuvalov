package ObjectModel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Animal {
    public TypesAnimal Type;

    public String Name;

    public ArrayList<Day> Days;

    public Animal(String name, TypesAnimal type, ArrayList<Day> days) {
        Type = type;
        Name = name;
        Days = days;
    }

    public void feedAnimal(int countPackFood) {
        var date = getCurrentDateString();
        Days.add(new Day(date, countPackFood));
    }

    private String getCurrentDateString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
