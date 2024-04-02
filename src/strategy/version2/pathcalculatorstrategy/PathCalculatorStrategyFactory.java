package strategy.version2.pathcalculatorstrategy;

import strategy.version2.Mode;

public class PathCalculatorStrategyFactory {
    public static PathCalculatorStrategy getStrategy(Mode mode){

        switch (mode){
            case CAR:
                    return new CarPathCalculatorStrategy();
            case BIKE:
                return new BikePathCalculatorStrategy();
            case WALK:
                return new WalkPathCalculatorStrategy();
            case PUBLIC:
                return new PublicPathCalculatorStrategy();
            default:
                return new PublicPathCalculatorStrategy();
        }


    }
}
