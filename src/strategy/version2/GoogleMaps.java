package strategy.version2;

import strategy.version2.pathcalculatorstrategy.PathCalculatorStrategy;
import strategy.version2.pathcalculatorstrategy.PathCalculatorStrategyFactory;

public class GoogleMaps {

    public static void PathUsingMultipleWays(String from, String to , Mode mode ){
        PathCalculatorStrategy pcs= PathCalculatorStrategyFactory.getStrategy(mode);//getting the mode runtime
        pcs.findPath(from,to);
    }

    public static void main(String[] args) {
        PathUsingMultipleWays("home","office",Mode.CAR);
    }
}
