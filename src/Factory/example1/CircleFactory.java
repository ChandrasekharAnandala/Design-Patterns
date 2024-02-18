package Factory.example1;

public class CircleFactory implements ShapeFactory{
    @Override
    public Shape getFactory() {
        return new Circle();
    }
}
