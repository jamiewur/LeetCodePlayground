package Algorithm.Easy;

import java.util.LinkedList;
import java.util.List;

public class CreateTargetArrayGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new LinkedList<>();

        for (int i = 0;i < nums.length; i++) {
            list.add(index[i],nums[i]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
