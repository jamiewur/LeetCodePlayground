package Algorithm.Easy;

import java.util.*;

public class UncommonWordsTwoSentences {
    //    public String[] uncommonFromSentences(String A, String B) {
//        List<String> a = new LinkedList<>(Arrays.asList(A.split(" ")));
//        List<String> b = new LinkedList<>(Arrays.asList(B.split(" ")));
//        // find the same part
//        HashSet<String> sh = new HashSet<>();
//        sh.addAll(a);
//        sh.addAll(b);
//        // get rid of the same part
//        List<String> c1 = new LinkedList<>(sh);
//        List<String> c2 = new LinkedList<>(sh);
//        c1.removeAll(a);
//        c2.removeAll(b);
//        c1.addAll(c2);
//        // return the result
//        return c1.toArray(new String[0]);
//
//    }
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> count = new HashMap<>();
        for (String w : (A + " " + B).split(" "))
            count.put(w, count.getOrDefault(w, 0) + 1);
        ArrayList<String> res = new ArrayList<>();
        for (String w : count.keySet())
            if (count.get(w) == 1)
                res.add(w);
        return res.toArray(new String[0]);
    }

    public static void main(String[] args) {
        UncommonWordsTwoSentences un = new UncommonWordsTwoSentences();
        System.out.println(un.uncommonFromSentences("a b c ", "a b f"));
    }
}
