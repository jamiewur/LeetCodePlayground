package Algorithm.Easy;

import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        String[] ruleKeys = {"type", "color", "name"};
        int index = Arrays.asList(ruleKeys).indexOf(ruleKey);

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(index).equals(ruleValue)) res += 1;
        }


        return res;
    }
}
