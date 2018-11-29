import java.sql.Array;
import java.util.*;







public class Marker {
    public static void main(String[] args) {
        int[][] primes = new int[3][3];
        primes[2][2] = 1;

        System.out.println(primes[1][2]);
    }


    public int scoresAverage(int[] scores) {
        int breakpoint = scores.length/2;
        int firstAverage = average(scores, 0, breakpoint);
        int secondAverage = average(scores, breakpoint, breakpoint + breakpoint);
        if (firstAverage > secondAverage){
            return firstAverage;
        }else {
            return secondAverage;
        }
    }

    public int average(int[] scores, int start, int end) {
        int[] temp = new int[end];
        int answer = 0;
        for (int i = start; i < end; i++){
            temp[i] = scores[i];
        }
        for (int i = 0; i < temp.length; i++){
            answer = answer + temp[i];
        }
        return answer / temp.length;
    }
}



