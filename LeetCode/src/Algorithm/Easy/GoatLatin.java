package Algorithm.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoatLatin {
    public String toGoatLatin(String S) {
        String[] s = S.split(" ");
        List<Character> l = Arrays.asList('a','e','i','o','u', 'A','E','I','O','U');
        StringBuilder sb = new StringBuilder();

        for (int i =0; i < s.length; i++) {
            if(l.contains(s[i].charAt(0))) s[i] = s[i].concat("ma");
            else {
                s[i] = s[i].substring(1).concat(s[i].substring(0,1)).concat("ma");
            }
            for (int j = 0; j < i + 1; j++){
                s[i] = s[i].concat("a");
            }
            sb.append(s[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
