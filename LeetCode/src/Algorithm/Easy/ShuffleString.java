package Algorithm.Easy;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] ch = new char[indices.length];
        int j = 0;
        for (int i: indices) {
            ch[i] = s.charAt(j);
            j++;
        }
        return new String(ch);
    }
}
