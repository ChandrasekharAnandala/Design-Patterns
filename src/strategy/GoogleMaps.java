package strategy;

public class GoogleMaps {
    public String findPath(String source,String destination, Modes mode){
    PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalcuator(mode);
    return pathCalculatorStrategy.findPath(source,destination);
    }
}
