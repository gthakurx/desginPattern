package Version3;

public interface Database {
    DatabaseFactory createDatabaseFactory(); // Use of Factory Method provide the interface
    //for creating Object in superclass but allow subclass to alter the type of object that will be creating
    //example of pizza factory
    //
    //Sure! Imagine you're in a pizza restaurant.
    // You have different types of pizzas like cheese, pepperoni, and veggie.
    // Instead of making each pizza from scratch every time someone orders,
    // you have a "Pizza Factory." You tell the factory what type of pizza you
    // want (e.g., cheese, pepperoni), and it churns out the exact pizza you asked for
    // without you having to worry about the details of making it. So, the factory pattern
    // simplifies the process of creating different types of objects without needing to kno
    // w their specific implementations.





}
