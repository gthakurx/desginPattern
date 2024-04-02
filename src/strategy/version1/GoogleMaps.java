package strategy.version1;


//This will voilate the SRP and OCP . so we need to think of solving a problem of finding path by using different ways
// if we have different ways to solve the problem then we Use strategy Design pattern
// check in Version 2 .
public class GoogleMaps {
    public void findPath(String from,String to,Mode mode){
        if(mode.equals(Mode.CAR)) {
            System.out.println("find Path by Car");
        }else if(mode.equals(Mode.WALK)) {
            System.out.println("Find path by walk");
        }else if(mode.equals(Mode.BIKE)){
            System.out.println("Find path by Bike");
        } else if (mode.equals(Mode.PUBLIC)) {
            System.out.println("Find path by Public transport");
        }
    }
}
