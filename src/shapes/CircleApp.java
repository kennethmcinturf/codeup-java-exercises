package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Boolean toContinue;
        Integer numberOfCircles;
        do {
            Double radius = input.getDouble("Please enter the radius of your circle");
            Circle circle = new Circle(radius);
            numberOfCircles = circle.getNumberOfCircles();
            System.out.printf("The Circumfrence of the circle is %f%n", circle.getCircumfrence());
            System.out.printf("The Area of the circle is %f%n", circle.getArea());
            toContinue = input.yesNO("Would you like to continue?");
        }while (toContinue);
        System.out.printf("The number of Circles you created equals %d", numberOfCircles);
    }
}
