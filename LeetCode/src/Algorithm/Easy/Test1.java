package Algorithm.Easy;

import java.util.Arrays;

public class Test1 {
    public void solution(int N) {
        // write your code in Java SE 8

        // print in col
        for (int c = 0; c < N - 1; c++) {
            System.out.println("L");
        }


        // print in row
        for (int r = 0; r < N; r++) {
            System.out.print("L");
        }
    }
}
