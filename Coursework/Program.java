import DataSources.*;
import Serializators.Serializator;
import Serializators.TxtSerializator;


public class Program {
    private static Serializator serializator = new TxtSerializator();
    private static TxtFileDataSource dataSource = new TxtFileDataSource();

    public static void main(String[] args) throws Exception {
        UserLogic userLogic = new UserLogic(dataSource.getNursery(), serializator);
        userLogic.runUserActionMenu();
    }
}
