package Desializators;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import ObjectModel.Nursery;

public class TxtDeserializator implements Deserializator {

    @Override
    public Nursery deserializeNursery() throws FileNotFoundException, IOException, ClassNotFoundException {
        try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream("nursery.txt")))
        {
           return (Nursery) oos.readObject();
        }
    }
    
}
