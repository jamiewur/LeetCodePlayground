package Algorithm.Easy;

public class PrimeNumberSetBitsBinaryRepresentation {
    public int countPrimeSetBits(int L, int R) {
        int res = 0;
        for (int i = L; i <= R; i++){
            if (isBinaryPrime(i)) res++;
        }
        return res;
    }

    public boolean isBinaryPrime(int I) {
        int j = Integer.bitCount(I);
        if (j <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(j); i++) {
            if (j % i == 0) {
                return false;
            }
        }
        return true;
    }
}
