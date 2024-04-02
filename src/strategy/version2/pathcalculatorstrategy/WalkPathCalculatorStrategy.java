package strategy.version2.pathcalculatorstrategy;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy{
    @Override
    public void findPath(String from, String to) {
        System.out.println("Find path by walk"+from+to);
    }
}
