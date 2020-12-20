import java.util.ArrayList;

import ObjectModel.*;

public class ReportBuilder {
    
    public void printTheMostVoraciousAviarys(Aviary av){

        System.out.println("--------------------------Отчет по самому прожорливому вальеру----------------------------------");
        System.out.println();
        System.out.println("Самое прожорливый вальер " + av.Number);
        System.out.println();

        for (Animal animal : av.Animals) {
            System.out.println(animal.Name + " съел " + animal.Days.stream().mapToInt(a -> a.CountPackFood).sum()
                    + " пачек корма");
        }
        System.out.println();
        System.out.println("--------------------------Конец отчета------------------------------------------------------------");
        System.out.println();
    }

    public void printTheMostVoraciousAnimal(Animal animal) {

        System.out.println("--------------------------Отчет по самому прожорливому животному----------------------------------");
        System.out.println();
        System.out.println("Самое прожорливое животное " + animal.Name);
        System.out.println();
        System.out.println("--------------------------Конец отчета------------------------------------------------------------");
        System.out.println();
    }

    public void printAnimalOfType(ArrayList<Aviary> aviaries) throws Exception {
        System.out.println("--------------------------Отчет по всем животным, находящимя в питомнике--------------------------");
        System.out.println();
        for (Aviary aviary : aviaries) {
            System.out.println("Вальер #" + aviary.Number);
            for (Animal animal : aviary.Animals) {
                var types = getNameType(animal.Type);
                System.out.println("Животное: " + animal.Name + " тип: " + types);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("--------------------------Конец отчета------------------------------------------------------------");
    }

    private String getNameType(TypesAnimal typesAnimal) throws Exception {
        switch (typesAnimal) {
            case Bird:
                return "Птица";
            case Cat:
                return "Кошка";
            case Dog:
                return "Собака";
            default:
                throw new Exception("Неизвестный тип животного");
        }
    }

}
