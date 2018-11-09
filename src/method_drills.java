public class method_drills {
    public static void main(String[] args) {
        System.out.println(printLetter("Ball"));
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
