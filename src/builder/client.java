package builder;

public class client {
    public static void main(String[] args) {
        Student s1=Student.createBuilder().setAge(10).setLname("thakur").setPsp(80.50).build();
        System.out.println(s1.getFname());
    }
}
