package Algorithm.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class OccurrencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> a = new ArrayList<>();
        String[] b = new String[a.size()];
        String[] c =text.split(" ");

        for(int i=0;i<c.length-2;i++){
            if(c[i].equals(first) && c[i+1].equals(second)) a.add(c[i+2]);
        }
        return a.toArray(b);
    }
}
