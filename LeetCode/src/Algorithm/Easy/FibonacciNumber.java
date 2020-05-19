package Algorithm.Easy;

public class FibonacciNumber {
    public int fib(int N) {
        if (N == 1 || N == 0) return N;
        return fib(N-1) + fib(N-2);
    }
}
