import java.util.Scanner;

public class method_drills {
    public static void main(String[] args) {
        hangman();
    }
    public static void hangman(){
        boolean stillGuessing;
        int wrongCounter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets play hangman");
        System.out.println("Player One, please enter a word");
        String wordToGuess = scanner.nextLine();
        String guessingString = wordToGuess.toLowerCase();
        char [] guessedStringChar = guessingString.toCharArray();
        for (int i = 0; i < wordToGuess.length(); i++){
            guessedStringChar[i] = '*';
        }
        String guessedString = String.valueOf(guessedStringChar);
        System.out.println("Ok player 2, it is now your turn");
        System.out.println("But beware, if you guess more then 6 times, you will be hanged!!");
        stillGuessing = guessingString.equals(wordToGuess);
        char [] guessedStringCharInLoop = guessingString.toCharArray();
        boolean isItRight = false;
        do {
            isItRight = false;
            System.out.println("Player 2, please guess a letter");
            char letterGuessed = scanner.nextLine().charAt(0);
            for (int i = 0; i < wordToGuess.length(); i++){
                if (letterGuessed == guessedStringCharInLoop[i]) {
                    guessedStringChar[i] = letterGuessed;
                    isItRight = true;
                }
            }
            guessedString = String.valueOf(guessedStringChar);
            if (isItRight){
                System.out.println(guessedString);
                System.out.println("Great job, one close to the goal");
            }else {
                System.out.println(guessedString);
                System.out.println("Sorry, that letter is not in the string..");
                wrongCounter++;
            }
            stillGuessing = guessedString.equals(wordToGuess);
            if (wrongCounter == 6){
                System.out.println("You have been HUNG!!");
                System.out.println("GAME OVER");
            }
            if (stillGuessing){
                System.out.println("Player Two Wins, great job!!");
            }
        } while (!stillGuessing && wrongCounter < 6);
    }
//    public static String timeConversion(){
//        String timeConverted;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter you time");
//        String time = scanner.nextLine();
//        System.out.println("Is that time in 12 or 24 hour time?");
//        String twelveOrTwentyFour = scanner.nextLine();
//        int i = time.indexOf(':');
//        timeConverted = time.substring(i + 1);
//        if (twelveOrTwentyFour.equals("12")){
//            if (Integer.parseInt(time.substring(0,i)) <= 12){
//                return time;
//            }else {
//                time = ((Integer.parseInt(time)) - 12) + timeConverted;
//                return time;
//            }
//        }else {
//            if (Integer.parseInt(time.substring(0,i)) >= 12){
//                return time;
//            }else {
//                time = ((Integer.parseInt(time)) + 12) + timeConverted;
//                return time;
//            }
//        }
//    }
    public static void calculator(){
        boolean nextMath;
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the calculator app");
        System.out.println("Would you like to do some math?");
        String continueMath = (scanner.nextLine()).toLowerCase();
        nextMath = continueMath.equals("yes");
        do {
            System.out.println("Please enter a number.");
            int firstNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please enter a operator.");
            String operator = scanner.nextLine();
            System.out.println("Please enter another number.");
            int secondNumber = scanner.nextInt();
            scanner.nextLine();
            if (operator.equals("+")){
                number = addition(firstNumber,secondNumber);
            }else if (operator.equals("-")){
                number = subtraction(firstNumber,secondNumber);
            }else if (operator.equals("/")){
                number = divide(firstNumber,secondNumber);
            }else if (operator.equals("*")){
                number = multiply(firstNumber,secondNumber);
            }
            System.out.printf("The answer is %d.\n", number);
            System.out.println("Would you like to do some more math?");
            continueMath = (scanner.nextLine()).toLowerCase();
            nextMath = continueMath.equals("yes");
        }while (nextMath);
        System.out.println("Thank you for using the math app!!");
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
    public static int stringToNumber(String word){
        String result = "";
        String wordToLowerCase = word.toLowerCase() + "-";
        int i = wordToLowerCase.indexOf('-');
        switch (wordToLowerCase.substring(0, i)){
            case "one":
                result = "1";
                break;
            case "two":
                result = "3";
                break;
            case "three":
                result = "3";
                break;
            case "four":
                result = "4";
                break;
            case "five":
                result = "5";
                break;
            case "six":
                result = "6";
                break;
            case "seven":
                result = "1";
                break;
            case "eight":
                result = "8";
                break;
            case "nine":
                result = "9";
                break;
            case "ten":
                result = "10";
                break;
            case "eleven":
                result = "11";
                break;
            case "twelve":
                result = "12";
                break;
            case "thirteen":
                result = "13";
                break;
            case "fourteen":
                result = "14";
                break;
            case "fifteen":
                result = "15";
                break;
            case "sixteen":
                result = "16";
                break;
            case "seventeen":
                result = "17";
                break;
            case "eighteen":
                result = "18";
                break;
            case "nineteen":
                result = "1";
                break;
            case "twenty":
                switch (wordToLowerCase.substring(i + 1)){
                    case "one-":
                        result = "21";
                        break;
                    case "two-":
                        result = "22";
                        break;
                    case "three-":
                        result = "23";
                        break;
                    case "four-":
                        result = "24";
                        break;
                    case "five-":
                        result = "25";
                        break;
                    case "six-":
                        result = "26";
                        break;
                    case "seven-":
                        result = "27";
                        break;
                    case "eight-":
                        result = "28";
                        break;
                    case "nine-":
                        result = "29";
                        break;
                }
                break;
            case "thirty":
                switch (wordToLowerCase.substring(i+1)){
                    case "one-":
                        result = "31";
                        break;
                    case "two-":
                        result = "32";
                        break;
                    case "three-":
                        result = "33";
                        break;
                    case "four-":
                        result = "34";
                        break;
                    case "five-":
                        result = "35";
                        break;
                    case "six-":
                        result = "36";
                        break;
                    case "seven-":
                        result = "37";
                        break;
                    case "eight-":
                        result = "38";
                        break;
                    case "nine-":
                        result = "39";
                        break;
                }
                break;
            case "forty":
                switch (wordToLowerCase.substring(i+1)){
                    case "one-":
                        result = "41";
                        break;
                    case "two-":
                        result = "42";
                        break;
                    case "three-":
                        result = "43";
                        break;
                    case "four-":
                        result = "44";
                        break;
                    case "five-":
                        result = "45";
                        break;
                    case "six-":
                        result = "46";
                        break;
                    case "seven-":
                        result = "47";
                        break;
                    case "eight-":
                        result = "48";
                        break;
                    case "nine-":
                        result = "49";
                        break;
                }
                break;
            case "fifty":
                switch (wordToLowerCase.substring(i+1)){
                    case "one-":
                        result = "51";
                        break;
                    case "two-":
                        result = "52";
                        break;
                    case "three-":
                        result = "53";
                        break;
                    case "four-":
                        result = "54";
                        break;
                    case "five-":
                        result = "55";
                        break;
                    case "six-":
                        result = "56";
                        break;
                    case "seven-":
                        result = "57";
                        break;
                    case "eight-":
                        result = "58";
                        break;
                    case "nine-":
                        result = "59";
                        break;
                }
                break;
            case "sixty":
                switch (wordToLowerCase.substring(i+1)){
                    case "one-":
                        result = "61";
                        break;
                    case "two-":
                        result = "62";
                        break;
                    case "three-":
                        result = "63";
                        break;
                    case "four-":
                        result = "64";
                        break;
                    case "five-":
                        result = "65";
                        break;
                    case "six-":
                        result = "66";
                        break;
                    case "seven-":
                        result = "67";
                        break;
                    case "eight-":
                        result = "68";
                        break;
                    case "nine-":
                        result = "69";
                        break;
                }
                break;
            case "seventy":
                switch (wordToLowerCase.substring(i+1)){
                    case "one-":
                        result = "71";
                        break;
                    case "two-":
                        result = "72";
                        break;
                    case "three-":
                        result = "73";
                        break;
                    case "four-":
                        result = "74";
                        break;
                    case "five-":
                        result = "75";
                        break;
                    case "six-":
                        result = "76";
                        break;
                    case "seven-":
                        result = "77";
                        break;
                    case "eight-":
                        result = "78";
                        break;
                    case "nine-":
                        result = "79";
                        break;
                }
                break;
            case "eighty":
                switch (wordToLowerCase.substring(i+1)){
                    case "one-":
                        result = "81";
                        break;
                    case "two-":
                        result = "82";
                        break;
                    case "three-":
                        result = "83";
                        break;
                    case "four-":
                        result = "84";
                        break;
                    case "five-":
                        result = "85";
                        break;
                    case "six-":
                        result = "86";
                        break;
                    case "seven-":
                        result = "87";
                        break;
                    case "eight-":
                        result = "88";
                        break;
                    case "nine-":
                        result = "89";
                        break;
                }
                break;
            case "ninety":
                switch (wordToLowerCase.substring(i+1)){
                    case "one-":
                        result = "91";
                        break;
                    case "two-":
                        result = "92";
                        break;
                    case "three-":
                        result = "93";
                        break;
                    case "four-":
                        result = "94";
                        break;
                    case "five-":
                        result = "95";
                        break;
                    case "six-":
                        result = "96";
                        break;
                    case "seven-":
                        result = "97";
                        break;
                    case "eight-":
                        result = "98";
                        break;
                    case "nine-":
                        result = "99";
                        break;
                }
                break;
        }
        return Integer.parseInt(result);
    }

    public static String printLetter(String input){
        if (input.length() == 1){
            return input;
        }
        return input.substring(0, 1) + printLetter(input.substring(1));
    }
    public static String getType(String input){
        return "String";
    }
    public static String getType(boolean input){
        return "Boolean";
    }
    public static String getType(char input){
        return "Char";
    }
    public static String getType(double input){
        return "Double";
    }
    public static int capitalLetter(String userInput){
        int numberOfLetter = 0;
        String upperCase = userInput.toUpperCase();
        for (int i = 0; i < (userInput.length()); i++){
            char searchLetter = userInput.charAt(i);
            char upperCaseLetter = upperCase.charAt(i);
            if (searchLetter == upperCaseLetter){
                numberOfLetter++;
            }
        }
        return numberOfLetter;
    }
    public static Boolean palindrom (String value){
        String reversed = new StringBuilder(value).reverse().toString();
        if (value.equals(reversed)){
            return true;
        }else {
            return false;
        }
    }
    public static String drawVowelBoard(String userInput ){
        String output = "";
        output += ("OUTPUT:\n");
        output += ("| ======== VOWEL COUNT ======== |\n");
        output += ("| A's | E's | I's |  O's |  U's |\n");
        output += ("|  " + findAs(userInput)  + "  |  " +  findEs(userInput) + "  | " +  findIs(userInput) + "   |   " +  findOs(userInput) + "  |  "  +  findUs(userInput)  + "   |\n");
        output += ("| ============================= |\n");
        return output;
    }
    public static int findAs(String userInput){
        int numberOfLetter = 0;
        String lowerCase = userInput.toLowerCase();
        for (int i = 0; i < (userInput.length()); i++){
            char searchLetter = lowerCase.charAt(i);
            if (searchLetter == 'a'){
                numberOfLetter++;
            }
        }
        return numberOfLetter;
    }
    public static int findEs(String userInput){
        int numberOfLetter = 0;
        String lowerCase = userInput.toLowerCase();
        for (int i = 0; i < (userInput.length()); i++){
            char searchLetter = lowerCase.charAt(i);
            if (searchLetter == 'e'){
                numberOfLetter++;
            }
        }
        return numberOfLetter;
    }
    public static int findIs(String userInput){
        int numberOfLetter = 0;
        String lowerCase = userInput.toLowerCase();
        for (int i = 0; i < (userInput.length()); i++){
            char searchLetter = lowerCase.charAt(i);
            if (searchLetter == 'i'){
                numberOfLetter++;
            }
        }
        return numberOfLetter;
    }
    public static int findOs(String userInput){
        int numberOfLetter = 0;
        String lowerCase = userInput.toLowerCase();
        for (int i = 0; i < (userInput.length()); i++){
            char searchLetter = lowerCase.charAt(i);
            if (searchLetter == 'o'){
                numberOfLetter++;
            }
        }
        return numberOfLetter;
    }
    public static int findUs(String userInput){
        int numberOfLetter = 0;
        String lowerCase = userInput.toLowerCase();
        for (int i = 0; i < (userInput.length()); i++){
            char searchLetter = lowerCase.charAt(i);
            if (searchLetter == 'u'){
                numberOfLetter++;
            }
        }
        return numberOfLetter;
    }
}
