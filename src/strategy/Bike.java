package strategy;

public class Bike implements PathCalculatorStrategy{
    @Override
    public String findPath(String source, String destination) {
        return "Bike Path...";
    }
}
