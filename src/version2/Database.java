package version2;

public interface Database {
    Query createQuery();
    //in ordert o avoid the Client class to implement
    //and avoid OCP if else check let the Database Interface
    //have createQuery();
    //and another usage such as thiws is more problemetic
    // and again voilates SRP , database interface have
    //method to do another Job as well
    //when SRP voilates we solve using distributing reponsibility
    //createConnection();
    //createTransaction();
    //createSecurityLayer();
}
