import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] arg){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = scanner.nextInt();
//        System.out.println(userInput = getInteger(1, 10));
    }
    public static int addition(int a, int b){
        return a + b;
    }
    public static int subtraction(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b) {
        if (b == 1){
            return a;
        }
        return a + multiply(a, (b - 1));
    }
    public static int divide(int a, int b){
        return a / b;
    }
    public static int modulus(int a, int b){
        return a % b;
    }
    public static boolean isWithinBounds(int min, int max, int input){
        if (input < min || input > max){
            return false;
        }else{
            return true;
        }
    }
    public static long factorial(int a) {
        long result = a;
        for (int i = (a - 1); i > 0; i--){
            result = result * i;
        }
        return result;
    }
    public static long factorial(String question){
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        int factorialForThis = scanner.nextInt();
        long result = factorialForThis;
        for (int i = (factorialForThis - 1); i > 0; i--){
            result = result * i;
        }
        return result;
    }
    public static void rollDice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides do you want dice to have?");
        int sidesOfDice = scanner.nextInt();
        int diceA = makeDice(sidesOfDice);
        int diceB = makeDice(sidesOfDice);
        System.out.printf("The dice rolled %d and %d", diceA, diceB);
    }
    public static int makeDice(int sidesOfDice){
        return (int) ((java.lang.Math.random() * sidesOfDice) +1);
    }
}
