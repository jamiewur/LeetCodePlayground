package Algorithm.Easy;

public class PeakIndexMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        int left = 0;
        int right = A.length-1;
        int current = (right - left)/2;
        while(current>0){
            if(A[current]-A[current-1]>0 && A[current]-A[current+1]<0){
                left = current;
                current=(current + right)/2;
            }
            else if(A[current]-A[current-1]<0 && A[current]-A[current+1]>0){
                right = current;
                current = (right - left)/2;
            }
            else break;
        }
        return current;
    }
}
