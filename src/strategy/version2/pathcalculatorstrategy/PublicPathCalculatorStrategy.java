package strategy.version2.pathcalculatorstrategy;

public class PublicPathCalculatorStrategy implements PathCalculatorStrategy{
    @Override
    public void findPath(String from, String to) {
        System.out.println("Find path by Public transport"+from+to);
    }
}
