import Factory.Shape;

public class FactoryPatternMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.get("circle");
        shape1.getShape();
        Shape shape2 = shapeFactory.get("rectangle");
        shape2.getShape();
        Shape shape3 = shapeFactory.get("square");
        shape3.getShape();
    }
}
