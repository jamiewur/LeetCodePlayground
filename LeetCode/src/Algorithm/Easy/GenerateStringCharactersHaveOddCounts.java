package Algorithm.Easy;

public class GenerateStringCharactersHaveOddCounts {
    public String generateTheString(int n) {
        char[] c = new char[n];
        StringBuilder sb = new StringBuilder(n);

        // Generate a string
        if (n == 0) return "";
        if (n == 1) return "a";

        if ( n % 2 == 0) {
            for (int i = 0; i < ( n - 1 ) ; i++) c[i] = 'a';
            c[n] = 'b';
        }
        else {
            for (int i = 0; i < ( n - 2 ) ; i++) c[i] = 'a';
            c[n-1] = 'b';
            c[n] = 'c';
        }


        return sb.append(c).toString();
    }
}
