package Algorithm.Easy;

public class CheckIfInASortedArray {
    public boolean isMajorityElement(int[] nums, int target) {
        boolean isMajority = false;
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target) count++;
            if(count>n/2){
                isMajority = true;
                break;
            }
        }

        return isMajority;
    }
}
