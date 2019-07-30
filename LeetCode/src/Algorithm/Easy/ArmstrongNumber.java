package Algorithm.Easy;

public class ArmstrongNumber {
    public boolean isArmstrong(int N) {
        int digit = 1;
        int k = 0;
        int sum = 0;
        while(N/digit>=1){
            digit*=10;
            k++;
        }
        int O = N;
        for(int i=1;i<=k;i++){
            sum += Math.pow((int)(O/Math.pow(10,(k-i))),k);
            O -= (int)(O/Math.pow(10,(k-i)))* (Math.pow(10,(k-i)));
        }
        return sum == N;
    }
}
