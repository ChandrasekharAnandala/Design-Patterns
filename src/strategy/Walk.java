package strategy;

public class Walk implements PathCalculatorStrategy{
    @Override
    public String findPath(String source, String destination) {
        return "Walk Path...";
    }
}
