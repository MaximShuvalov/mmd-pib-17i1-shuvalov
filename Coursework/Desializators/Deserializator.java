package Desializators;

import java.io.FileNotFoundException;
import java.io.IOException;

import ObjectModel.Nursery;

public interface Deserializator {
    public Nursery deserializeNursery() throws FileNotFoundException, IOException, ClassNotFoundException;
}
