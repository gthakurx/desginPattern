package Version3;

public class MySqlDatabase implements Database{
    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new MySqlDatabaseFactory();
    }
}
