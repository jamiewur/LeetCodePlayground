package Algorithm.Easy;

public class ConsecutiveCharacters {
    public int maxPower(String s) {
        if (s.length() == 0) return 0;

        int max = 0; int count = 1; char current = ' ';

        for (char c: s.toCharArray()) {
            if (current == ' ') {
                current = c;
            }

            if ( c != current ) {
                count = 1;
                current = c;
            } else count++;

            max = Math.max(count, max);
        }
        return max;
    }
}
