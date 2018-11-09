import java.util.Scanner;

public class Highlow {
    public static void main(String[] args) {
        System.out.println(guessNumber());
    }
    public static int randomNumber() {
        return (int) ((java.lang.Math.random() * 100) +1);
    }
    public static String guessNumber() {
        boolean isNumberCorrect = false;
        int correctNumberNumber = randomNumber();
        int numberOfGuesses = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game! You will only have 10 guesses to guess a number between 1 and 100");
        System.out.println("So choose your first guess wisely...");
        int guessedNumber = scanner.nextInt();
        scanner.nextLine();
        isNumberCorrect = (guessedNumber == correctNumberNumber);
        if (!isNumberCorrect){
            do {
                if (guessedNumber < correctNumberNumber){
                    System.out.println("Higher");
                }else if (guessedNumber > correctNumberNumber){
                    System.out.println("Lower");
                }
                numberOfGuesses++;
                if (numberOfGuesses > 9){
                    return "You lose!! The correct number was " + correctNumberNumber;
                }
                System.out.printf("Number of guesses: %d \n", numberOfGuesses);
                System.out.println("Guess Again");
                guessedNumber = scanner.nextInt();
                scanner.nextLine();
                isNumberCorrect = (guessedNumber == correctNumberNumber);
            }while (!isNumberCorrect);
        }
        return "That's correct, the number was " + correctNumberNumber;
    }
}
