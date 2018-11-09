import java.util.Scanner;

public class StringExercise {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("[/\n]");
//        String message = "We dont need no education\nWe dont need no thought control";
//         message = "Check \"this\" out!, \"s inside of \"s!";
//         message = "In windows, the main drive is usually C:\\";
//        message = "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\!";
//        System.out.println(message);
//
//        System.out.println("What is the date");
//        int month = scanner.nextInt();
//        int day = scanner.nextInt();
//        int year = scanner.nextInt();
//        System.out.println(year);
//        String stringMonth = "";
//        String stringDay;
//        String stringYear = "" + year;
//        if (month == 1){
//            stringMonth = "January";
//        }else if (month == 2){
//            stringMonth = "February";
//        }else if (month == 3){
//            stringMonth = "March";
//        }else if (month == 4){
//            stringMonth = "April";
//        }else if (month == 5){
//            stringMonth = "May";
//        }else if (month == 6){
//            stringMonth = "June";
//        }else if (month == 7){
//            stringMonth = "July";
//        }else if (month == 8){
//            stringMonth = "August";
//        }else if (month == 9){
//            stringMonth = "September";
//        }else if (month == 10){
//            stringMonth = "October";
//        }else if (month == 11){
//            stringMonth = "November";
//        }else if (month == 12){
//            stringMonth = "December";
//        }
//
//       stringDay = "" + day;
//
//        String dayFormatted = stringMonth + " " + stringDay + ", " + stringYear;
//        System.out.println(dayFormatted);

//        System.out.println("Enter a word");
//        String sentence = (scanner.nextLine()).toLowerCase();
//        int vowelCount = 0;
//        int constantCount = 0;
//        for (int x = 0; x < sentence.length(); x++){
//            if (sentence.charAt(x) == 'a' || sentence.charAt(x) == 'e' || sentence.charAt(x) == 'i' || sentence.charAt(x) == 'o' || sentence.charAt(x) == 'u'){
//                vowelCount++;
//            }else {
//                constantCount++;
//            }
//        }
//        System.out.printf("The number of vowels is %d\n", vowelCount);
//        System.out.printf("The number of constants is %d", constantCount);

        boolean continueMath;
        float doMath = 0;

        System.out.println("WELCOME TO THE CALCULATOR APP!!");
        System.out.println("Would you like to do some Math?");
        String continueDoingMath = scanner.nextLine();
        continueMath = continueDoingMath.equals("yes");
        do {
            System.out.println("How many operands do you have");
            int operands = scanner.nextInt();
            System.out.println("Please enter a equations (with spaces)");
            float firstNumber = scanner.nextFloat();
            doMath = 0;
            doMath = doMath + firstNumber;
            for (int i = 1; i < operands; i++){
                String operator = scanner.next();
                float number = scanner.nextFloat();
                if (operator.equals("+")){
                    doMath = doMath + number;
                }else if (operator.equals("-")){
                    doMath = doMath - number;
                }else if (operator.equals("*")){
                    doMath = doMath * number;
                }else if (operator.equals("/")){
                    doMath = doMath / number;
                }
            }
            System.out.println(doMath);
            scanner.nextLine();
            System.out.println("Would you like to do some Math?");
            continueDoingMath = scanner.nextLine();
            continueMath = continueDoingMath.equals("yes");
        }while (continueMath);
    }
}
