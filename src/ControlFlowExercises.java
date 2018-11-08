import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int x = 2;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }

//        do {
//            System.out.println(x);
//            x =(int) Math.pow(x, 2);
//        }while (x <= 1000000);

//        for (int i = 1; i <= 100; i++){
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }else if (i % 5 == 0){
//                System.out.println("Buzz");
//            }else {
//                System.out.println(i);
//            }
//        }

        Scanner scanner = new Scanner(System.in);

//        System.out.println("What number would you like to go up too?");
//        int number = scanner.nextInt();
//        int i = 1;
//        System.out.println(number);
//        System.out.println("Here is your Table!\n");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        do {
//            int squared = (int) Math.pow(i, 2);
//            int cubed = (int) Math.pow(i, 3);
//            System.out.println(" " + i + "  |  "  + squared + "  |  " + cubed);
//            i++;
//        }while (i <= number);

//        String grades = "";
//        boolean confirmation;
//
//        do {
//            System.out.println("What is the student's grade?");
//            int grade = scanner.nextInt();
//            if (grade > 88){
//                if (grade > 98){
//                    grades = grades + "A+, ";
//                }else{
//                    grades = grades + "A, ";
//                }
//            }else if (grade >= 80 && grade < 88){
//                if (grade > 86){
//                    grades = grades + "B+, ";
//                }else{
//                    grades = grades + "B, ";
//                }
//            }else if (grade >= 67 && grade < 80){
//                if (grade > 78){
//                    grades = grades + "C+, ";
//                }else{
//                    grades = grades + "C, ";
//                }
//            }else if (grade >= 60 && grade < 66){
//                if (grade > 64){
//                    grades = grades + "D+, ";
//                }else{
//                    grades = grades + "D, ";
//                }
//            }else{
//                grades = grades + "F, ";
//            }
//            System.out.print("Continue? [y/N] ");
//            String userInput = scanner.next();
//            confirmation = userInput.equals("y");
//        }while (confirmation == true);
//
//        grades = grades.substring(0,(grades.length() - 2));
//
//        System.out.println("The submitted grades are " + grades);

//        boolean continueGame;
//        boolean continueGameTwo;
//        boolean continueGameThree;
//
//        System.out.println("Would you like to go on an adventure? [y/n]");
//        String response = scanner.nextLine();
//        continueGame = response.equals("y");
//        if (continueGame) {
//            do {
//                System.out.println("Where would you like to go to the Store, Park, or Bank?");
//                String responseTwo = (scanner.nextLine()).toLowerCase();
//                continueGame = responseTwo.equals("bank");
//                continueGameTwo = responseTwo.equals("park");
//                continueGameThree = responseTwo.equals("store");
//            }while (!continueGame && !continueGameTwo && !continueGameThree);
//            if (continueGame) {
//                System.out.println("In the middle of your transaction, the bank gets robbed. You try to play a hero, but get shot, and die on the floor, ending your adventure");
//            } else if (continueGameTwo) {
//                do {
//                    System.out.println("You go into the park, and see 3 really cool sections to check out. Would you like to check out the Zoo, Field,or Pool?");
//                    String responseThree = (scanner.nextLine()).toLowerCase();
//                    continueGame = responseThree.equals("zoo");
//                    continueGameTwo = responseThree.equals("field");
//                    continueGameThree = responseThree.equals("pool");
//                } while (!continueGame && !continueGameTwo && !continueGameThree);
//                if (continueGame) {
//                    System.out.println("You see some of the most amazing animals you've ever seen, and discover a new love of zoology. Going home, you feel as if today has been a good day.");
//                } else if (continueGameTwo) {
//                    System.out.println("Laying in a serene field, you begin to notice hooded figures surronding your posistion.\nBefore you can react, you are grabbed, and promptly sacrificed to chutlu, usering in a thousands year of darkness.");
//                }else if (continueGameThree) {
//                System.out.println("After a long day of swimming, the chlorine overwhelms you, and slowly you make your way home, crashing out after a fun day.");
//            }
//            }else if (continueGameThree) {
//            do {
//                System.out.println("As a consumer with disposable income, there are many goods that you can purchase. Being a hungry student, would you like Cereal, Pizza, or Raman?");
//                String responseThree = (scanner.nextLine()).toLowerCase();
//                continueGame = responseThree.equals("cereal");
//                continueGameTwo = responseThree.equals("pizza");
//                continueGameThree = responseThree.equals("raman");
//            }while (!continueGame && !continueGameTwo && !continueGameThree);
//            if (continueGame) {
//                System.out.println("Unknown to you, the cereal has been contaimenanted by disgrunteled food production workers, in a cordinated attack on consumers.\nYour body is found the following Wednesday, having been missed from class.");
//            } else if (continueGameTwo) {
//                System.out.println("The Pizza keeps you focused, enabling you to stay focused on your studies. 10 years later, your good work pays off, as you are elected President of Russia.");
//            } else if (continueGameThree) {
//                System.out.println("You go home and eat Raman.");
//            }
//        } else {
//            System.out.println("Invalid Response");
//        }
//    }else {
//            System.out.println("You dont do anything with your life and die alone and lonely.");
//        }

        boolean isWordCorrect;
        boolean wouldLikeHelp;
        boolean helped = false;
        int wordCount = 0;
        int numberOfGuesses = 0;

        System.out.println("Player One, please enter a word");
        String wordToGuess = (scanner.nextLine()).toLowerCase();
        do {
            System.out.println("Player Two, please enter a word");
            String guessedWord = scanner.nextLine();
            isWordCorrect = guessedWord.equals(wordToGuess.toLowerCase());
            for (int i = 0; i <= wordToGuess.length() - 1; i++){
                if (guessedWord.length() < wordToGuess.length()){
                    for (int x = 1; x <= (wordToGuess.length() - guessedWord.length()); x++){
                        guessedWord = guessedWord + " ";
                        x++;
                    }
                }
                if (wordToGuess.charAt(i) == guessedWord.charAt(i)){
                    wordCount++;
                }
            }
            System.out.printf("You have %d letters correct.\n", wordCount);
            if (wordCount < guessedWord.length()){
                System.out.println("That is not correct, please guess again");
            }
            wordCount = 0;
            numberOfGuesses++;
            if (numberOfGuesses >= 5){
                if (helped || isWordCorrect){
                    break;
                }
                System.out.println("Would you like some help? [y/n]");
                String help = scanner.nextLine();
                wouldLikeHelp = help.equals("y");
                if (wouldLikeHelp && !isWordCorrect){
                    System.out.printf("There are %d letters in the word.\n", wordToGuess.length());
                    System.out.println("Please guess again.");
                    helped = true;
                }
            }
        }while (!isWordCorrect);

        System.out.printf("Congrats, the word was %s", wordToGuess);

    }
}


