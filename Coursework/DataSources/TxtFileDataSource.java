package DataSources;

import java.io.FileNotFoundException;
import java.io.IOException;

import Desializators.Deserializator;
import Desializators.TxtDeserializator;
import ObjectModel.Nursery;

public class TxtFileDataSource implements DataSource {

    @Override
    public Nursery getNursery() throws FileNotFoundException, ClassNotFoundException, IOException {
        Deserializator deserializator = new TxtDeserializator();
        Nursery nursery = deserializator.deserializeNursery();
        return nursery;
    }
    
}
