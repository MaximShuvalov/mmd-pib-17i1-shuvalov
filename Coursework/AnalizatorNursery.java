import java.util.ArrayList;

import ObjectModel.*;

public class AnalizatorNursery {

    public Aviary getTheMostVoraciousAviarys(Nursery nursery) {
        int i, j, step, tmp;
        int n = nursery.Aviarys.size();
        Aviary[] avArray = nursery.Aviarys.toArray(new Aviary[n]);

        for (step = n / 2; step > 0; step /= 2) {
            for (i = step; i < n; i++) {
                tmp = avArray[i].Animals.stream().mapToInt(a -> a.Days.stream().mapToInt(b -> b.CountPackFood).sum())
                        .sum();

                for (j = i; j >= step; j -= step) {

                    int tmp2 = avArray[j - step].Animals.stream()
                            .mapToInt(a -> a.Days.stream().mapToInt(b -> b.CountPackFood).sum()).sum();

                    if (tmp < tmp2)
                        avArray[j] = avArray[j - step];
                    else
                        break;
                }
                avArray[j] = avArray[i];
            }
        }

        return avArray[nursery.Aviarys.size() - 1];
    }

    public Animal getTheMostVoraciousAnimal(Nursery nursery) {

        int i, j, step, tmp;

        ArrayList<Animal> animals = new ArrayList<>();

        for (Aviary item : nursery.Aviarys)
            animals.addAll(item.Animals);
        var anArray = animals.toArray(new Animal[animals.size()]);
        int n = anArray.length;

        for (step = n / 2; step > 0; step /= 2) {
            for (i = step; i < n; i++) {
                tmp = anArray[i].Days.stream().mapToInt(b -> b.CountPackFood).sum();

                for (j = i; j >= step; j -= step) {

                    int tmp2 = anArray[j - step].Days.stream().mapToInt(b -> b.CountPackFood).sum();

                    if (tmp < tmp2)
                        anArray[j] = anArray[j - step];
                    else
                        break;
                }
                anArray[j] = anArray[i];
            }
        }
        return anArray[animals.size() - 1];
    }

}
