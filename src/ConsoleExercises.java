import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.format("The value of pie is %.2f \n", pi);
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("[ ,\\r\\n]");

//        System.out.println("Enter an Interger: ");
//        int userInt = scanner.nextInt();

//        System.out.println(" You entered " + userInt);
//        System.out.println("Enter 3 words: ");
//        String userWordOne = scanner.next();
//        String userWordTwo = scanner.next();
//        String userWordThree = scanner.next();
//        System.out.println(" You lazy " + userWordOne + " jumped " + userWordTwo + " the strong " + userWordThree);

//        System.out.println("Enter A Sentence: ");
//        String userSentence = scanner.nextLine();
//        System.out.println("Heres your sentence: " + userSentence);

//        System.out.println("Enter the width of the room: ");
//        String userWidth = scanner.nextLine();
//        System.out.println("Enter the length of the room: ");
//        String userLength = scanner.nextLine();
//        System.out.println("Enter the height of the room: ");
//        String userHeight = scanner.nextLine();
//        Float width = Float.valueOf(userWidth);
//        Float length = Float.valueOf(userLength);
//        Float height = Float.valueOf(userHeight);
//        Float area = width * length;
//        Float perimeter = (2 * width) + (2 * length);
//        Float volume = width * length * height;
//        System.out.printf("The area of the room is %s\nThe perimeter of the room is %s\nThe volume of the room is %s \n", area,perimeter,volume);

//        System.out.println("Enter your favorite quote: ");
//        String userQuote = scanner.nextLine();
//        System.out.println(userQuote);
//        System.out.println("How many words are in that quote?");
//        int wordsInQuote = scanner.nextInt();
//        if (wordsInQuote == userQuote.split("\\s+").length){
//            System.out.println("That's Right");
//        }else {
//            System.out.println("No, there's " + userQuote.split("\\s+").length + " in the quote");
//        }

//        System.out.println("Enter your top 3 favorite foods(seperated only by spaces)");
//        String favoriteFoodOne = scanner.next();
//        String favoriteFoodTwo = scanner.next();
//        String favoriteFoodThree = scanner.next();
//        System.out.printf("1) %s\n2) %s\n3) %s", favoriteFoodOne,favoriteFoodTwo,favoriteFoodThree);

        System.out.println("Enter a list of 3 grocery items(seperated by only a comma)");
//        String groceryList = scanner.nextLine();
//        String groceryListOne = groceryList.split(",")[0];
//        String groceryListTwo = groceryList.split(",")[1];
//        String groceryListThree = groceryList.split(",")[2];
        String groceryListOne = scanner.next();
        String groceryListTwo = scanner.next();
        String groceryListThree = scanner.next();
        System.out.printf("The items in your grocery list are %s, %s, and %s.", groceryListOne,groceryListTwo,groceryListThree);
}}
