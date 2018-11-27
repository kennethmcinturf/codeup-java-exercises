import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareUp(3)));
    }


    public static int[] squareUp(int n) {
        int[] answer = new int[n*n];
        for (int i = 0; i  < (n * n); i++){
            answer[i] = 0;
        }
        return answer;
    }
}
