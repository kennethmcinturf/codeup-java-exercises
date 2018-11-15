package shapes;

import java.util.Arrays;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        Rectangle box2 = new Square(5);
        System.out.println(box2.getArea());
    }
}
