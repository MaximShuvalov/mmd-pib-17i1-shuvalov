package ObjectModel;

import java.io.Serializable;

public class Day implements Serializable {

    private static final long serialVersionUID = 1L;
    public String Date;
    public int CountPackFood;

    public Day(String date, int countPackFood) {
        Date = date;
        CountPackFood = countPackFood;
    }

    @Override
    public String toString() {
        return Date + "Количество пачек корма " + CountPackFood;
    }
}
