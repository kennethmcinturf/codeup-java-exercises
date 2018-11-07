import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.format("The value of pie is %s \n", pi);
        Scanner scanner = new Scanner(System.in);

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

        System.out.println("Enter the width of the room: ");
        String userWidth = scanner.nextLine();
        System.out.println("Enter the length of the room: ");
        String userLength = scanner.nextLine();
        System.out.println("Enter the height of the room: ");
        String userHeight = scanner.nextLine();
        Float width = Float.valueOf(userWidth);
        Float length = Float.valueOf(userLength);
        Float height = Float.valueOf(userHeight);
        Float area = width * length;
        Float perimeter = (2 * width) + (2 * length);
        Float volume = width * length * height;
//        System.out.println("The Area of the room is " + area);
//        System.out.println("The Perimeter of the room is " + perimeter);
//        System.out.println("The area of the room is " + area + "\n The perimeter of the room is " + perimeter + "\n The volume of the room is " + volume);
        System.out.printf("The area of the room is %s\nThe perimeter of the room is %s\nThe volume of the room is %s \n", area,perimeter,volume);
}}
