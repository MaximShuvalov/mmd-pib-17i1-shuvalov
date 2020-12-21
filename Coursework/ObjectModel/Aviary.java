package ObjectModel;

import java.util.ArrayList;

public class Aviary{
    public int Number;
    public ArrayList<Animal> Animals;

    public Aviary(ArrayList<Animal> animals, int number) {
        Animals = animals;
        Number = number;
    }

    private int getCountEatenPackFoodAnimals(){
        return Animals.stream().mapToInt(p-> p.getCountEatenPackFood()).sum();
    }

    public static int compareByCountPackFood(Aviary a, Aviary b){
        return (a.getCountEatenPackFoodAnimals() - b.getCountEatenPackFoodAnimals());
    }
}
