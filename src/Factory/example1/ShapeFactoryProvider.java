package Factory.example1;

public class ShapeFactoryProvider {

    public static ShapeFactory getFactory(ShapeType shapeType){
        switch (shapeType){
            case CIRCLE -> {
                return new CircleFactory();
            }
            case RECTANGLE -> {
                return new RectangleFactory();
            }

            default -> throw new IllegalArgumentException("Invalid shape type");
        }
    }
}
