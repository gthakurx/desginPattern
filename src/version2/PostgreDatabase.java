package version2;

public class PostgreDatabase implements Database{

    @Override
    public Query createQuery() {
        return (Query) new PostgreSqlquery();
    }
}
