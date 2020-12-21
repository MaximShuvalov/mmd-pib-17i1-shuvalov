package Serializators;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import ObjectModel.Nursery;

public class TxtSerializator implements Serializator{
    
    @Override
    public void serializeNursery(Nursery nursery) throws FileNotFoundException, IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("nursery.txt")))
        {
            oos.writeObject(nursery);
        }
    }
}
