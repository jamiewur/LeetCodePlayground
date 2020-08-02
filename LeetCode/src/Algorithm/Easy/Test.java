package Algorithm.Easy;

public class Test {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int res = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i: A) {
            if ( i > max ) max = i;
            if ( i < min ) min = i;
        }

        if ( max < 0 ) return 1;
        boolean has;
        do {
            has = false;
            res = min++;
            for (int i: A) {
                if ( i == res ) has = true;
            }
            if (!has) return res;
        } while (has);
        return res;
    }

}
