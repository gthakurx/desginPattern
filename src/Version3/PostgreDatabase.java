package Version3;

public class PostgreDatabase implements Database {
        @Override
        public DatabaseFactory createDatabaseFactory() {
                return new PostGreDatabaseFactory();
        }
}
