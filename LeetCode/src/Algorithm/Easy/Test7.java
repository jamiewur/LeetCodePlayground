package Algorithm.Easy;

public class Test7 {
    public String solution(int T) {
        // write your code in Java SE 8
        int sec = T % 60;
        int min = T / 60 % 60;
        int hou = T / 60 /60;

        return hou + "h" + min + "m" + sec + "s";
    }

    public static void main(String[] args) {
        Test7 t = new Test7();
        System.out.println(t.solution(7500));
    }
}
