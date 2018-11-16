package shapes;

import java.text.DecimalFormat;
import java.util.Arrays;

public class ShapesTest {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Rectangle box1 = new Rectangle(5,4);
        Rectangle box2 = new Square(5);
        System.out.println(box2.getPerimeter());
        Measurable myShape = new Rectangle(32.345,17.665);
        System.out.println(df.format(myShape.getArea()));
        System.out.println(myShape.getPerimeter());
    }
}
