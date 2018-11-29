package shapes;

public class Circle {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
    }
    private double radius;
    private static double Pi = 3.14;
    private static int numberOfCircles = 0;

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }

    public static void setNumberOfCircles(int numberOfCircles) {
        Circle.numberOfCircles = numberOfCircles;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius){
        numberOfCircles++;
        this.radius = radius;
    }

    public double getArea(){
        return (this.radius * Pi) * (this.radius * Pi);
    }

    public double getCircumfrence(){
        return (2 * Pi * this.radius);
    }
}
