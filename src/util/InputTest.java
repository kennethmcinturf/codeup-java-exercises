package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println("Please Enter a String");
//        String string = input.getString();
//        System.out.println(string);
//        System.out.println("Please Enter a Boolean");
//        Boolean isThisTrue = input.yesNO();
//        System.out.println(isThisTrue);
//        System.out.println("Please Enter a Interger");
//        Integer thisInterger = input.getInt();
//        System.out.println(thisInterger);
//        System.out.println("Please Enter a Double");
//        Double aDouble = input.getDouble();
//        System.out.println(aDouble);
//        System.out.println("Please Enter a integer between 1 and 100");
//        Integer between1and100 = input.getInt(1,100);
//        System.out.println(between1and100);
//        System.out.println("Please Enter a double between 3 and 80");
//        Double between3and80 = input.getDouble(3,80);
//        System.out.println(between3and80);
//        int number = 111;
//        System.out.println(Integer.parseInt(String.valueOf(number), 2));
        System.out.println("Please enter a hex value");
        int hex = input.getHex();
        System.out.println(hex);
    }
}
