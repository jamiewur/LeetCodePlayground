package Algorithm.Easy;

public class NumberLinesToWriteString {
    public int[] numberOfLines(int[] widths, String S) {
        int maxWidth = 0;
        int line = 1;
        int[] result = new int[2];
        int n = S.length(),i,rest=0;

        for(i=0;i<n;i++){
            int a = Character.hashCode(S.charAt(i)) - 97;
            maxWidth += widths[a];
            if(rest+widths[a]<=100){
                rest+=widths[a];
            }
            else {
                rest=widths[a];
                line++;
            }
        }

        result[0] = line;
        result[1] = rest;
        return result;
    }
}
