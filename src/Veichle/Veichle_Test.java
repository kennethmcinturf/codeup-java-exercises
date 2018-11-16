package Veichle;

public class Veichle_Test {
    public static void main(String[] args) {
        Veichle veichle = new Car(5,"hfjhf",7);
        Car car = (Car) veichle;
        car.isItImpounded();
    }
}
