package version2;

public class MySqlDatabase implements Database{

    @Override
    public Query createQuery() {
        return (Query) new MySqlQuery();
    }
}
