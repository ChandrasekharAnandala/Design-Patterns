package Factory.example1;

public class RectangleFactory implements ShapeFactory{
    @Override
    public Shape getFactory() {
        return new Rectangle();
    }
}
