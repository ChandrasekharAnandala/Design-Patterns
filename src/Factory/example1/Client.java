package Factory.example1;

public class Client {
    public static void main(String[] args) {
    ShapeFactory shapeFactory = ShapeFactoryProvider.getFactory(ShapeType.CIRCLE);
     Shape shape = shapeFactory.getFactory();
     shape.draw();
    }
}
