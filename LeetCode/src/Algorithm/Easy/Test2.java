package Algorithm.Easy;

public class Test2 {
    public String solution(String S) {
        // write your code in Java SE 8

        // if N < 3, return tie
        if (S.length() < 3) return "tie";

        char [] cArray = S.toCharArray();
        boolean xwin = false; boolean owin = false;
        char curc = cArray[0]; int count = 0;

        for (char c: cArray) {
            if (c == curc) count++;
            else {
                count = 1;
                curc = c;
            }
            if (count >= 3) {
                if (curc == 'X') xwin = true;
                else owin = true;
            }
            if (owin && xwin) break;
        }

        // return result
        if (xwin && !owin) return "X";
        else if (!xwin && owin) return "O";
        else return "tie";
    }
}
