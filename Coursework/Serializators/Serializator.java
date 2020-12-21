package Serializators;

import java.io.FileNotFoundException;
import java.io.IOException;

import ObjectModel.Nursery;

public interface Serializator{
    public void serializeNursery(Nursery nursery) throws FileNotFoundException, IOException;
}
