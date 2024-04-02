package strategy.version2.pathcalculatorstrategy;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy{
    @Override
    public void findPath(String from, String to) {
        System.out.println("Find path by Car "+from+" "+to);
    }
}
