package Algorithm.Easy;

public class DecryptStringfromAlphabetIntegerMapping {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '#') sb.append((char)(s.charAt(i) - '0' + 96));
            else {
                int c = Integer.parseInt(s.substring(i-2,i));
                sb.append((char) (c + 96));
                i -= 2;
            }
        }
        return sb.reverse().toString();
    }
}
