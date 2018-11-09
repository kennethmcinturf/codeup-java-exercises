public class JS_test_two {
    public static void main(String[] args) {

    }
    public static boolean isNegative(int value){
        String aValue = Integer.toString(value).substring(0,1);
        if (aValue.equals("-")) {
            return true;
        }
        return false;
    }
}
