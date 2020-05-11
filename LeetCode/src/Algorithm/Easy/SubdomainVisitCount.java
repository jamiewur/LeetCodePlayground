package Algorithm.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubdomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (String cd: cpdomains) {
            int times = Integer.parseInt(cd.split(" ")[0]);
            String s = cd.split(" ")[1];

            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == '.') {
                    String d = s.substring(i + 1);
                    map.put(d, map.getOrDefault(d, 0) + times);
                }
            }
            map.put(s, map.getOrDefault(s, 0) + times);
        }

        for (String d : map.keySet()) list.add(map.get(d) + " " + d);
        return list;
    }
}
