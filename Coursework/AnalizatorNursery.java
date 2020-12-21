import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import ObjectModel.*;

public class AnalizatorNursery {

    //Получить самый прожорливый вальер
    public Aviary getTheMostVoraciousAviarys(Nursery nursery) {
        Aviary[] avArray = nursery.Aviarys.toArray(new Aviary[nursery.Aviarys.size()]);

        Arrays.sort(avArray, Aviary::compareByCountPackFood);

        return avArray[nursery.Aviarys.size() - 1];
    }

    //Получить самый голодный вальер
    public Aviary getTheMostHungryAviarys(Nursery nursery) {
        Aviary[] avArray = nursery.Aviarys.toArray(new Aviary[nursery.Aviarys.size()]);

        Arrays.sort(avArray, Aviary::compareByCountPackFood);

        return avArray[0];
    }

    //Получить самое прожорливое животное
    public Animal getTheMostVoraciousAnimal(Nursery nursery) {

        ArrayList<Animal> animals = new ArrayList<>();

        for (Aviary item : nursery.Aviarys)
            animals.addAll(item.Animals);

        var anArray = animals.toArray(new Animal[animals.size()]);

        Arrays.sort(anArray, Animal::compareByCountPackFood);
        return anArray[animals.size() - 1];
    }

    //Получить самое голодное животное
    public Animal getTheMostHungryAnimal(Nursery nursery) {
        ArrayList<Animal> animals = new ArrayList<>();

        for (Aviary item : nursery.Aviarys)
            animals.addAll(item.Animals);

        var anArray = animals.toArray(new Animal[animals.size()]);

        Arrays.sort(anArray, Animal::compareByCountPackFood);
        return anArray[0];
    }

    //Получить животное по имени
    public Animal getAnimalByName(Nursery nursery, String animalName) throws Exception {

        ArrayList<Animal> animals = new ArrayList<>();

        for (Aviary item : nursery.Aviarys)
            animals.addAll(item.Animals);

        Animal animal = null;

        for (Animal anim : animals) {
            if (anim.Name.equals(animalName))
                animal = anim;
        }

        if (animal == null)
            throw new Exception("Животное с указанным именем не существует");
        return animal;
    }

    //Получить вальер по номеру
    public Aviary getAviarylByNumber(Nursery nursery, int number) throws Exception {

        return nursery.Aviarys.stream().filter(x -> x.Number == number).collect(Collectors.toList()).get(0);
    }

}
