package Serializators;

import java.io.FileNotFoundException;
import java.io.IOException;

import ObjectModel.Nursery;

//Интерфейс сериализатора питомника
public interface Serializator{
    public void serializeNursery(Nursery nursery) throws FileNotFoundException, IOException;
}
