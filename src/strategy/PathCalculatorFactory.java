package strategy;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalcuator(Modes mode){
        switch (mode){
            case BIKE -> {
                return new Bike();
            }
            case CAR -> {
                return new Car();
            }
            case WALK -> {
                return new Walk();
            }
            default -> throw new IllegalArgumentException("Invalid Mode");
        }
    }
}
