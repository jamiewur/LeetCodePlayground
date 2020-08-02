package Algorithm.Easy;

public class Test6 {
    public String solution(String S, int K) {
        // write your code in Java SE 8
        String [] a = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int index = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i].equals(S)) index = i;
        }
        return a[(index + K) % 7];
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        System.out.println(t.solution("Wed", 2));
    }
}
