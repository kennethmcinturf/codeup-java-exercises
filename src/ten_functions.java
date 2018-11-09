public class ten_functions {
    public static void main(String[] args) {
        System.out.println(not("something"));
    }
    public static boolean isFalse(boolean value){
        if (!value){
            return true;
        }
        return false;
    }
    public static boolean isFalse(String value){
        return value.equals("false");
    }
    public static boolean not(boolean value){
        return !value;
    }
    public static boolean not(String value){
        boolean String = Boolean.valueOf(value);
        System.out.println(String);
        return !String;
    }
    public static boolean not(int value){
       return value == 0;
    }
    public static int addOne(int a){
        return a + 1;
    }
    public static boolean addOne(boolean a){
        return false;
    }
}
