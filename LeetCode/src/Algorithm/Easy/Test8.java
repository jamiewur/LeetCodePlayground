package Algorithm.Easy;

import java.util.ArrayList;
import java.util.HashMap;

public class Test8 {
    public int solution(String[] T, String[] R) {
        // write your code in Java SE 8
        HashMap<Integer, Boolean> m = new HashMap<>();
        int len = T.length;
        Integer[] t = new Integer[len];
        for (int i = 0; i < T.length; ++i) {
            char c = T[i].charAt(len - 2);
            if (c < 10) {
                t[i] = Integer.parseInt(T[i].substring(len - 2, len - 1));
            } else t[i] = Integer.parseInt(T[i].substring(len - 1, len));
        }
        ArrayList<String> list=new ArrayList<String>();
        list.add("Wrong answer");
        list.add("Time limit exceeded");
        list.add("Runtime error");

        for (int j = 0; j < len; j++){
            boolean check = true;
            if ( list.contains(R[j]) ) {

                m.put(t[j], check);
            }
        }
        int res =
        return ;
    }

    public static void main(String[] args) {
//        Test7 t = new Test7();
//        String str = "1a";
//        String[] part = str.split("(?=\\d)(?<=\\D)");
//        System.out.println(part[0]);
        System.out.println(Integer.parseInt("test1a".substring(6 - 2, 6 - 1)));
    }
}
