import java.sql.Array;
import java.util.*;







public class Marker {
    public static void main(String[] args) {
        int[][] primes = new int[3][3];
        primes[2][2] = 1;

        System.out.println(primes[1][2]);
    }

    public int sumDigits(int n) {
        if (Integer.toString(n).length() == 1){
            return Integer.parseInt(Integer.toString(n));
        }
        return Integer.parseInt(Integer.toString(n).substring(0, 1)) + sumDigits(Integer.parseInt(Integer.toString(n).substring(1)));
    }
}



