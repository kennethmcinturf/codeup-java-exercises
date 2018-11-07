import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
//        int i = 1;
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

        String grades = "";
        boolean confirmation;

        do {
            System.out.println("What is the student's grade?");
            int grade = scanner.nextInt();
            if (grade > 88){
                grades = grades + "A, ";
            }else if (grade >= 80 && grade < 88){
                grades = grades + "B, ";
            }else if (grade >= 67 && grade < 80){
                grades = grades + "C, ";
            }else if (grade >= 60 && grade < 66){
                grades = grades + "D, ";
            }else{
                grades = grades + "F, ";
            }
            System.out.print("Continue? [y/N] ");
            String userInput = scanner.next();
            confirmation = userInput.equals("y");
        }while (confirmation == true);

        grades = grades.substring(0,(grades.length() - 2));

        System.out.println("Your grades are " + grades);

//        System.out.println("What is the student's grade?");
//        int grade = scanner.nextInt();
//        if (grade > 88){
//            System.out.println("A");
//        }else if (grade >= 80 && grade < 88){
//            System.out.println("B");
//        }else if (grade >= 67 && grade < 80){
//            System.out.println("C");
//        }else if (grade >= 60 && grade < 66){
//            System.out.println("D");
//        }else{
//            System.out.println("F");
//        }


        }
    }

