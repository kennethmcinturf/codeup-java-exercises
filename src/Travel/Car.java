package Travel;

import util.Input;

public class Car extends Veichle {
    private String makeOfCar;

    public String getMakeOfCar() {
        return makeOfCar;
    }

    public void setMakeOfCar(String makeOfCar) {
        this.makeOfCar = makeOfCar;
    }

    public Car(int milesPerGallon, String colorOfVeichle, int value) {
        super(milesPerGallon, colorOfVeichle, value);
        this.makeOfCar = getMakeOfCar();
    }

    public Car(int milesPerGallon, String colorOfVeichle, String makeOfCar, int value) {
        super(milesPerGallon, colorOfVeichle, value);
        setMakeOfCar(makeOfCar);
    }

    public static boolean isItImpounded(){
        Input input = new Input();
        return !input.yesNO("Have You been Making Payments?");
    }
}
