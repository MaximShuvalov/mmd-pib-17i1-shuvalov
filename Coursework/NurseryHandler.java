import ObjectModel.Animal;
import ObjectModel.Nursery;

//Обработчик питомника
public class NurseryHandler {

    private AnalizatorNursery analizatorNursery = new AnalizatorNursery();

    public void feedAnimal(Animal animal, int countPackFood){
        animal.feedAnimal(countPackFood);
    }

    public void addAnimal(Animal animal, int numberAviary, Nursery nursery) throws Exception {
        var av = analizatorNursery.getAviarylByNumber(nursery, numberAviary);
        av.addAnimal(animal);
    }
}
