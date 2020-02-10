package Algorithm.Easy;

public class SubtractProductSumOfDigitsAnInteger {
    public int subtractProductAndSum(int n) {
        int sub = 0;
        int con = 1;
        int sum = 0;

        while(n>0){
            int l = n%10;
            con *= l;
            sum += l;
            n /= 10 ;
        }
        return con-sum;
    }
}
