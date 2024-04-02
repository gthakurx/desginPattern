package strategy.version2.pathcalculatorstrategy;

public class BikePathCalculatorStrategy implements PathCalculatorStrategy{
    @Override
    public void findPath(String from, String to) {
        System.out.println("Find path by Bike"+from+to);
    }
}
