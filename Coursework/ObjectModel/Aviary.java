package ObjectModel;

import java.io.Serializable;
import java.util.ArrayList;

public class Aviary implements Serializable{
    
    private static final long serialVersionUID = 1L;
    public int Number;
    public ArrayList<Animal> Animals;

    public Aviary(ArrayList<Animal> animals, int number) {
        Animals = animals;
        Number = number;
    }

    public void addAnimal(Animal animal){
        Animals.add(animal);
    }

    private int getCountEatenPackFoodAnimals(){
        return Animals.stream().mapToInt(p-> p.getCountEatenPackFood()).sum();
    }

    public static int compareByCountPackFood(Aviary a, Aviary b){
        return (a.getCountEatenPackFoodAnimals() - b.getCountEatenPackFoodAnimals());
    }

    @Override
    public String toString(){
        return "Вальер № " + Number;
    }
}
