package Version3;

public class PostGreDatabaseFactory implements DatabaseFactory{
    @Override
    public Query createQuery() {
        return new PostgreSqlquery();
    }
}
