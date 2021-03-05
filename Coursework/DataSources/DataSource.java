package DataSources;

import java.io.FileNotFoundException;
import java.io.IOException;

import ObjectModel.Nursery;

public interface DataSource {
    Nursery getNursery() throws FileNotFoundException, ClassNotFoundException, IOException;
}
