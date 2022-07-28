import Factory.Circle;
import Factory.Rectangle;
import Factory.Shape;
import Factory.Square;

public class ShapeFactory {
    public Shape get(String shapeName) {
        if (shapeName == null) return null;
        if (shapeName.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        if (shapeName.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        if (shapeName.equalsIgnoreCase("square")) {
            return new Square();
        } else return null;
    }
}
