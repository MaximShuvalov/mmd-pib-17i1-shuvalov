import DataSources.*;

public class Program {
    private static DataSource dataSource = new CodeSource();
    private static UserLogic userLogic = new UserLogic(dataSource.getNursery());

    public static void main(String[] args) throws Exception {
        userLogic.runUserActionMenu();
    }
}
