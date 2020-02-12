package Algorithm.Easy;

public class SplitStringinBalancedStrings {
    public int balancedStringSplit(String s) {
        int n = 0;
        int cr = 0;
        int cl = 0;

        for(char c:s.toCharArray()){
            if(c=='R') cr++;
            else cl++;
            if(cr == cl) n++;
        }
        return n;
    }
}