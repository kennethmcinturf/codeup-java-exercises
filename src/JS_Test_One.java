public class JS_Test_One {
    public static void main(String[] args) {
        System.out.println(palindrom("radar"));
    }
    public static boolean isABoolean(String value){
        boolean isBoolean;
        if (value.equals("true") || value.equals("false")){
            isBoolean = true;
        }else {
            isBoolean = false;
        }
        return isBoolean;
    }
    public static boolean isNumeric(String value){
        try {
            Integer.parseInt(value);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }
    public static boolean isArray(String value){
        boolean isBoolean;
        if (value.startsWith("[")){
            isBoolean = true;
        }else {
            isBoolean = false;
        }
        return isBoolean;
    }
    public static boolean isPositive(String value){
        if (value.startsWith("+")){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isPositive(int value){
        boolean isBoolean = true;
        String aValue = Integer.toString(value).substring(0,1);
        System.out.println(aValue);
        if (aValue.equals("-")) {
            isBoolean = false;
        }
        return isBoolean;
    }
    public static boolean isPositive(boolean value){
        return false;
    }
    public static int decrement(int value){
        return --value;
    }
    public static int increment(int value){
        return ++value;
    }
    public static int square(int value){
        return value * value;
    }
    public static String upperCase(String value){
        return value.toUpperCase();
    }
    public static Boolean palindrom (String value){
        String reversed = new StringBuilder(value).reverse().toString();
        if (value.equals(reversed)){
            return true;
        }else {
            return false;
        }
    }
    public static int highestNumber (int a, int b, int c){
        if (a > c && a > b){
            return a;
        }else if (b > c && b > a){
            return b;
        }
        return c;
    }
    public static boolean containsVowel(String value){
        if (value.toLowerCase().indexOf('a') == -1 && value.toLowerCase().indexOf('e') == -1 && value.toLowerCase().indexOf('i') == -1 && value.toLowerCase().indexOf('o') == -1 && value.toLowerCase().indexOf('i') == -1){
            return false;
        }
        return true;
    }
    public static int add(int a, int b){
        return a + b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int sumOfSquares(int a, int b){
        return add(multiply(a,a),multiply(b,b));
    }
}
