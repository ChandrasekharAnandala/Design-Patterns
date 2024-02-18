package strategy;

public class Car implements PathCalculatorStrategy{
    @Override
    public String findPath(String source, String destination) {
        return "Car Path...";
    }
}
