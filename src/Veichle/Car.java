package Veichle;

import util.Input;

public class Car extends Veichle {
    private String makeOfCar;

//    public String getMakeOfCar() {
//        return makeOfCar;
//    }

//    public void setMakeOfCar(String makeOfCar) {
//        this.makeOfCar = makeOfCar;
//    }

    public Car(int milesPerGallon, String colorOfVeichle, int value) {
        super(milesPerGallon, colorOfVeichle, value);
//        this.makeOfCar = getMakeOfCar();
    }


    public static void isItImpounded(){
        Input input = new Input();
        Boolean isImpounded = input.yesNO("Have You been Making Payments?");
        if (isImpounded){
            System.out.println("No, you good homey");
        }else {
            System.out.println("Yeah, whips already gone");
        }
    }
}
