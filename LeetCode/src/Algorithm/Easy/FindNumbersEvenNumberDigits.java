package Algorithm.Easy;

public class FindNumbersEvenNumberDigits {
    public int findNumbers(int[] nums) {
        int number = 0;
        int l = nums.length;

        for(int i=0;i<l;i++){
            int a = nums[i];
            int b = 0;
            while(a>0){
                a /= 10;
                b++;
            }
            if(b%2 == 0) number++;
        }
        return number;
    }
}
