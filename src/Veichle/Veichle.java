package Veichle;

public class Veichle {
    protected int milesPerGallon;
    protected String colorOfVeichle;
    protected int value;

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public void setColorOfVeichle(String colorOfVeichle) {
        this.colorOfVeichle = colorOfVeichle;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Veichle(int milesPerGallon, String colorOfVeichle, int value) {
        this.milesPerGallon = milesPerGallon;
        this.colorOfVeichle = colorOfVeichle;
        this.value = value;
    }

//    public Veichle() {
//        this.milesPerGallon = 1;
//        this.colorOfVeichle = "white";
//        this.value = 1;
//    }

    public static void startVeichle(){
        System.out.println("Vroom Vroom!");
    }

    public static String paintTheVeichle(Veichle veichle, String newColor){
        return veichle.colorOfVeichle = newColor;
    }

}
