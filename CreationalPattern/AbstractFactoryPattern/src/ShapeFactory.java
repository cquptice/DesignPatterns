import Color.Color;
import Shape.*;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeName) {
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
