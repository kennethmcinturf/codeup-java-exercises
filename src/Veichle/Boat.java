package Veichle;

public class Boat extends Veichle{
    protected String colorOfBoat;
    protected int milesPerKnot;

    public Boat(int milesPerKnot, String colorOfBoat, int value) {
        super(milesPerKnot, colorOfBoat, value);
    }

    public Boat(int milesPerKnot) {
        super(milesPerKnot, "white", 0);
        colorOfBoat = "White";
    }

}
