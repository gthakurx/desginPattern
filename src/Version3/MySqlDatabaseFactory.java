package Version3;

public class MySqlDatabaseFactory implements DatabaseFactory{
    @Override
    public Query createQuery() {
        return (Query) (Query) (Query) new MySqlQuery();
    }
}
