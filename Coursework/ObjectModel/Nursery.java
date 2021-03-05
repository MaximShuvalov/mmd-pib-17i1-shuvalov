package ObjectModel;

import java.io.Serializable;
import java.util.ArrayList;

public class Nursery implements Serializable{
    
    private static final long serialVersionUID = 1L;

    public String Name;

    public ArrayList<Aviary> Aviarys;

    public Nursery(String name, ArrayList<Aviary> aviarys) {
        Name = name;
        Aviarys = aviarys;
    }

    @Override
    public String toString(){
        return "Питомник " + Name;
    }
}
