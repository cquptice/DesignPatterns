import Color.*;
import Shape.Shape;

public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if (color == null) return null;
        if (color.equalsIgnoreCase("red")) return new Red();
        if (color.equalsIgnoreCase("blue")) return new Blue();
        if (color.equalsIgnoreCase("green")) return new Green();
        else return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
