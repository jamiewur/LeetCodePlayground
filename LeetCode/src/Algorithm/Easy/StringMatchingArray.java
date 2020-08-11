package Algorithm.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringMatchingArray {
    public List<String> stringMatching(String[] words) {
        List<String> sm = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; ++j ) {
                if (words[i].contains(words[j])) {
                    set.add(words[j]);
                } else if (words[j].contains(words[i])){
                    set.add(words[i]);
                }
            }
        }
        sm.addAll(set);
        return sm;
    }
}
