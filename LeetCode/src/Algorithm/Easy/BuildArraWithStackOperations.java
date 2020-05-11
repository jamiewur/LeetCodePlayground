package Algorithm.Easy;

import java.util.ArrayList;
import java.util.List;

public class BuildArraWithStackOperations {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int baseNumber = 0;
        int [] array = new int[n];
        for (int j = 0; j < n; j++) array[j] = j+1;

        for (int i = 0; i < target.length; i++) {
            if ( target[i] - array[i+baseNumber] != 0 ) {
                int m = target[i] - array[i+baseNumber];
                for (int k = 0; k < m; k++) {
                    list.add("Push");
                    list.add("Pop");
                }
                baseNumber += (target[i] - array[i+baseNumber]);
                list.add("Push");
            } else list.add("Push");
        }
        return list;
    }
}
